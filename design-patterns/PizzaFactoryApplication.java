

public class PizzaFactoryApplication {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();
        Pizza pizza = pizzaFactory.getPizza("Farmhouse");
        System.out.println(pizza.name);

        pizza = pizzaFactory.getPizza("Chicken Tikka");
        System.out.println(pizza.name);
    }
}

class PizzaFactory{
    private PizzaFactory(){}

    private static PizzaFactory INSTANCE = new PizzaFactory();

    public static PizzaFactory getInstance() {
        return INSTANCE;
    }

    public Pizza getPizza(String type) {
        if (type.equalsIgnoreCase("Farmhouse")) {
            return new FarmhousePizza();
        }

        if (type.equalsIgnoreCase("Chicken Tikka")) {
            return new ChickenTikkaPizza();
        }

        if (type.equalsIgnoreCase("Margerita")) {
            return new MargeritaPizza();
        }

        throw new RuntimeException("This Pizza is not yet available. Ask chef for a special request.");
    }
}


class Pizza {
    String name;
}
class FarmhousePizza extends Pizza {
    public FarmhousePizza() {
        this.name = "Farmhouse";
    }
}

class ChickenTikkaPizza extends Pizza {
    public ChickenTikkaPizza() {
        this.name = "Chicken Tikka";
    }
}
class MargeritaPizza extends Pizza {
    public MargeritaPizza() {
        this.name = "Margerita";
    }
}

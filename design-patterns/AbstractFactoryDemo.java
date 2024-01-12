package com.amazon.awdstoragefeemanager.exception;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractPizzaFactory dominos = PizzaFactoryProducer.getFactory("Dominos");
        AbstractPizzaFactory pizzaHut = PizzaFactoryProducer.getFactory("PizzaHut");

        Pizza pizza = dominos.getPizza(PizzaType.VEG);
        System.out.println(pizza.cook());

        pizza = pizzaHut.getPizza(PizzaType.VEG);
        System.out.println(pizza.cook());


        pizza = dominos.getPizza(PizzaType.NON_VEG);
        System.out.println(pizza.cook());

        pizza = pizzaHut.getPizza(PizzaType.NON_VEG);
        System.out.println(pizza.cook());

        pizza = pizzaHut.getPizza(PizzaType.PLAIN_CHEESE);
        System.out.println(pizza.cook());

        pizza = dominos.getPizza(PizzaType.PLAIN_CHEESE);
        System.out.println(pizza.cook());

    }
}

class PizzaFactoryProducer {
    public static AbstractPizzaFactory getFactory(String factory) {
        if (factory.equals("Dominos")) {
            return new DominosFactory();
        } else if (factory.equals("PizzaHut")) {
            return new PizzaHutFactory();
        }
        throw new RuntimeException("Factory not found");
    }
}

enum PizzaType {
    VEG,
    NON_VEG,
    PLAIN_CHEESE;
}
abstract class AbstractPizzaFactory {
    public abstract Pizza getPizza(PizzaType type );
}

class DominosFactory extends AbstractPizzaFactory {

    public Pizza getPizza(PizzaType type) {
        switch (type) {
            case VEG:
                return new Farmhouse();
            case NON_VEG:
                return new Peperoni();
            case PLAIN_CHEESE:
                return new Margerita();
            default:
                throw new RuntimeException("Pizza not found in Menu");
        }
    }
}

class PizzaHutFactory extends AbstractPizzaFactory {

    public Pizza getPizza(PizzaType type) {
        switch (type) {
            case VEG:
                return new Veggie();
            case NON_VEG:
                return new LoadedPeperoni();
            case PLAIN_CHEESE:
                return new SchezwanMargerita();
            default:
                throw new RuntimeException("Pizza not found in Menu");
        }
    }
}

interface Pizza {
    String cook();
}

class Farmhouse implements Pizza {

    @Override
    public String cook() {
        return "Cooking Farmhouse Pizza";
    }
}

class Peperoni implements Pizza {

    @Override
    public String cook() {
        return "Cooking Peperoni Pizza";
    }
}

class Margerita implements Pizza {


    @Override
    public String cook() {
        return "Cooking Margerita Pizza";
    }
}

class Veggie implements Pizza {

    @Override
    public String cook() {
        return "Cooking Veggie Pizza";
    }
}

class LoadedPeperoni implements Pizza {

    @Override
    public String cook() {
        return "Cooking Loaded Peperoni Pizza";
    }
}

class SchezwanMargerita implements Pizza {

    @Override
    public String cook() {
        return "Cooking Schezwan Margerita Pizza";
    }
}

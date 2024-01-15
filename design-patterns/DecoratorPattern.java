public class DecoratorPattern {
    public static void main(String[] args) {
        DecoratedBurger burger = new Burger();
//        DecoratedBurger tikkiBurger = new Tikki(burger);
//        DecoratedBurger cheeseBurger = new Cheese(tikkiBurger);

        System.out.println(burger.getPrice());
    }
}

abstract class DecoratedBurger {
    protected DecoratedBurger decoratedBurger;
    protected int price;


    public DecoratedBurger(DecoratedBurger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
        this.price = 0;
    }

    public DecoratedBurger() {}

    protected int getPrice() {
        if (decoratedBurger != null) {
            return decoratedBurger.getPrice() + price;
        }
        return price;
    }
}

class Burger extends DecoratedBurger {
    public Burger() {
        price = 10;
    }
}

class Tikki extends DecoratedBurger {

    public Tikki(DecoratedBurger decoratedBurger) {
        super(decoratedBurger);
        price = 5;
    }
}

class Cheese extends DecoratedBurger {

    public Cheese(DecoratedBurger decoratedBurger) {
        super(decoratedBurger);
        price = 3;
    }
}



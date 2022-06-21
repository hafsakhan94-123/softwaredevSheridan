package OOPSChallenge;

public class DeluxeHamburger extends BasicHamburger{

    public DeluxeHamburger(String name, String rollType, String meat) {
        super(name, rollType, 2, meat);
        super.additionalItem1Price("Chips",2);
        super.additionalItem2Price("Drinks",4);
    }

    @Override
    public void additionalItem1Price(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void additionalItem2Price(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void additionalItem3Price(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void additionalItem4Price(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }
}

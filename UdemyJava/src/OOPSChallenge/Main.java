package OOPSChallenge;

public class Main {
    public static void main(String[] args) {
        BasicHamburger burger = new BasicHamburger("Basic", "Bun", 2, "Beef");
        double price = burger.total();

        burger.additionalItem1Price("Tomato", 0.5);
        burger.additionalItem3Price("Onion", 0.5);
        burger.additionalItem2Price("Cheese", 1);
        burger.additionalItem4Price("Pickle", 1);
        System.out.println("Total price is " + burger.total());

        HealthyBurger health = new HealthyBurger(3.2, "Chicken");
        health.additionalItem5Price("Egg", 3);
        health.additionalItem6Price("Bacon", 4);
        System.out.println("Mew price is " + health.total());

        DeluxeHamburger db = new DeluxeHamburger("Cheese abd bacon", "Bread", "beef");
        System.out.println(db.total());
    }
}

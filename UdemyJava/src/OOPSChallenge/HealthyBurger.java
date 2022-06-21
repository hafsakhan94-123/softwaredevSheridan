package OOPSChallenge;

public class HealthyBurger extends BasicHamburger {
    private String additionalItem5;
    private double additionalItem5Price;

    private String additionalItem6;
    private double additionalItem6Price;

    public HealthyBurger(double basePrice, String meat) {
        super("Healthy", "Brown rye", basePrice, meat);
    }

    public void additionalItem5Price(String name, double price) {
        this.additionalItem5 = name;
        this.additionalItem5Price = price;
    }

    public void additionalItem6Price(String name, double price) {
        this.additionalItem6 = name;
        this.additionalItem6Price = price;
    }

    @Override
    public double total() {
        double hamburgerPrice = super.total();
        if (this.additionalItem5 != null) {
            hamburgerPrice += additionalItem5Price;
            System.out.println("Added " + this.additionalItem5 + " for an extra " + this.additionalItem5Price);
        }
        if (this.additionalItem6 != null) {
            hamburgerPrice += additionalItem6Price;
            System.out.println("Added " + this.additionalItem6 + " for an extra " + this.additionalItem6Price);
        }
        return hamburgerPrice;
    }
}
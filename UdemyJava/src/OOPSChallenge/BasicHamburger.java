package OOPSChallenge;

public class BasicHamburger {
    private String name;
    private String rollType;
    private double basePrice;
    private String meat;

    private String additionalItem1;
    private double additionalItem1Price;

    private String additionalItem2;
    private double additionalItem2Price;

    private String additionalItem3;
    private double additionalItem3Price;

    private String additionalItem4;
    private double additionalItem4Price;

    public BasicHamburger(String name, String rollType, double basePrice, String meat) {
        this.name = name;
        this.rollType = rollType;
        this.basePrice = basePrice;
        this.meat = meat;
    }

    public void additionalItem1Price(String name, double price) {
        this.additionalItem1 = name;
        this.additionalItem1Price = price;
    }

    public void additionalItem2Price(String name, double price) {
        this.additionalItem2 = name;
        this.additionalItem2Price = price;
    }

    public void additionalItem3Price(String name, double price) {
        this.additionalItem3 = name;
        this.additionalItem3Price = price;
    }

    public void additionalItem4Price(String name, double price) {
        this.additionalItem4 = name;
        this.additionalItem4Price = price;
    }

    public double total() {
        double hamburgerPrice = this.basePrice;
        System.out.println("Hamburger name: " + this.name + " on a " + this.rollType + " roll. " + " Price is: " + this.basePrice);
        if (this.additionalItem1 != null) {
            hamburgerPrice += additionalItem1Price;
            System.out.println("Added " + this.additionalItem1 + " for an extra " + this.additionalItem1Price);
        }
        if (this.additionalItem2 != null) {
            hamburgerPrice += additionalItem2Price;
            System.out.println("Added " + this.additionalItem2 + " for an extra " + this.additionalItem2Price);
        }
        if (this.additionalItem3 != null) {
            hamburgerPrice += additionalItem3Price;
            System.out.println("Added " + this.additionalItem3 + " for an extra " + this.additionalItem3Price);
        }
        if (this.additionalItem4 != null) {
            hamburgerPrice += additionalItem4Price;
            System.out.println("Added " + this.additionalItem4 + " for an extra " + this.additionalItem4Price);
        }
        return hamburgerPrice;
    }
}

package CompositionChallenge;

public class Sofa {
    private String manufacturer;
    private int legs;
    private int arms;

    public Sofa(String manufacturer, int legs, int arms) {
        this.manufacturer = manufacturer;
        this.legs = legs;
        this.arms = arms;
    }

    public void sit() {
        System.out.println("Sitting on the sofa");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLegs() {
        return legs;
    }

    public int getArms() {
        return arms;
    }
}

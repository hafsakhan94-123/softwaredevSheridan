package PolymorphismChallenge;

public class Car {
    private boolean engine;
    private int wheel;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheel = 4;
        this.cylinders = cylinders;
        this.name = name;
    }
    public void startEngine(){
        System.out.println("About to leave. The engine is starting!");
    }
    public void accelerate(){
        System.out.println("Road is clear. Press accelerate.");
    }
    public void brake(){
        System.out.println("Road blocked. Apply brakes!");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

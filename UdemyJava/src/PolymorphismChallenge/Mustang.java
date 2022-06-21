package PolymorphismChallenge;

public class Mustang extends Car{
    public Mustang(int cylinders, String name) {
        super(8, "Mustang");
    }

    @Override
    public void startEngine() {
        System.out.println("Mustang is on fire!");
    }

    @Override
    public void accelerate() {
        System.out.println("Go Mustang");
    }

    @Override
    public void brake() {
        System.out.println("Hit the brake Mustang!");
    }
}

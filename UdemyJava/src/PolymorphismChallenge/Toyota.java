package PolymorphismChallenge;

public class Toyota extends Car{
    public Toyota(int cylinders, String name) {
        super(6,"Toyota");
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota's engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Go toyota!!");
    }

    @Override
    public void brake() {
        System.out.println("Hit the breaks Toyota");
    }
}

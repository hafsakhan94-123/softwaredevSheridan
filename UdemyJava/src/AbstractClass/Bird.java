package AbstractClass;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flapping it's wing");
    }
}

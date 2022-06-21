package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Huskie");
        dog.breathe();
        dog.eat();

        //Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();
        Parrot parrot = new Parrot("Indian");
        parrot.breathe();;
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}

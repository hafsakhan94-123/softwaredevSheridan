package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println();
        Toyota toyota = new Toyota(6, "Figo");
        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();

        System.out.println();

        Mustang mustang = new Mustang(6, "Some Mustang car");
        mustang.startEngine();
        mustang.accelerate();
        mustang.brake();

        System.out.println();

        Lexus lexus = new Lexus(4, "Some Lexus car");
        lexus.startEngine();
        lexus.accelerate();
        lexus.brake();

    }


}

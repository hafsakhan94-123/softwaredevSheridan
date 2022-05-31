public class Main {
    public static void main(String[] args) {
        //car
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println("Model is: " + porsche.getModel());

        //bankAccount
//        bankAccount bob = new bankAccount("12345",0.00,"BOB","bob@gmail.com",23456789);
//        System.out.println(bob.getAccNumber());
//        bob.deposit(50.0);
//
//        bankAccount tim = new bankAccount("Tim","time@gmail.com",12345);
//        System.out.println(tim.getAccNumber() + " name: " + tim.getCusName());

        //VipCustomer
//        VipCustomer persone1 = new VipCustomer();
//        System.out.println(persone1.getName());
//
//        VipCustomer person2 = new VipCustomer(200,"bob@gmail.com");
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim",50000,"tim@gmail.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmail());

        //Animal
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Huskie",5,30,2,4,1,40,"long silky");
        dog.eat();
        dog.walk();
        //dog.run();

    }

}

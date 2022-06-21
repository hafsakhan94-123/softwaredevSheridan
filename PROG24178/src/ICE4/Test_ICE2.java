package ICE4;

import java.util.Scanner;

public class Test_ICE2 extends Triangle{
    public static void main(String[] args) {

        Triangle triangle2 = new Triangle();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 sides");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double s3 = scan.nextDouble();
        Triangle triangle1 = new Triangle(s1,s2,s3);
        System.out.println("Enter the color: ");
        scan.next();
        triangle1.setColor("Green");

        System.out.println("Enter a boolean value for filled: ");
        scan.nextBoolean();
        triangle1.setFilled(true);
        System.out.println();
        System.out.println(triangle1.toString());



    }
}

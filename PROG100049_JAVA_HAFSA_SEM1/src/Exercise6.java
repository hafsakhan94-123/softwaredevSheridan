import java.awt.image.MultiPixelPackedSampleModel;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        // 1
        String word1, word2;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word 1 ");
        word1=scan.next();
        System.out.println("Enter word 2 ");
        word2=scan.next();
        int newWord1 = word1.length();
        int newWord2 = word2.length();
        System.out.println(Math.min(newWord1,newWord2));

        // 2

        double a, b;

        System.out.println("Enter number a");
        a = scan.nextDouble();
        System.out.println("Enter number b");
        b = scan.nextDouble();
        double c = Math.pow(a,4);
        double d = Math.pow(b,2);
        double e = c - d;
        System.out.println(Math.cbrt(e));

        // 3

        String telephone;
        System.out.println("Enter telephone number in nnn-nnn-nnnn format");
        telephone = scan.next();
        System.out.println(telephone.replace('-',' '));

        // 4
        double radius;
        System.out.println("Enter radius with unit");
        radius = scan.nextDouble();
        String unit = scan.next();
        double circumference = 2*Math.PI*radius;

        System.out.println("The circumference of your circle is approximately "+ Math.round(circumference) + unit);







    }
}

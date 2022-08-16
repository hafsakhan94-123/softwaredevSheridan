import java.util.Scanner;

public class Exercise4B {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        /* PART I:
         * Prompt the user to enter the subtotal of the food s/he ordered
         * (not including the dollar sign).
         * Then prompt the user to enter the gratuity rate
         * (not including the percent sign).
         * Then prompt the user to enter the name of the restaurant
         * where s/he ate.  After calculating the total amount,
         * print out "Thank you for eating at <name of restaurant>!
         * Your total comes to <total amount including tip>".
         */

        //Your code for Part I goes here:
        double subTotal;
        System.out.println("What is your sub total? ");
        subTotal = myInput.nextDouble();

        double gratuityRate;
        System.out.println("What is your gratuity rate as a percentage");
        gratuityRate = myInput.nextDouble();

        String nameOfRestaurant;
        System.out.println("Enter the name of the restaurant ");
        nameOfRestaurant = myInput.next();


        double total = ((gratuityRate / 100) * subTotal) + subTotal;


        System.out.printf("Thank you for eating at %s! Your total comes to %.2f ", nameOfRestaurant, total);





        /* PART II:
         * Prompt the user to enter the radius of a circle
         * including the unit of measurement (e.g, inch, cm, m).
         * Calculate the perimeter and area of the circle.
         * Recall the perimeter = 2*radius*PI and the
         * area = PI*radius*radius. (You may assume PI is 3.14.)
         * Then display the resulting information including units.
         * For area, remember that the units will be squared.
         * For example, "square inches", square cm", etc.
         */

        double radius;
        radius = myInput.nextDouble();
        System.out.println("Enter radius");
        String unit = myInput.next();

        final float PI = 3.14f;
        double parameter = 2 * PI * radius;
        double area = PI * radius * radius;


        System.out.printf("The radius of your circle is %.2f %s", radius, unit);
        System.out.printf("\nThe parameter of your circle is %.2f %s", parameter, unit);
        System.out.printf("\nThe area of your circle is %.2f square%s", area, unit);



        /* PART III:
         * Prompt the user to enter 3 quiz grades -
         * an integer value between 0 and 100.
         * Calculate the average. Then prompt the user
         * to enter the course name.
         * Then display the resulting information as
         * in sample output
         */

        int grade1, grade2, grade3;
        System.out.println("Enter grade 1");
        grade1 = myInput.nextInt();
        grade2 = myInput.nextInt();
        grade3 = myInput.nextInt();

        int average = ((grade1 + grade2 + grade3) / 300) * 100;


    }

}


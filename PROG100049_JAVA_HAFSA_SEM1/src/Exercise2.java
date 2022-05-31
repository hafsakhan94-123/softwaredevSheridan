/**************************************************
 * Name:
 * Exercise 2: Fun with Mathematical Operators
 *
 * Follow the instructions specified in the line
 * comments to add the appropriate lines of code
 * Have fun!
 * *************************************************/
public class Exercise2 {

        public static void main(String[] args) {
            int remainder;
            int quotient;

/* 1. Write code below to store the remainder of dividing
      3125342 by 5543 in variable remainder and the quotient
      of this division in the variable quotient. */

            remainder= (3125342 % 5543);
            quotient = (3125342 / 5543);



            //Notice the following output statements and how the '+' is used
            System.out.println("The quotient is " + quotient);
            System.out.println("The remainder is " + remainder);

/* 2. Create a constant MONTHS_IN_YEAR of type int.
      Make its value 12.  */

            final int MONTHS_IN_YEAR = 12;

            System.out.println("The number of months in a year is " + MONTHS_IN_YEAR);

            int age = 25;
            int ageInMonths = 0;

/* 3. From age (which is in years and defined above), calculate
      the same age in months.
      Put this value in ageInMonths and print it. */

            age = 25*12;
            System.out.println("Age in months = " + age);




// 4. Declare a variable "mass" of type double initialized to 15.8
            double mass = 15.8;



/* 5. Declare a variable called "weight" of type double.
      Set its value to 0  */

            double weight = 0.0d;




// 6. Declare a constant G of type float and set its value to 9.8
            final float G = 9.8f;




/* 7. Calculate and print the weight by using the equation:
      weight = mass * G         */



            weight = mass * G;
            System.out.println("Weigt = " + weight);





            double x0 = 3.0;
            double v0 = 120.5;
            double t = 30.0;
            double a = 15.5;

/* 8. We know from basic mechanics that the location (x) of
      an object traveling at velocity v0 with acceleration a and
      initial location x0 after time t is given by
      x = x0 + v0/t + 1/2at^2  (See the Ex2_MathOperators.pdf for the formula.)
      Here declare a variable x and calculate its value using the
      given equation (and variables defined above) and print the result.     */

            double x;
            x = (x0) + (v0/t) + ((a*(t*t))/2);
            System.out.println("x = " + x );



        }
    }



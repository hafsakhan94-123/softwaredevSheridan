// Write code below this line to allow us access to the Scanner Class 
import java.util.Scanner;

public class Exercise4A {
  public static void main(String[] args) { 
    // Write code below this line to declare two variables "name" and "date" of type String
    
    String name;
    String date;
    
    // Write code below this line to declare a variable "hours" of type int
    
    int hours;
    
    // Write code below this line to declare two variables "payRate" and "grossPay" of type double
    
     double payRate;
     double grossPay;
    
    // Write code below this line to create a Scanner object to read input.
  
     Scanner scan = new Scanner(System.in);
    
    // Write code below this line to prompt the user to enter his/her name
      System.out.println("Enter your first name ");
      name = scan.next();

    
    
    // Write code below this line to get the name the user entered

      System.out.println("" + name);
    
    // Write code below this line to get the number of hours worked this week.
    // Don't forget to prompt the user!
      System.out.println("Enter the number of hours you worked this week");
      hours = scan.nextInt();
      System.out.println("" + hours);
    
    // Get the user's hourly pay rate.  Don't forget to prompt the user!
       System.out.println("Enter your pay rate per hour");

       payRate = scan.nextDouble();
       System.out.printf("Pay rate = %.2f", payRate);
    
    // Calculate the gross pay

      grossPay = payRate * hours;
      System.out.printf("\nGross pay = %.2f", grossPay);

   
    
    
    // Prompt the user to enter today's date (in any format) and read it in.
      scan.nextLine();
      System.out.println("\nEnter today's date");
      date = scan.nextLine();
      System.out.println("" + date);

    
    
    // Use printf to display the user's name, hours worked, pay rate and gross pay in a user friendly message
    //Example: Hello Sue Frank! Today is Sept. 20.  This week you worked 10 hours at $15.00/hr for a total payment of $150.00

      System.out.printf("Hello %s! Today is %s. This week you worked for %d hours at $%.2f/hr for a total payment of $%.2f", name, date, hours, payRate,grossPay);

    
 }
}

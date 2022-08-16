import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise9B {
    public static void main(String[] args) {
        int year, month;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month");
        month = scan.nextInt();

        System.out.println("Enter year");
        year = scan.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 100 != 0);
        boolean notLeapYear = (year % 4 == 0 && year % 100 == 0 || year % 400 == 0);


    }
}

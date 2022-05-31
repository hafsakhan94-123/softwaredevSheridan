import java.util.Scanner;

public class S4_SpeedConverter {

    public static double toMilesPerHour(double kilometersPerHour){
        double conversion;
        double round;
        boolean condition=(kilometersPerHour==0)?false:true;
        if(condition)
        {
            conversion=kilometersPerHour/1.6;
            round=Math.round(conversion);
            ;
        }else
            round = -1;
        return round;

    }
    public static void printConversion(double kilometersPerHour, double toMilesPerHour){
        boolean condition=(toMilesPerHour==-1)?false:true;
        if(condition)
        System.out.println(kilometersPerHour+" Km/h="+toMilesPerHour+" mi/h");
        else
            System.out.println("Zero Speed");
    }
    public static void main(String[] args){
        double kilometersPerHour;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter speed for conversion=");
        kilometersPerHour=read.nextDouble();

        printConversion(kilometersPerHour,toMilesPerHour(kilometersPerHour));
    }
}

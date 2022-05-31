import java.util.Scanner;

public class PointTest {
  
  public static void main(String[] args){
    
    Point p1, p2, p3;
    double x, y;
    double distance;
    
    //we create a Point and initialize it to (-1, -1) using the default constructor
    p1 = new Point();

    
    p1.printPoint();
    System.out.println(p1.toString());
    
    Scanner inputScanner = new Scanner( System.in );
    
    System.out.println("Enter the coordinates of P2");
    System.out.print("x: ");
    x=inputScanner.nextDouble();
    System.out.print("y: ");
    y=inputScanner.nextDouble();
    
    
    //Call the 1st version of the distance method passing in x and y as parameters, then print out the result


    System.out.println(p1.calcDistance(x,y));

    
    
    
    //Call a constructor to create a Point and initialize it to (x, y)
    p2 = new Point(x,y);
    
    //Call the 2nd version of the distance method and print out the result

    System.out.println(p1.calcDistance(p2));
    
    //Create p3 using default constructor 
    
    p3 = new Point();
    
    //prompt the user for the coordinates

    System.out.println("Enter coordinates of P3");
    System.out.println("x: ");
    x = inputScanner.nextDouble();

    System.out.println("y: ");
    y = inputScanner.nextDouble();
    
    
    //Use the set methods to modify the x and y values of p3 given what user has entered

     p3.setX(x);
     p3.setY(y);
    
    
    //Call the 3rd (static) version of the distance method and print out result 

    System.out.println(Point.calcDistance(p1,p2));
    
    //print out if p1 and p3 have the same coordinates by calling the equals method
    
    if(p1.equals(p3)){

      System.out.println(p1.getX() + p1.getY());

    }
    
  }
}
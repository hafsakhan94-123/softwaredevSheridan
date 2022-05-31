/*
 Using only four types of commands: robo.move(), robo.turnLeft(), robo.pickThing(); and robo.putThing()  
 have robot, the robot switch the positions of the yellow and blue things.  Assume that we cannot place more than 
 one thing on the same intersection.
 */
import java.awt.Color;
import becker.robots.*;

public class Switcharoo 
{
 public static void main(String[] args) 
 {
  // Instantiate the objects of the problem
  City city = new City();
  Thing blueThing = new Thing(city, 2, 2);
  blueThing.setColor(Color.BLUE);
  Thing yellowThing = new Thing(city, 2, 4);
  
  Robot robo = new Robot(city, 2, 3, Direction.NORTH);

  //DO NOT CHANGE ANYTHING ABOVE THIS LINE
  
  //PUT YOUR CODE HERE:
  robo.turnLeft();
  robo.move();
  robo.pickThing();
  robo.turnLeft();
  robo.turnLeft();
  robo.move();
  robo.move();
  robo.pickThing();
  robo.putThing(blueThing);
  robo.turnLeft();
  robo.turnLeft();
  robo.move();
  robo.move();
  robo.putThing(yellowThing);

 }
}

/**
 * TorontoLights
 * -----------------------
 * A robot is at the intersection of Street 2
 * and Avenue 3 facing west.  The next 3
 * intersections to it�s east have flashers.
 * Instruct the robot to pick up the flashers
 * and place them in a line extending south
 * one intersection from where the robot started.
 */

import becker.robots.*;

public class TorontoLights {
    public static final boolean IS_ON = true;

    public static void main(String[] arg) {
        // Problem setup
        City toronto = new City();
        Robot Robert = new Robot(toronto, 2, 3, Direction.WEST);
        Flasher f1 = new Flasher(toronto, 2, 4, IS_ON);
        Flasher f2 = new Flasher(toronto, 2, 5, IS_ON);
        Flasher f3 = new Flasher(toronto, 2, 6, IS_ON);

  /* For Robert to move, use "Robert.move();"
   For Robert to turn left, use "Robert.turnLeft();"
   For Robert to pick something up, use "Robert.pickThing();"
   For Robert to put something down, use "Robert.putThing();"
  */

        /* YOUR CODE GOES HERE */
        Robert.turnLeft();
        Robert.turnLeft();
        Robert.move();
        Robert.pickThing();
        Robert.move();
        Robert.pickThing();
        Robert.move();
        Robert.pickThing();
        Robert.turnLeft();
        Robert.turnLeft();
        Robert.move();
        Robert.move();
        Robert.move();
        Robert.turnLeft();
        Robert.move();
        Robert.putThing();
        Robert.move();
        Robert.putThing();
        Robert.move();
        Robert.putThing();
        Robert.turnLeft();
        Robert.turnLeft();
        Robert.move();
        Robert.move();
        Robert.move();
        Robert.turnLeft();


    }
}
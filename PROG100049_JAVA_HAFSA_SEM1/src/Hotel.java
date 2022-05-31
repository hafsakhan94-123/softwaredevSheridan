
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;



/*
 * gil is a cleaning robot in a hotel.  People who stay in the
 * hotel frequently leave Things in their room.  Program gil
 * to go pick up all the Things in the hotel.
 */

public class Hotel 
{
 
 // If you want a challenge, change this to true!
 static final boolean MAKE_IT_HARDER = true;
 

 
 public static void main(String[] args)
 {  
  Robot gil = setup();
  room(gil);


 } 
 
public static void turnRight(Robot r){


  for(int i =0 ; i<3; i++){
   r.turnLeft();
  }
}

public static void movePlaces(Robot r, int place){
  for(int b = 0 ; b < place ; b++ ){
   r.move();
  }

}

public static void turnAround(Robot r){

  for(int a = 0 ; a<2 ; a++){
   r.turnLeft();
  }

}
public static void room(Robot r){
  turnRight(r);
  while (!(r.frontIsClear())){
   r.turnLeft();
   movePlaces(r,4);
   turnAround(r);
  }

}

 public static void another(Robot r){

 }

 
 
 
 
 /***********************************************************************/
 /* The code below sets up the scenario.  Please do not change anything.*/
 /***********************************************************************/
 
 
 static final int WIDTH = 20;
 static final int CORRIDOR_DEPTH = 5;
 static final int[] CORRIDORS = {2, 5, 6, 8, 11, 12, 13, 17,18};
 static Robot setup() {
  City city = new City(0, 0, 7, WIDTH);
  Robot robot = new Robot(city, 1, 1, Direction.EAST);
  new Wall(city, 1, 1, Direction.WEST);
  new Wall(city, 1, WIDTH-2, Direction.EAST);
  int j =0;
  for (int i = 1; i <= WIDTH-2; i++) {
   new Wall(city, 1,i, Direction.NORTH);
   if (    (MAKE_IT_HARDER && Math.random() < .6) 
        || (!MAKE_IT_HARDER && j < CORRIDORS.length && i == CORRIDORS[j])) {
    int k;
    for (k = 1; k < CORRIDOR_DEPTH; k++) {
     new Wall(city, k + 1, i, Direction.WEST);
     new Wall(city, k + 1, i, Direction.EAST);
    }
    new Thing(city, k, i);
    new Wall(city, k, i, Direction.SOUTH);
    j++;
   } else {
    new Wall(city, 1,i, Direction.SOUTH);
   }
  } 
  return robot;
 }

 
}
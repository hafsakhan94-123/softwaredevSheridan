public class CourseClient {
 public static void main(String [] args)
 {
  // Below there are a number of tests to write.  If a test fails, you should print out the
  // error.  If you wish, when a test fails you may crash the program using the following
  // syntax:
  // throw new Error("Some Error Message"); e.g. throw new Error("getCourseName does not return correct value");
  
  
  // First, create an object with the no-arg constructor.  Use the toString method
  // attributes have been properly initialized.
  Course courseObject = new Course();
  System.out.println(courseObject);
  
  
   
  // Create another object using the constructor with valid parameters.  Use the toString method to 
  // check that the attributes have been properly initialized.
  Course newObject = new Course("hafsa","code",1,5);
  System.out.println(newObject);
  
  
  
  // Create another object using the constructor with parameters.  Use null for the course name and 
  // code parameters and invalid values for the course credit and max. capacity parameters.
  // Use the toString method to check that the attributes have been properly initialized
  Course anotherObject = new Course(null,null,-1,-2);
  
  
  
  
  // For the rest of the tests, you can re-use the objects you created in the previous part.
  // Set the course name using the mutator.  Use the accessor to check that the name has
  // been changed properly.
  newObject.setCourseName("Java");
  if (!(newObject.getCourseName().equals("Java")))
   throw new Error("Name not changed");
  
  
  
  // Set the course name to null using the mutator.  Use the accessor to make sure the name has not
  // actually been changed.
  newObject.setCourseName(null);
  if(!(newObject.getCourseName().equals("Java")))
   throw new Error("Problem in setCourseName with null value");

  
  
  // Set the course code using the mutator.  Use the accessor to check that the code has
  // been changed properly.
  newObject.setCourseCode("1java1");
  if(!(newObject.getCourseCode().equals("1java1")))
   throw new Error("Course code not set");

  
  
  
  // Set the course code to null using the mutator.  Use the accessor to make sure the code has not
  // actually been changed.
  newObject.setCourseCode(null);
  if(!(newObject.getCourseCode().equals("1java1")))
   throw new Error("Problem in setCourseName with null value");
  
  
  
  // Add some students when the course is not full.  Using the accessor method for number of students, 
  // check to make sure the number of students is correct.

  if(newObject.getMaxCapacity() < 30){
   newObject.getNumOfStudents();
  }
  
  
  
  
 // Add some students when the course is full.  Using the accessor method for number of students, 
  // check to make sure no more students have been added and that an error message has been printed.
  if (newObject.getMaxCapacity() == 30){
   newObject.getNumOfStudents();
   throw new Error("Max capacity reached");
  }
  
  
  
  // Use the restartCourse method.  Using the accessors, check to make sure the number of students is 0.
  
  
  
  // invoke the isFull method.  Make sure the value returned is true when the number of students is greater
   //than the capacity
  
  
  
  // invoke the isFull method.  Make sure the value returned is false when the number of students is not
   // greater than the capacity
  
  
  
 
  
 }
}

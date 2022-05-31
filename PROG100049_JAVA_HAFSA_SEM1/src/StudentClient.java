/* A client program to display Student object values */


public class StudentClient
{


 public static void main(String [] args )
 {

  /* Instantiate the student using an empty argument list  */
  Student student1 = new Student();


  /* Set the firstName to John */
  student1.setFirstName( "John" );
  System.out.println("If you did this correctly, it should print out John >> " + student1.getFirstName());

  String last = null; //last is declared as a String but it is not instantiated yet
  
  /* Attempt to set the last name to a null String */
  student1.setLastName(last);
  System.out.println("If you did this correctly, it should print out >> " + student1.getLastName());
  
   /* Set the lastName to Simpson */
  last = "Simpson";
  student1.setLastName(last);
  System.out.println("If you did this correctly, it should print out Simpson >> " + student1.getLastName());

  /* Set the studentNum to -12341234 */
  student1.setStudentNum( -12341234 );
  System.out.println("If you did this correctly, it should print out -1 >> "+ student1.getStudentNum());

  /* Set the studentNum to 12341234 */
  student1.setStudentNum( 12341234 );
  System.out.println(student1.getStudentNum());

  /* Attempt to set the gpa to 5.0 */
  student1.setGpa( 5.0f );
  System.out.println("If you did this correctly, it should print out 0.0 >> " + student1.getGpa());


  /* Attempt to set the gpa to 3.5 */
  student1.setGpa(3.5f );
  System.out.println(student1.getGpa());

  /*  Instantiate a second student object using non-default constructor*/
  Student student2 = new Student("Gregory", "Schofield", 12345678, 4.0f );


  /* Print out student1 and student2 */
  System.out.println(student1.toString());
  System.out.println(student2.toString());

  /* Determine if student1 and student2 are equal */ 
  System.out.println("Is student1 the same as student2? Should be FALSE>> " + student1.equals(student2));

  /* Determine if student1 and student1 are equal */ 
  System.out.println("Is student1 the same as student1? Should be TRUE>> " + student1.equals(student1));

 }

}

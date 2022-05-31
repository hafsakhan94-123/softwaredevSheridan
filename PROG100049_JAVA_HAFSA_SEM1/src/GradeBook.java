import java.util.Scanner; // program uses class Scanner

public class GradeBook 
{
  private String courseName; // name of course this GradeBook represents
  private String courseInstructor;
  private int noOfStudents;
  
  // constructor initializes courseName
  public GradeBook( String name, String instructor, int students )
  {
    courseName = name; // initializes courseName
    courseInstructor = instructor;
    noOfStudents = students;

  } // end constructor

  
  // method to set the course name
  public void setCourseName( String name )
  {
    courseName = name; // store the course name
  } // end method setCourseName

  public void setCourseInstructor(String instructor){
    courseInstructor = instructor;
  }

  public void setNoOfStudents(int students){
    noOfStudents = students;

  }

  public String getCourseInstructor(){
    return courseInstructor;
  }
  public int getNoOfStudents(){
    return noOfStudents;
  }
  // method to retrieve the course name
  public String getCourseName()
  {
    return courseName;
  } // end method getCourseName
  
  // display a welcome message to the GradeBook user
  public void displayMessage()
  {
    // getCourseName gets the name of the course
    System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
                      getCourseName(), getNoOfStudents() );
  } // end method displayMessage
  public void classAverage(){
    float sum = 0;
    float grade;
    Scanner input = new Scanner(System.in);
    for(int i=0 ; i <noOfStudents ; i++ )
    {
      System.out.println("Enter grade");
      grade = input.nextFloat();
      sum += grade;
      
    }
    float avg = sum/noOfStudents;
    System.out.println(avg);

  }
}


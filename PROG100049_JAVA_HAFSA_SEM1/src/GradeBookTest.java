public class GradeBookTest {
    // main method begins program execution
    public static void main(String[] args) {
        // create GradeBook object
        GradeBook gradeBook1 = new GradeBook("PROG 10082 Introduction to Java Programming", "Hoda Fahmy", 5);

        // display initial value of courseName for each GradeBook
        System.out.printf("gradeBook1 course name is: %s\n",
                gradeBook1.getCourseName());

        gradeBook1.displayMessage();
        gradeBook1.classAverage();
    }
}

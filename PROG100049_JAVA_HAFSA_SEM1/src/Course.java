/**
 * Objects of this class represent a college course.
 */
public class Course {

    /*
     * Object instance variables
     */

    private String courseName;
    private String courseCode;
    private int numOfCredits;
    private int numOfStudents;
    private int maxCapacity;

    /**
     * Create a new course.  The course name will be named "", and the course code will be
     * named "", and the maximum capacity will be 30
     */
    public Course() {
        // numOfCredits and numOfStudents default to 0, so don't need to set them explicitly
        courseName = "";
        courseCode = "";
        maxCapacity = 30;
    }

    /**
     * Create a new course.
     *
     * @param name     The course name
     * @param code     The course code
     * @param credit   The number of credits assigned to this course
     * @param capacity The max. capacity for this course
     */

    public Course(String name, String code, int credit, int capacity) {
        if (name == null) {
            name = "";
        } else {
            name = courseName;
        }
        if (code == null) {
            code = "";
        } else {
            code = courseCode;
        }
        setCourseCredit(credit);

        if (capacity < 0)
            maxCapacity = 30;
        else maxCapacity = capacity;
    }

    /**
     * Accessor method
     *
     * @return The course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Accessor method
     *
     * @return The course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Get the number of credits assigned to this course
     */
    public int getNumOfCredits() {
        return numOfCredits;
    }

    /**
     * Get the current number of students enrolled in the course
     */
    public int getNumOfStudents() {
        return numOfStudents;
    }

    /**
     * Get the maximum capacity for this course
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Indicate that a student has been added to the course only if the course has not reached capacity.
     */
    public void addStudentToCourse() {
        boolean full = isFull();
        if (full = true)
            System.out.println("Course is FULL");
        else numOfStudents = +1;
    }


    /**
     * Restart the course.  This resets number of students enrolled in the course to 0
     */
    public void restartCourse() {
        numOfStudents = 0;
    }

    /**
     * Mutator method.  This sets course's name.  If the new name is null, then
     * the course name is not changed.
     */
    public void setCourseName(String newName) {
        if (!newName.equals(null)) {
            courseName = newName;
        }
    }

    /**
     * Mutator method.  This sets the course code.  If the new name is null, then
     * the course code is not changed.
     */
    public void setCourseCode(String newName) {
        if (newName != null) {
            courseName = newName;
        }
    }

    /**
     * Mutator method.  This sets the course credit number.  If the new credit number is negative or
     * greater than 12, the course code is not changed.
     */
    public void setCourseCredit(int newCredit) {
        if ((newCredit > 0) || (newCredit < 13)) {
            numOfCredits = newCredit;
        }
    }

    /**
     * Mutator method.  This sets the maximum capacity of the course.  If the capacity is negative,
     * the capacity is not changed.
     */
    public void setMaxCapacity(int newCapacity) {
        if (newCapacity >= 0) {
            maxCapacity = newCapacity;
        }
    }

    /**
     * Return true if the course enrollment has reached capacity and false otherwise
     */
    public boolean isFull() {
        if (numOfStudents < maxCapacity)
            return false;
        return true;
    }


    /**
     * Return a String representing a Course object
     */
    public String toString() {
        return ("Course name: " + courseName + "\t\tCourse code: " + courseCode +
                "\nNumber of credits: " + numOfCredits + "\t\tNumber of students: " + numOfStudents +
                "\t\tMaximum capacity: " + maxCapacity);
    }
}

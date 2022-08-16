/* Student class */

public class Student {
    /**
     * 1. ***** Define the instance variables  *****
     * firstName is a String
     * lastName is a String
     * studentNum is an int
     * gpa is a float
     */
    private String firstName;   //default is null
    private String lastName;
    private int studentNum; //default is 0
    private float gpa;  //default is 0


    /**
     * 2. ***** Write this method *****
     * No-argument Constructor:
     * Method Name: Student
     * Return Value:  none
     * Parameters: none
     * Function: initializes the instance variables
     * firstName and lastName to empty string,
     * studentNum to -1 and gpa to 0.0
     */
    public Student() {
        firstName = "";
        lastName = "";
        studentNum = -1;
    }


    /**
     * 3. ***** Write this method *****
     * Overloaded constructor:
     * Method Name: Student
     * Return Value: none
     * Parameters:  a String first, a String last, an int number, and a float grade
     * Function:
     * initializes firstName to first only if non-null, otherwise set to ""
     * initializes lastName to last only if non-null, otherwise set to ""
     * initializes studentNum to number only if positive, otherwise set to -1
     * initializes gpa to grade only if it is between 0.0 and 4.0 (incl.), otherwise keep as 0
     */
    public Student(String first, String last, int num, float g) {
        if (first != null) {
            firstName = first;
        }
        if (last != null) {
            lastName = last;
        }
        if (num > 0) {
            studentNum = num;
        } else {
            studentNum = -1;
        }
        if (g >= 0.0 && g <= 4.0) {
            gpa = g;
        }
    }


    /**
     * 4. ***** Write this method *****
     * Accessor method for the firstName instance variable
     * Method Name: getFirstName
     * Return Value: String
     * Parameters: none
     * Function: returns firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * 5. ***** Write this method *****
     * Accessor method for the lastName instance variable
     * Method Name: getLastName
     * Return Value: String
     * Parameters: none
     * Function: returns lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * 6 ***** Write this method *****
     * Accessor method for the studentNum instance variable
     * Method Name: getStudentNum
     * Return Value: int
     * Parameters: none
     * Function: returns studentNum
     */
    public int getStudentNum() {
        return studentNum;
    }


    /**
     * 7. ***** Write this method *****
     * Accessor method for the gpa instance variable
     * Method Name: getGpa
     * Return Value: float
     * Parameters: none
     * Function: returns gpa
     */
    public float getGpa() {
        return gpa;
    }


    /**
     * 8. ***** Write this method *****
     * Mutator method for the firstName instance variable
     * Method Name: setFirstName
     * Return Value: void
     * Parameters: String newFirstName
     * Function: assigns firstName the value of the
     * newFirstName parameter only if it is non-null
     */
    public void setFirstName(String newFirstName) {
        if (newFirstName != null) {
            firstName = newFirstName;
        }
    }


    /**
     * 9. ***** Write this method *****
     * Mutator method for the lastName instance variable
     * Method Name: setLastName
     * Return Value: void
     * Parameters: String newLastName
     * Function: assigns lastName the value of the
     * newLastName parameter only if it is non-null
     */
    public void setLastName(String newLastName) {
        if (newLastName != null) {
            lastName = newLastName;
        }
    }


    /**
     * 10. ***** Write this method *****
     * Mutator method for the studentNum instance variable
     * Method Name: setStudentNum
     * Return Value: void
     * Parameters: int newStudentNum
     * Function: assigns studentNum the value of the
     * newStudentNum parameter; checks
     * that it is a positive number
     */
    public void setStudentNum(int newStudentNum) {
        if (newStudentNum > 0) {
            this.studentNum = newStudentNum; //this points to instance variable and its value
        }
    }


    /**
     * 11. ***** Write this method *****
     * Mutator method for the gpa instance variable
     * Method Name: setGpa
     * Return Value: void
     * Parameters: float newGpa
     * Function: assigns gpa the value of the
     * newGpa parameter; checks that newGpa
     * is a number between 0.0 and 4.0 inclusive
     */
    public void setGpa(float newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            gpa = newGpa;
        }
    }


    /**
     * 12. ***** Write this method *****
     * Method Name: equals
     * Return Value: boolean
     * Parameters: Student anotherStudent
     * Function: checks if the calling Student and anotherStudent are the same
     * (if first and last names are equal as well as studentNum)
     */
    public boolean equals(Student anotherStudent) {
        if (this.firstName.equals(anotherStudent.firstName) && this.lastName.equals(anotherStudent.lastName) && this.studentNum == anotherStudent.studentNum)
            return true;

        return false;
    }


    /**
     * 13. ***** Write this method *****
     * Method Name: toString
     * Return Value: String
     * Parameters: none
     * Function: returns the value of the calling Student as a string in the form
     * firstName lastName studentNum gpa
     */
    public String toString() {
        return firstName + " " + lastName + " " + studentNum + " " + gpa;
    }


}

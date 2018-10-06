/**
 * importing the Date class.
 */
import java.util.Date;
/**
 * Class for student.
 */
class Student {
    String studentname;
    String date;
    int subject1;
    int subject2;
    int subject3;
    int totalmarks;
    String reservationcategory;
    /**
     * Constructs the object.
     */
    Student() {
        /**
         * Empty Constructor.
         */

    }
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    Student(final String input) {
        String[] inp = input.split(",");
        studentname = inp[0];
        date = getDate();
        subject1 = Integer.parseInt(inp[2]);
        subject2= Integer.parseInt(inp[3]);
        subject3 = Integer.parseInt(inp[4]);
        totalmarks = Integer.parseInt(inp[5]);
        reservationcategory = inp[6];
    }

    /**
     * Constructs the object.
     *
     * @param      studentname1          The studentname 1
     * @param      date1                 The date 1
     * @param      sub1                  The sub 1
     * @param      sub2                  The sub 2
     * @param      sub3                  The sub 3
     * @param      totalmarks1           The totalmarks 1
     * @param      reservationcategory1  The reservationcategory 1
     */
    Student(String studentname1, String date1, int sub1,
     int sub2, int sub3, int totalmarks1,
      String reservationcategory1) {
       this.studentname = studentname;
       this.date = date1;
       this.subject1 = sub1;
       this.subject2 = sub2;
       this.subject3 = sub3;
       this.totalmarks = totalmarks1;
       this.reservationcategory = reservationcategory1;
    }
    /**
     * Gets the student name.
     *
     * @return     The student name.
     */
    public String getStudentName(){
        return studentname;
    }

    /**
     * Gets the date.
     *
     * @return     The date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the subject 1.
     *
     * @return     The subject 1.
     */
    public int getSubject1() {
        return subject1;
    } 

    /**
     * Gets the subject 2.
     *
     * @return     The subject 2.
     */
    public int getSubject2() {
        return subject2;
    }
    /**
     * Gets the subject 3.
     *
     * @return     The subject 3.
     */
    public int getSubject3() {
        return subject3;
     }
    /**
     * Gets the total marks.
     *
     * @return     The total marks.
     */
    public int getTotalMarks() {
        return totalmarks;
     }
    /**
     * Gets the reservation category.
     *
     * @return     The reservation category.
     */
    public String getReservationCategory() {
        return reservationcategory;
     }



    /**
     * compares the comparable Student objects.
     * Time Complexity : 1
     *
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo (Student other) {
        if (this.totalmarks > other.totalmarks) {
            return 1;
        }
        if (this.totalmarks < other.totalmarks) {
            return -1;
        }
        if (this.subject3 > other.subject3) {
           return 1;
        }
        if (this.subject3 < other.subject3){
            return -1;
        }
        if (this.subject2 > other.subject2) {
           return 1;  
        }
        if (this.subject2 < other.subject2) {
             return -1;
        }
        // if ((int)this.date > (int) other.date) {
        //    return 1;
  
        // }
        return 0;
    }

    /**
     * Returns a string representation of the object.
     * Time Complexity 1
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        return str + getStudentName() + " " + getTotalMarks()
            + " " + getReservationCategory();
     }



}
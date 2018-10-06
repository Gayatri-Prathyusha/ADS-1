/**
 * importing the Date class.
 */
import java.util.Date;
/**
 * Class for student.
 */
class Student {
    private String studentname;
    private Date date;
    private int subject1;
    private int subject2;
    private int subject3;
    private int totalmarks;
    private String reservationcategory;
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
        subject2= Integer.parseInt(inp[2 + 1]);
        subject3 = Integer.parseInt(inp[2 + 2]);
        totalmarks = Integer.parseInt(inp[2 + 2 + 1]);
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
    Student(final String studentname1, final Date date1,final int sub1,
     final int sub2, final int sub3, final int totalmarks1,
      final String reservationcategory1) {
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
    public String getStudentName() {
        return studentname;
    }

    /**
     * Gets the date.
     *
     * @return     The date.
     */
    public Date getDate() {
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
    public int compareTo(final Student other) {
        if (this.totalmarks > other.totalmarks) {
            return 1;
        }
        if (this.totalmarks < other.totalmarks) {
            return -1;
        }
        if (this.subject3 > other.subject3) {
           return 1;
        }
        if (this.subject3 < other.subject3) {
            return -1;
        }
        if (this.subject2 > other.subject2) {
           return 1;
        }
        if (this.subject2 < other.subject2) {
             return -1;
        }
        // if (this.date > other.date) {
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

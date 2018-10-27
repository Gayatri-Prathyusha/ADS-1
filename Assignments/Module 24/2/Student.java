/**
 * Class for student.
 */
class Student {
    /**
     * Roll number.
     */
    private int rollNumber;
    /**
     * Name.
     */
    private String name;
    /**
     * Marks.
     */
    private double marks;

    /**
     * Constructs the object.
     *
     * @param      roll   The roll number
     * @param      studentname    Name
     * @param      marks1  The marks
     */
    Student(final int roll, final String studentname, final double marks1) {
        this.rollNumber = roll;
        this.name = studentname;
        this.marks = marks1;
    }

    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the marks.
     *
     * @return     The marks.
     */
    public double getMarks() {
        return this.marks;
    }
}

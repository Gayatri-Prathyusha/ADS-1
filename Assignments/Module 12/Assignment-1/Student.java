import java.util.Date;
class Student {
    String studentname;
    Date date;
    int subject1;
    int subject2;
    int subject3;
    int totalmarks;
    String reservationcategory;
    Student() {

    }
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

    Student(String studentname1, Date date1, int sub1,
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
    public String getStudentName(){
        return studentname;
    }

    public Date getDate() {
        return date;
    }

    public int getSubject1() {
        return subject1;
    } 

    public int getSubject2() {
        return subject2;
    }
     public int getSubject3() {
        return subject3;
     }
     public int getTotalMarks() {
        return totalmarks;
     }
     public String getReservationCategory() {
        return reservationcategory;
     }
     public String toString() {
        String str = "";
        return str + getStudentName() + " " + getTotalMarks()
            + " " + getReservationCategory();
     }



}
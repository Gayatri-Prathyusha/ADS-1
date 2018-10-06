import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for Solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    public static Student[] seatsFilled (final Student[] stus,
                                         final int totV,
                                         final int unres,
                                         final int bc, final int sc,
                                         final int st) {

        Student[] seats = new Student[totV];
        for (int i = 0; i < unres; i++) seats[i] = stus[i];
        int filled = unres;
        int totSz = stus.length;

        for (int i = filled; bc > 0 && i < totSz; i++) {
            if (filled < unres + bc && stus[i].getReservationCategory().equals("BC")
                    && filled <= totV) {
                seats[filled] = stus[i];
                filled += 1;
            }
        }

        for (int i = filled; st > 0 && i < totSz; i++) {
            if (filled < unres + bc + st && stus[i].getReservationCategory().equals("ST")
                    && filled <= totV) {
                seats[filled] = stus[i];
                filled += 1;

            }
        }
        // System.out.println(filled);

        for (int i = filled; sc > 0 && i < totSz; i++) {
            if (filled < unres + bc + st + sc &&
                stus[i].getReservationCategory().equals("SC")
                    && filled <= totV) {
                seats[filled] = stus[i];
                filled += 1;
            }
        }

        return seats;
    }
    /**
     * Main function - reads in inputs and prints the output to console.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentsQualified = Integer.parseInt(sc.nextLine());
        int noofvacancies = Integer.parseInt(sc.nextLine());
        int unreserved = Integer.parseInt(sc.nextLine());
        int noofBC = Integer.parseInt(sc.nextLine());
        int noofSC = Integer.parseInt(sc.nextLine());
        int noofST = Integer.parseInt(sc.nextLine());
        int N = studentsQualified;
        int size = 0;
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            Student eachStudent = new Student(sc.nextLine());
            students[size++] = eachStudent;
        }
        sc.close();
        MergeSort.sort(students);
        for (int i = 0; i < N; i++) {
            System.out.println(students[i]);
    
        }
        System.out.println();
        Student[] filledSeats = seatsFilled(students,
                                            noofvacancies, unreserved,
                                            noofBC, noofSC, noofST);
        for (int i = 0; i < noofvacancies; i++) {
             System.out.println(filledSeats[i]);
        }
    }
}
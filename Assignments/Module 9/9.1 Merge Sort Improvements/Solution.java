import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     * Time complexity of this method is O(1).
     */
    private Solution() {
        //Unused Constructor.
    }
    /**
     * {Client Program}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Merge m = new Merge();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            m.sort(tokens);
            System.out.println(m.show(tokens));
            System.out.println();
        }
    }
}

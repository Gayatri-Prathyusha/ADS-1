/**
 * Scanner for checkstyle.
 */
import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * Empty constructor.
         */
    }
    /**
     * Main Function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while(s.hasNextLine()) {
            String[] input = s.nextLine().split(" ");
            switch (input[0]) {
                case "insertAt":
                try {
                list.insertAt(Integer.parseInt(input[1]), input[2]);
                System.out.println(list);
            }
                catch (Exception e) {
                    System.out.println("Can't insert at this position.");
                }
                break;
                case "reverse":
                try {
                list.reverse();
                System.out.println(list);
            }
                catch(Exception e) {
                System.out.println("No elements to reverse.");
                }
                break;
        default:
        break;

        }
    }
}

}

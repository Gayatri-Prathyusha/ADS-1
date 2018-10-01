import java.util.Scanner;
/**
 * Solution class for main.
 */
public final class Solution {
    /**
     * Empty Constructor for checkstyle.
     */
    private Solution() {

    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc =  new Scanner(System.in);
        Steque steak = new Steque();
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {

            while (sc.hasNext()) {
                String[] tokens = sc.nextLine().split(" ");
                switch (tokens[0]) {
                    case "push":
                    steak.push(Integer.parseInt(tokens[1]));
                    break;
                    case "pop":
                    steak.pop();
                    break;
                    case "enqueue":
                    steak.enqueue(Integer.parseInt(tokens[1]));
                    break;
                    default:
                    steak = new Steque();
                    break;
                    }
                }
            }
        }

    }
}

import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Empty.
    }
    /**
     * {Main method}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 = Integer.parseInt(scan.nextLine());
        int s2 = Integer.parseInt(scan.nextLine());
        int[] ar1 = new int[s1];
        int[] ar2 = new int[s2];
        if (s1 > 0) {
            String[] tokens = scan.next().split(",");
            for (int i = 0; i < s1; i++) {
                ar1[i] = Integer.parseInt(tokens[i]);
            }
        }
        if (s2 > 0) {
            String[] tokens1 = scan.next().split(",");
            for (int i = 0; i < s2; i++) {
                ar2[i] = Integer.parseInt(tokens1[i]);
            }
        }
        SortedArray sa = new SortedArray(ar1, ar2);
        int[] a = sa.sort(ar1, ar2);
        System.out.println(Arrays.toString(a).substring(
            1, Arrays.toString(a).length() - 1).replace(" ", ""));
    }
}

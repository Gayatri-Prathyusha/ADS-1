import java.util.Scanner;
/**
 * class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Percolation p = new Percolation(n);
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(" ");
            p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
        System.out.println(p.percolates() && p.findOpenSites() != 0);
    }
}

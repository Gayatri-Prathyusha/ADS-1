import java.util.Scanner;
/**
 * Class for cube sum.
 */
class CubeSum implements Comparable<CubeSum> {
    /**
     * sum.
     */
    public final int sum;
    /**
     * i.
     */
    public final int i;
    /**
     * j.
     */
    public final int j;
    /**
     * Constructs the object.
     *
     * @param      i     i.
     * @param      j     j.
     */

    public CubeSum(final int i, final int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }
    /**
     * { function_description }
     *
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */

    public int compareTo(final CubeSum other) {
        if (this.sum < other.sum) {
            return -1;
        }
        if (this.sum > other.sum) {
            return +1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */

    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }
}
/**
 * client solution.
 */

public final class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {
        //check style purpose.
    }
    /**
     * main function.
     *
     * @param      args  The arguments.
     */
    public static void main(String[] args) {
        int n = 800;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int count = 0;
        int temp = -1;
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 0; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
    }
        while (!pq.isEmpty()) {
            CubeSum s = pq.delMin();
            if (temp == s.sum) {
                count++;
            } else {
                count = 0;
            }
            if(count == M - 1) {
                N--;
                if (N == 0) {
                    System.out.println(s.sum);
                    break;
                }
            }
            temp = s.sum;
            if (s.j < n) {
                pq.insert(new CubeSum(s.i, s.j + 1));
            }
        }
    }
}

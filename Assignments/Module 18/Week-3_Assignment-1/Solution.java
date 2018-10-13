import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		//for checkstyle unused.
	}

	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		MinPQ<Stock> onehourmin = new MinPQ<Stock>();
		MaxPQ<Stock> onehourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0], Double.parseDouble(arrayinput[1]));
			onehourmax.insert(temp);
			onehourmin.insert(temp);
		}

		System.out.println("\n");
		onehourmax.toString();
		System.out.println("\n");
		onehourmin.toString();
	}
}
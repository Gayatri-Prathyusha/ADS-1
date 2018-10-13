import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * Class variable for company name.
	 */
	private String companyname;
	/**
	 * Class variable for change in stock by hour.
	 */
	private float change;

	/**
	 * Constructs the object.
	 *
	 * @param      companyname1   The company Name.
	 * @param      change1   The change
	 */
	Stock(final String companyname1, final float change1) {
		this.companyname = companyname1;
		this.change = change1;
	}

	/**
	 * Gets the companyName.
	 *
	 * @return     The companyname.
	 */
	public String getCompanyName() {
		return companyname;
	}

	/**
	 * Gets the change.
	 *
	 * @return     The change.
	 */
	public float getChange() {
		return change;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return companyname + " " + change;
	}

	/**
	 * Compares two stocks.
	 *
	 * @param      other  The other
	 *
	 * @return     Integer value to compare.
	 */
	public int compareTo(Stock other) {
		if (this.change > other.getChange()) {
			return 1;
		}
		if (this.change < other.getChange()) {
			return -1;
		}
		if (this.companyname.compareTo(other.getCompanyName()) > 0) {
			return 1;
		}
		if (this.companyname.compareTo(other.getCompanyName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}

/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// unused
	}

	/**
	 * Main method - Takes Inputs, prints out Outputs.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		ArrayList<Stock> top5 = new ArrayList<Stock>();
		ArrayList<Stock> least5 = new ArrayList<Stock>();
		for(int i = 0; i < 6 ; i++) {
		EveryHour(top5, least5, n, scan);
	    }
	}
		// First hour
		
	public static void EveryHour(ArrayList<Stock> top5, ArrayList<Stock> least5, int size, Scanner sc) {
		MinPQ<Stock> onehourmin = new MinPQ<Stock>();
		MaxPQ<Stock> onehourmax = new MaxPQ<Stock>();
		for (int i = 0; i < size; i++) {
			String[] arrayinput = sc.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Float.parseFloat(arrayinput[1]));
			onehourmax.insert(temp);
			onehourmin.insert(temp);
		}
		onehourmax.printval(top5);
		onehourmin.printval(least5);

		}
		

		// // Second hour
		// MinPQ<Stock> secondhourmin = new MinPQ<Stock>();
		// MaxPQ<Stock> secondhourmax = new MaxPQ<Stock>();

		// for (int i = 0; i < n; i++) {
		// 	String[] inputs = scan.nextLine().split(",");
		// 	Stock temp = new Stock(inputs[0],
		// 	                       Float.parseFloat(inputs[1]));
		// 	secondhourmax.insert(temp);
		// 	secondhourmin.insert(temp);
		// }

		// secondhourmax.printval(top5);
		// secondhourmin.printval(least5);

		// Third Hour
		// MinPQ<Stock> thirdhourmin = new MinPQ<Stock>();
		// MaxPQ<Stock> thirdhourmax = new MaxPQ<Stock>();

		// for (int i = 0; i < n; i++) {
		// 	String[] inputs = scan.nextLine().split(",");
		// 	Stock temp = new Stock(inputs[0],
		// 	                       Float.parseFloat(inputs[1]));
		// 	thirdhourmax.insert(temp);
		// 	thirdhourmin.insert(temp);
		// }

		// thirdhourmax.printval(top5);
		// thirdhourmin.printval(least5);

		// // Fourth Hour
		// MinPQ<Stock> forthhourmin = new MinPQ<Stock>();
		// MaxPQ<Stock> fourthhourmax = new MaxPQ<Stock>();

		// for (int i = 0; i < n; i++) {
		// 	String[] inputs = scan.nextLine().split(",");
		// 	Stock temp = new Stock(inputs[0],
		// 	                       Float.parseFloat(inputs[1]));
		// 	fourthhourmax.insert(temp);
		// 	forthhourmin.insert(temp);
		// }

		// fourthhourmax.printval(top5);
		// forthhourmin.printval(least5);

		// Fifth Hour
		// MinPQ<Stock> fifthhourmin = new MinPQ<Stock>();
		// MaxPQ<Stock> fifthhourmax = new MaxPQ<Stock>();

		// for (int i = 0; i < n; i++) {
		// 	String[] inputs = scan.nextLine().split(",");
		// 	Stock temp = new Stock(inputs[0],
		// 	                       Float.parseFloat(inputs[1]));
		// 	fifthhourmax.insert(temp);
		// 	fifthhourmin.insert(temp);
		// }

		// fifthhourmax.printval(top5);
		// fifthhourmin.printval(least5);		

		// // Sixth Hour
		// MinPQ<Stock> sixthhourmin = new MinPQ<Stock>();
		// MaxPQ<Stock> sixthhourmax = new MaxPQ<Stock>();

		// for (int i = 0; i < n; i++) {
		// 	String[] inputs = scan.nextLine().split(",");
		// 	Stock temp = new Stock(inputs[0],
		// 	                       Float.parseFloat(inputs[1]));
		// 	sixthhourmax.insert(temp);
		// 	sixthhourmin.insert(temp);
		// }

		// sixthhourmax.printval(top5);
		// sixthhourmin.printval(least5);		

    
}
import java.util.Scanner;
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
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		// hour 1
		MinPQ<Stock> firsthourmin = new MinPQ<Stock>();
		MaxPQ<Stock> firsthourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			firsthourmax.insert(temp);
			firsthourmin.insert(temp);
		}

		firsthourmax.toString();
		System.out.println("\n");
		firsthourmin.toString();

		// hour 2
		MinPQ<Stock> secondhourmin = new MinPQ<Stock>();
		MaxPQ<Stock> secondhourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			secondhourmax.insert(temp);
			secondhourmin.insert(temp);
		}

		secondhourmax.toString();
		System.out.println("\n");
		secondhourmin.toString();

		// hour 3
		MinPQ<Stock> thirdhourmin = new MinPQ<Stock>();
		MaxPQ<Stock> thirdhourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			thirdhourmax.insert(temp);
			thirdhourmin.insert(temp);
		}

		thirdhourmax.toString();
		System.out.println("\n");
		thirdhourmin.toString();

		// hour 4
		MinPQ<Stock> fourthhourmin = new MinPQ<Stock>();
		MaxPQ<Stock> fourthhourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			fourthhourmax.insert(temp);
			fourthhourmin.insert(temp);
		}

		fourthhourmax.toString();
		System.out.println("\n");
		fourthhourmin.toString();

		// hour 5
		MinPQ<Stock> fifthhourmin = new MinPQ<Stock>();
		MaxPQ<Stock> fifthhourmax = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			fifthhourmax.insert(temp);
			fifthhourmin.insert(temp);
		}

		fifthhourmax.toString();
		System.out.println("\n");
		fifthhourmin.toString();		

		// hour 6
		MinPQ<Stock> sixthhourmin = new MinPQ<Stock>();
		MaxPQ<Stock> sixthhourmax = new MaxPQ<Stock>();
		for (int i = 0; i < n; i++) {
			String[] arrayinput = scan.nextLine().split(",");
			Stock temp = new Stock(arrayinput[0],
			                       Double.parseDouble(arrayinput[1]));
			sixthhourmax.insert(temp);
			sixthhourmin.insert(temp);
		}
		sixthhourmax.toString();
		System.out.println("\n");
		sixthhourmin.toString();		

	}
}
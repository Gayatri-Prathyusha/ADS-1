import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**
		 * empty constructor to avoid checkstyle error.
		 */
	}
	/**
	 * caluculation the minimum and maximum for evryhour.
	 *
	 * @param      top5    The top 5
	 * @param      least5  The least 5
	 * @param      size    The size
	 * @param      sc      The screen
	 */
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
	/**
	 * Main method.
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

	    // if (scan.hasNext()) {


	    // int m = Integer.parseInt(scan.nextLine());
	    // String[] arr1 = scan.nextLine().split(",");
	    // BinarySearchST<String, Integer> bst = new BinarySearchST<String, Integer>();
	    // for(int i = 0; i < m - 1; i++) {
	    // 	bst.put(arr1[i], i);
	    // }
	    // while (scan.hasNext()) {
            
     //        switch (arr1[0]) {
     //            case "get":
     //            System.out.println(arr1[2]);
     //            break;
     //            case "intersection":


                
     //            break;
     //            default:
     //            break;
     //        }
     //    }

	}

}

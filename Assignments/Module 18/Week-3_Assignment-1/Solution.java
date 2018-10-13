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
		ArrayList<String> stocks = new ArrayList<String>();
		ArrayList<Stock> top5 = new ArrayList<Stock>();
		ArrayList<Stock> least5 = new ArrayList<Stock>();
		for(int i = 0; i < 6 ; i++) {
		EveryHour(top5, least5, n, scan);
	    }

	    ArrayList<String> topperformers = new ArrayList<String>();
	    ArrayList<String> leastperformers = new ArrayList<String>();

	    for (int i = 0; i < top5.size(); i++) {
	      topperformers.add(top5.get(i).getCompanyName());
	      // System.out.println(topperformers.get(i));
	    }

	    for (int i = 0; i < least5.size(); i++) {
	      leastperformers.add(least5.get(i).getCompanyName());
	    }

	    BinarySearchST<String, Integer> maxST = new BinarySearchST<String, Integer>();
	    BinarySearchST<String, Integer> minST = new BinarySearchST<String, Integer>();

	    for (int i = 0; i < stocks.size(); i++) {
	      String temp = stocks.get(i);
	      if (!topperformers.contains(temp)) {
	        maxST.put(temp, 0);
	      }
	    }
	    for (int i = 0; i < topperformers.size(); i++) {
	      String temp = topperformers.get(i);
	      if (!maxST.contains(temp)) {
	        maxST.put(temp, 1);
	      } else {
	        maxST.put(temp, maxST.get(temp) + 1);
	      }
	    }
	    for (int i = 0; i < stocks.size(); i++) {
	      String temp = stocks.get(i);
	      if (!minST.contains(temp)
	          && !leastperformers.contains(temp)) {
	        minST.put(temp, 0);
	      }
	    }

	    for (int i = 0; i < leastperformers.size(); i++) {
	      String temp = leastperformers.get(i);
	      if (!minST.contains(temp)) {
	        minST.put(temp, 1);
	      } else {
	        minST.put(temp, minST.get(temp) + 1);
	      }
	    }
	    int numInp = Integer.parseInt(scan.nextLine());

	    for (int j = 0; j < numInp; j++) {
	      String[] inp = scan.nextLine().split(",");
	      switch (inp[0]) {
	      case "get":
	        if (inp[1].equals("minST")) {
	          if (minST.contains(inp[2])) {
	            System.out.println(minST.get(inp[2]));
	          } else {
	            System.out.println(0);
	          }
	          break;
	        } else if (inp[1].equals("maxST")) {
	          if (maxST.contains(inp[2])) {
	            System.out.println(maxST.get(inp[2]));
	          } else {
	            System.out.println(0);
	          }
	          break;
	        }
	      case "intersection":
	        break;
	      default:
	        break;
	      }
	    }
	  }
	}
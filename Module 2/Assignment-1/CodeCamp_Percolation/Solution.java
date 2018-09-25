import java.util.Scanner;
import java.lang.*;
public class Solution {
	Solution() {

	}
	public static void main(String[] args)throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Percolation p = new Percolation(n);
		while (s.hasNext()) {
			String str = s.nextLine();
			String[] tokens = str.split(" ");
			p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		}
		
	}
}
import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList lst = new LinkedList();
		String[] tokens = sc.nextLine().split(" ");
		switch (tokens[0]){
		case "insertAt" :
		lst.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		System.out.println(lst);
		break;
		case "reverse":
		lst.reverse();
		break;
		default:
		break;

	    }
    }

}
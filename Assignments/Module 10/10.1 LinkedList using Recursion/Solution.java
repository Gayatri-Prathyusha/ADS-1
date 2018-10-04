import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
	    LinkedList list = new LinkedList();
		while(s.hasNextLine()) {
			String[] input = s.nextLine().split(" ");
			switch (input[0]) {
				case "insertAt" :
				try {
				list.insertAt(Integer.parseInt(input[1]),input[2]);
				System.out.println(list);
			}
				catch (Exception e) {
					System.out.println("Can't insert at this position.");
				}
				break;
				case "reverse" : 
				try {
				list.reverse();
				System.out.println(list);				
			}
				catch(Exception e) {
				System.out.println("No elements to reverse.");
				}
				break;
		default:
		break;

	    }
    }
}
}
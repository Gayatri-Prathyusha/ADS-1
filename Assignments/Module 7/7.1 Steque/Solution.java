import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				Steque steak = new Steque();				
		    
		    while (sc.hasNext()) {
		    	String[] tokens = sc.nextLine().split(" ");
		    	switch (tokens[0]) {
		    		case "push":
		    		steak.push(Integer.parseInt(tokens[1]));
		    		
		    		break;
		    		case "pop":
		    		steak.pop();
		    		break;
		    		case "enqueue":
		    		steak.enqueue(Integer.parseInt(tokens[1]));
		    		break;
		    		default:
		    		break;
		    	}
		    }
		    }


	    }

	}
}
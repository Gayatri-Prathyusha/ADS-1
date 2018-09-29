import java.util.Scanner;
public class Solution {
    Solution() {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
            default:
                break;
        }
    }
    
}

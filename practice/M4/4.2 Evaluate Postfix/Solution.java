import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {

  /**
   * Constructs the object.
   */

  private Solution() {
    /**
     * Unused.
     */
  }

  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack1<Integer> stack = new Stack1<Integer>();
    int sum = 0;
    String[] string = sc.nextLine().split(" ");
    for (int i = 0; i < string.length; i++) {
      if (string[i].equals("+") && !stack.isEmpty()) {
        sum = stack.pop() + stack.pop();
        stack.push(sum);
      } else if (string[i].equals("*") && !stack.isEmpty()) {
        sum = stack.pop() * stack.pop();
        stack.push(sum);
      } else {
        stack.push(Integer.parseInt(string[i]));
      }
    }
    System.out.println(sum);
  }

}

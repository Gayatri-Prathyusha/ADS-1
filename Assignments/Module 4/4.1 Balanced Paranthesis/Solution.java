import java.util.Scanner;
/**
 * Class for Solution.
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
    int noOFLines = Integer.parseInt(sc.nextLine());
    // System.out.println(noOFLines);

    while (sc.hasNext()) {
      // System.out.println("Reached");
      String input = new String(sc.nextLine());
      // System.out.println(input);
      Balparen checkThisString = new Balparen(input);
      if (checkThisString.isBalanced()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}

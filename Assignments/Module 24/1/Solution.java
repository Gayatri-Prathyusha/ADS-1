import java.util.Scanner;

/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused .
    //for checkstyle to remove.
  }

  /**
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    final int three = 3;
    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());
    LinearProbingHashST<Integer, Student> linearsection =
      new LinearProbingHashST<>(three * n);
    for (int i = 0; i < n; i++) {
      String[] input = scan.nextLine().split(",");
      Student studentobject = new Student(Integer.parseInt(input[0]),
                                 input[1],
                                 Double.parseDouble(input[2]));
      linearsection.put(Integer.parseInt(input[0]), studentobject);
    }

    int m = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < m; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[2]) {
      case "1":
        try {
          System.out.println(linearsection.get(
                               Integer.parseInt(tokens[1])).getName());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      case "2":
        try {
          System.out.println(linearsection.get(
                               Integer.parseInt(tokens[1])).getMarks());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      default:
        break;
      }
    }
  }
}

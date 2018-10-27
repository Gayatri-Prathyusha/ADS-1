import java.util.Scanner;

/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused.
    //for checkstyle to remove.
  }

  /**
   * Main method.
   *
   * Complexity (average case):
   *
   * For inserting - logarithmic time as BST was used.
   * For searching - logarithmic time as BST was used.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());

    BinarySearchTree binarysection = new BinarySearchTree();

    for (int i = 0; i < n; i++) {
      String[] inp = scan.nextLine().split(",");
      Student temp = new Student(Integer.parseInt(inp[0]),
                                 inp[1],
                                 Double.parseDouble(inp[2]));
      binarysection.put(Integer.parseInt(inp[0]), temp);
    }

    int m = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < m; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "BE":
        try {
          System.out.println(binarysection.get(
                               Integer.parseInt(tokens[1])).getMarks());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      case "LE":
        try {
          System.out.println(binarysection.get(
                               Integer.parseInt(tokens[1])).getMarks());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
        case "GE":
        try {
          System.out.println(binarysection.get(
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

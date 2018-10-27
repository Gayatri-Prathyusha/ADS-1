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
    //to remove the checkstyle.
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

    BST<Student, Integer> section = new BST<>();

    for (int i = 0; i < n; i++) {
      String[] inputstring = scan.nextLine().split(",");
      Student studentobject = new Student(Integer.parseInt(inputstring[0]),
                                 inputstring[1],
                                 Double.parseDouble(inputstring[2]));
      section.put(studentobject, Integer.parseInt(inputstring[0]));
    }

    int m = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < m; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "BE":
        double min = Double.parseDouble(tokens[1]);
        double max = Double.parseDouble(tokens[2]);
        for (Student each : section.keys()) {
          if (each.getMarks() >= min
              && each.getMarks() <= max) {
            System.out.println(each);
          }
        }
        break;
      case "LE":
        double endlimit = Double.parseDouble(tokens[1]);
        for (Student each : section.keys()) {
          if (each.getMarks() <= endlimit) {
            System.out.println(each);
          }
        }
        break;
      case "GE":
        double startlimit = Double.parseDouble(tokens[1]);
        for (Student each : section.keys()) {
          if (each.getMarks() >= startlimit) {
            System.out.println(each);
          }
        }
        break;
      default:
        break;
      }
    }

  }
}

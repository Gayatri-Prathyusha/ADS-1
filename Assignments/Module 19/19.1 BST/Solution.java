import java.util.Scanner;
/**
 * client program.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree binaryobject = new BinarySearchTree();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                BookDetails detailsobject = new BookDetails(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                binaryobject.put(detailsobject, Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                detailsobject = new BookDetails(tokens[1], tokens[2],
                                        Float.parseFloat(tokens[2 + 1]));
                if (binaryobject.get(detailsobject) == -1) {
                    System.out.println("null");
                } else {
                    System.out.println(binaryobject.get(detailsobject));
                }
                break;
            case "max":
                System.out.println(binaryobject.max());
                break;
            case "min":
                System.out.println(binaryobject.min());
                break;
            case "select":
                System.out.println(binaryobject.select(Integer.parseInt(tokens[1])));
                break;
            case "floor":
                detailsobject = new BookDetails(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                System.out.println(binaryobject.floor(detailsobject));
                break;
            case "ceiling":
                detailsobject = new BookDetails(tokens[1],
                    tokens[2], Float.parseFloat(tokens[2 + 1]));
                System.out.println(binaryobject.ceiling(detailsobject));
                break;
            default:
                break;
            }
        }
    }
}

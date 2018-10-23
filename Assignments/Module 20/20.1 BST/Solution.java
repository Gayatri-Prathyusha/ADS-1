import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * { Client program }.
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree binaryobject = new BinarySearchTree();
        while (scan.hasNext()) {
            String[] check = scan.nextLine().split(",");
            switch (check[0]) {
            case "put":
                BookDetails bookdetailsobject = new BookDetails(check[1], check[2],
                    Float.parseFloat(check[2 + 1]));
                binaryobject.put(bookdetailsobject, Integer.parseInt(check[2 + 2]));
                break;
            case "get":
                bookdetailsobject = new BookDetails(check[1], check[2],
                                        Float.parseFloat(check[2 + 1]));
                if (binaryobject.get(bookdetailsobject) == -1) {
                    System.out.println("null");
                } else {
                    System.out.println(binaryobject.get(bookdetailsobject));
                }
                break;
            case "max":
                System.out.println(binaryobject.max());
                break;
            case "min":
                System.out.println(binaryobject.min());
                break;
            case "select":
                System.out.println(binaryobject.select(Integer.parseInt(check[1])));
                break;
            case "floor":
                bookdetailsobject = new BookDetails(check[1],
                    check[2], Float.parseFloat(check[2 + 1]));
                System.out.println(binaryobject.floor(bookdetailsobject));
                break;
            case "ceiling":
                bookdetailsobject = new BookDetails(check[1],
                    check[2], Float.parseFloat(check[2 + 1]));
                System.out.println(binaryobject.ceiling(bookdetailsobject));
                break;
            case "deleteMax":
                binaryobject.deleteMax();
                break;
            case "deleteMin":
                binaryobject.deleteMin();
                break;
            case "delete":
                bookdetailsobject = new BookDetails(check[1], check[2],
                    Float.parseFloat(check[2 + 1]));
                binaryobject.delete(bookdetailsobject);
                break;
            default:
                break;
            }
        }
    }
}



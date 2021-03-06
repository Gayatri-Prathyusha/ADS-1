/**
 * List of linkeds.
 */
public final class LinkedList {
    /**
     * Constructs the object.
     */
    protected LinkedList() {
        /**
         * Empty Constructor.
         */
    }
    /**
     * Class for node.
     */
    private class Node {

        /**
         * data The value of the Node.
         */
        private String data;
        /**
         * Node variable pointing to next node.
         */
        private Node next;
        /**
         * Constructs the object.
         */
        Node() {

        }

        /**
         * Constructs the object.
         *
         * @param      data1  The data
         */
        Node(final String data1) {
            this(data1, null);
        }

        /**
         * Constructs a parameterized constructor for the object.
         *
         * @param      data1  The data
         * @param      next1  The next
         */
        Node(final String data1, final Node next1) {
            this.data = data1;
            this.next = next1;
        }
    /**
     * Gets the next.
     *
     * @return     The next.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next.
     *
     * @param      node  The node
     */
    public void setNext(final Node node) {
        next = node;
    }

    /**
     *
     *
     * @return     The data.
     */
    public String getData() {
        return data;
    }

    /**
     * { sets the data value }.
     *
     * @param      elem  The element
     */
    public void setdata(final String elem) {
        data = elem;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return data + "";
    }
    }
    /**
     * head value.
     */
    private Node head;
    /**
     * size of the list.
     */
    private int size = 0;
    /**
     * Insert the value at the position.
     *
     * @param      pos        The position
     * @param      val        The value
     *
     * @throws     Exception  { whent the index value is invalid }.
     */
    public void insertAt(final int pos, final String val)throws Exception {
        if (pos < 0 || pos > size) {
        throw new Exception();
        }
        Node obj = new Node(val);
        head = insertAt(pos, head, obj, 0);
    }
    /**
     * Insertion of the node at a particular index when the
     * list is not empty. this is a recursive call.
     *
     * @param      pos        The position
     * @param      first      The first
     * @param      obj        The object
     * @param      count      The count
     *
     * @return     { Node  }.
     *
     * @throws     Exception  { When the index value given is invalid}
     */
    public Node insertAt(final int pos, final Node first,
    final Node obj, final int count) throws Exception {
        if (pos == count) {
            obj.next = first;
            size++;
            return obj;
        }
        first.next = insertAt(pos, first.next, obj, count + 1);
        return first;
    }
    /**
     * reverse with no parameters.
     */
    public void reverse() {
        reverse(null, head);
    }
    /**
     * reverse of the function.
     *
     * @param      previous  The previous node
     * @param      current   The current node
     */
    public void reverse(final Node previous, final Node current) {
        if (current != null) {
            reverse(current, current.next);
            current.next = previous;
        } else {
            head = previous;
        }
    }
    /**
     *
     * Time complexity : N.
     * n is the size of list.
     *
     * @return  result     String of the output.
     */
    public String toString() {
        String result = "";
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNext();
            }
        return result;
    }
}

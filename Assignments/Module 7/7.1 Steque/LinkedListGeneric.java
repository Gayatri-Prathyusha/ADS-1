/**
 * Class for linked list generic.
 *
 * @param      <E>   { parameter_description }
 */
class LinkedListGeneric<E> {

	/**
	 * Class for node.
	 */
	private class Node {

		E data;
		Node next;

		/**
		 * Constructs the object.
		 */
		Node() {}

		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 */
		Node(E data) {
			this(data, null);
		}

		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 * @param      next  The next
		 */
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
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
    public void setNext(Node node) {
        next = node;
    }

    /**
     * Gets the data.
     *
     * @return     The data.
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the element which is sent as a parameter to data variable.
     *
     * @param      elem  The element
     */
    public void setdata(E elem) {
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
	private Node head;
	private Node tail;
	private int size = 0;

	/**
	 * Adds a 1.
	 *
	 * @param      e     {sends the values of the object type}.
	 */
	public void add1(E e) {
		Node node = new Node();
		node.data = e;
		node.next = head;

		if (head == null) {
		tail = node;
			
		}

		head = node;
		size++;
	}		
	/**
	 * adds the object type variable to the last of the list.
	 *
	 * @param      e     { parameter_description }
	 */
	public void addlast(E e) {
		if(head == null && tail == null) {
			Node node = new Node();
			node.data = e;
			tail = head = node;
			

		} else {
		Node node= new Node();
		node.data = e;
		tail.next = node;
		tail = node;
	}
	size++;

}

	/**
	 * removes the first node.
	 */
	public void remove() {
		if(size == 1){
			tail = head = null;
			size = 0;
			return;

		}

		E data = head.data;
		head = head.next;
		size--;
}

	/**
	 * Determines if empty 1.
	 *
	 * @return     True if empty 1, False otherwise.
	 */
	public boolean isEmpty1() {
		return head == null;
	}

	/**
	 * 
	 * Time complexity : N.
	 * n is the size of list.
	 *
	 * @param      e     { parameter_description }
	 */
	public String toString() {
        String result = "";
        if (head == null) {
            return "Steque is empty.";
        }
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNext();
            }
        return result;
        
    }

}
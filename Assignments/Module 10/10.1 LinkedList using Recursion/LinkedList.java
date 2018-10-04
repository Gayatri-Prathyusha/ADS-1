class LinkedList {

	private class Node {

		int data;
		Node next;

		Node() {}

		Node(int data) {
			this(data, null);
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public int getData() {
        return data;
    }

    public void setdata(int elem) {
        data = elem;
    }

    public String toString() {
        return data + "";
    }
	}
	private Node head;
	private int size = 0;

// 	public Node insertAt(int data, int position) {
//     if (position == 0) {
//         Node node = new Node();
//         node.data = data;
//         node.next = head;
//         return head;
//     } else {
//     head.next = insertAt(data, position - 1);
//     return head;
// 	}
// }

	public Node insertAt(int data, int position) {
    Node temp = new Node();
    temp.next = head;

    Node newnode = temp;
    for (int i = 0; i < position-1; ++i) {
        newnode = newnode.next;
    }

    Node node = new Node();
    node.data = data;
    node.next = newnode.next;
    newnode.next = node;

    return temp;
}

	public String[] reverse() {
		if (head == null){
			System.out.println("No elements to reverse.");
		}
		return null;

	}		

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
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNext();
            }
        return result;
        
    }

}
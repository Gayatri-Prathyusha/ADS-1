class LinkedListGeneric<E> {

	private class Node {

		E data;
		Node next;

		Node() {}

		Node(E data) {
			this(data, null);
		}

		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public E getData() {
        return data;
    }

    public void setdata(E elem) {
        data = elem;
    }

    public String toString() {
        return data + "";
    }
	}
	private Node head;
	private Node tail;

	public void add1(E e) {
		Node node = new Node();
		node.data = e;
		node.next = head;

		if (head == null) {
		tail = node;
			
		}

		head = node;
	}		
	public void addlast(E e) {
		if(head == null && tail == null) {
			Node node = new Node();
			node.data = e;
			tail = head = node;
			

		} else {
		Node node= new Node();
		node.data = e;
		tail.next = node;
	}

}

	public void remove() {
		// if(head == null) {
		// 	System.out.println("Steque is empty.");

		// }
		E data = head.data;
		head = head.next;
		//return data;

}

	public boolean isEmpty1() {
		return head == null;
	}

	public String toString() {
        String result = "";
        // if (head == null) {
        //     return "Steque is empty.";
        // }
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNext();
            }
        return result;
        
    }

}
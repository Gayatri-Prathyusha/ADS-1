public class Node {
	char data;
	Node next;

	Node() {}

	Node(char item1) {
		this.data = item1;
		this.next = null;
	}
}
class Iterator {
	Node current;

	public Iterator(Node head) {
		current = head;
	}

	public boolean hasNext() {
		return current != null;
	}

	public char next() {
		char dt = current.data;
		current = current.next;
		return dt;
	}
}

class LinkedList {


	private Node head;

	public void addData(char item) {
		Node temp = new Node(item);
		temp.next = head;
		head = temp;
	}

	public boolean isEmpty1() {
		return head == null;
	}

	public Node getHead() {
		return head;
	}

	public char getData(Node node) {
		return node.data;
	}

	public Node getNext(Node node) {
		return node.next;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
}
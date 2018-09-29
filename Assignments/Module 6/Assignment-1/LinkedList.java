class Node {
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

	public Iterator(Node first) {
		current = first;
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

public class LinkedList {


	private Node first;

	public void addData(char item) {
		Node temp = new Node(item);
		temp.next = first;
		first = temp;
	}

	public boolean isEmpty1() {
		return first == null;
	}

	public Node getFirst() {
		return first;
	}

	public char getData(Node node) {
		return node.data;
	}

	public Node getNext(Node node) {
		return node.next;
	}

	public void print() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.data + "-->");
			temp = temp.next;
		}
	}
}
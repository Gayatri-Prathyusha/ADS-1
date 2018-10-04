/**
 * List of linkeds.
 */
class LinkedList {

	/**
	 * Class for node.
	 */
	private class Node {

		String data;
		Node next;

		/**
		 * Constructs the object.
		 */
		Node() {}

		Node(String data) {
			this(data, null);
		}

		Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
	public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public String getData() {
        return data;
    }

    public void setdata(String elem) {
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
	public void insertAt(int pos, String val)throws Exception{
		if (pos<0 || pos>size) {
		throw new Exception();			
		}
		Node obj = new Node(val);
		head=insertAt(pos,head,obj,0);
	}


	public Node insertAt(int pos, Node first, Node obj, int count) throws Exception{
		if (pos == count) {
			obj.next =first;
			size++;
			return obj;
		}
		first.next = insertAt(pos,first.next,obj,count+1);
		return first;
	}


	public void reverse(){
		reverse(null,head);
	}


	public void reverse(Node previous, Node current){
		if (current!=null) {
			reverse(current,current.next);
			current.next= previous;
		}else {
			head =previous;
		}
	}


	/**
	 * 
	 * Time complexity : N.
	 * n is the size of list.
	 *
	 * @param      result     String of the output.
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
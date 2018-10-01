
public class Steque<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedListGeneric<E> newlist;

	/**
	 * Constructs the object.
	 * Time complexity : 1.
	 */
	Steque() {
		newlist = new LinkedListGeneric<>();
	}

	public boolean isEmpty() {
		return newlist.isEmpty1();
	}

	
	/**
	 * Inserts elements at the begining of the list.
	 * Time complexity : 1
	 *
	 * @param      e     { parameter_description }
	 */
	public void push(E e) {
		//Node old = head;
		//head = new Node(data, old);
		//if (e == null) {
		//tail = head;
		//}
		newlist.add1(e);
		System.out.println(newlist);
	}
	/**
	 * delets elements at the begining of the list.
	 * Time complexity : 1
	 *
	 * @param      e     { parameter_description }
	 */

	public void pop() {
		if(isEmpty()) {
			System.out.println("Steque is empty.");
		} else {
		newlist.remove();
		System.out.println(newlist);
	}
}

	/**
	 * Inserts elements at the end of the list.
	 * Time complexity : 1
	 *
	 * @param      e     { parameter_description }
	 */
	public void enqueue(E ele) {
		newlist.addlast(ele);
		System.out.println(newlist);

	}
}
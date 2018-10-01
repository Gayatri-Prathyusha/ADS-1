
public class Steque<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedListGeneric<E> newlist;

	Steque() {
		newlist = new LinkedListGeneric<>();
	}

	public boolean isEmpty() {
		return newlist.isEmpty1();
	}

	public void push(E e) {
		newlist.add1(e);
		System.out.println(newlist);
	}

	public void pop() {
		newlist.remove();
		System.out.println(newlist);
	}

	public void enqueue(E ele) {
		newlist.addlast(ele);
		System.out.println(newlist);

	}
}
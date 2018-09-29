
public class Stacks<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedList<E> list;

	Stacks() {
		list = new LinkedList<>();
	}

	public boolean isEmpty() {
		return list.isEmpty1();
	}

	public void push(E e) {
		list.addData(e);
	}

	public E pop() {
		E c = list.remove();
		return c;
	}
}
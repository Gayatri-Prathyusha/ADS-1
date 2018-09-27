
public class Stack1<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedList<E> list;

	Stack1() {
		list = new LinkedList<>();
	}

	public void push(E e) {
		list.add(e);
	}

	public E pop() {
		E c = list.pop1();
		return c;
	}

	public boolean isEmpty() {
		return list.isEmpty1();
	}
}
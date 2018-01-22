public class SortedList<E extends Comparable<E>> {

	private int size;
	private Node front;

	private class Node {
		private E data;
		private Node next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E objectReference) {
			data = objectReference;
			next = null;
		}

		public Node(E objectReference, Node nextReference) {
			data = objectReference;
			next = nextReference;
		}
	}

	// External reference to find
	// the first element in this list

	// Number of elements in this list

	public SortedList() {
		front = null;
		size = 0;
	}

	public void insertInOrder(E element) {
		if (null == front)
			front = new Node(element);
		else {
			Node prev = front;
			Node ref;
			for (ref = front.next; ref != null && ref.data.compareTo(element) < 0; ref = ref.next)
				prev = prev.next;
			if (0 == ref.data.compareTo(element))
				return;
			prev.next = new Node(element, ref);
		}
		size++; // unless element existed
	}

	public int size() {
		return size;
	}

	// add remove here
}
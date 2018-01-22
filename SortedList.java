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
	// . . . code omitted . . .
	size++; // unless element existed
    }

    public int size() {
	return size;
    }
    
    
    // add remove here
}
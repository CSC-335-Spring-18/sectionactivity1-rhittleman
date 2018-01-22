import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

	@Test
	public void testSize() {
		SortedList<Integer> newList = new SortedList<>();
		newList.insertInOrder(1);
		assertEquals(newList.size(),1);
	}

}

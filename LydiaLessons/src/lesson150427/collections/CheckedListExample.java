package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListExample {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		evil(Collections.checkedList(list, String.class));
		
	}

	private static void evil(final List<String> list) {
		List list2 = list;
		list2.add(10);
		list2.add(new Object());
		
	}
	
}

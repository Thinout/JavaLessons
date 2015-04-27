package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		broadcast(Collections.unmodifiableList(list), "Hello");
		/**
		 * 
		 */
		
	}

	private static void broadcast(final List<String> list, final String message) {
		for (String userName : list) {
			System.out.println(userName + " > " + message);
		}
		list.add("Dracula");
	}
	
}

package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleCollectionsExamples {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, 1);
		System.out.println(list);
		
	}
	
	
}

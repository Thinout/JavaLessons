package lesson150331.linkedList.anonymous;

import java.util.Iterator;

public class UseList {
	
	public static void main(final String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("one");
		list.add("two");
		list.add("tree");
		list.add(1);
		list.add(new Object());
				
		//Перебор элементов
		for (Object item : list) {
			System.out.println(item);
		}		
	}	
}

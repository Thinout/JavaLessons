package lesson150330.LinkedList;

import java.util.Iterator;

public class UseList {
	
	public static void main(final String[] args) {
		LinkedList list = new LinkedList();
		list.print();
		list.add("one");
		list.add("two");
		list.add("tree");
		
		
		//Перебор элементов
		for (Object item : list) {
			System.out.println(item);
		}
		// =
		// Использование итератора явно
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			// do something
			System.out.println(item);
		}
	}
	
}

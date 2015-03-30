package lesson150330.LinkedList;

import java.util.Iterator;

public class ListIterator implements Iterator {
	
	private LinkedList _linkedList;
	private Node _tmp;
	
	public ListIterator(final LinkedList linkedList) {
		_linkedList = linkedList;
		_tmp = _linkedList.first;
	}
	
	@Override
	public boolean hasNext() {		
		return _tmp != null;
	}

	@Override
	public Object next() {
		Object item = _tmp.item;
		_tmp = _tmp.next;
		return item;
	}

}

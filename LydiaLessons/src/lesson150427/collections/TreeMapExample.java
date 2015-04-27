package lesson150427.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(final String[] args) {
		
		NavigableMap<String, String> calls = new TreeMap<>();
		
		calls.put("01:23", "586403");
		calls.put("11:50", "589634");
		calls.put("18:08", "086959");
		calls.put("22:55", "689503");
		calls.put("03:12", "294580");
		calls.put("09:23", "586403");
		
		System.out.println(calls.ceilingKey("10:00"));
		System.out.println(calls.headMap("12:00"));
		System.out.println(calls.tailMap("18:00"));
		System.out.println(calls.subMap("02:00", true, "05:00", true));
		
		for (String key : calls.keySet()) {
			System.out.println(key);
		}
		
	}
	
}

package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Examples {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//Map<String, String> addresses = new HashMap<>();
		Map<String, String> addresses = new LinkedHashMap<>();
		
		addresses.put("Ivanov", "Ufa");
		addresses.put("Petrova", "Kerch");
		addresses.put("Morozov", "Moskow");
		
		for (Map.Entry<String, String> addressEntry : addresses.entrySet()) {
			System.out.println("key " + addressEntry.getKey());
			System.out.println("value " + addressEntry.getValue());
		}
		
		for (String surname : addresses.keySet()) {
			System.out.println(surname);
		}
		
		System.out.println(addresses.values());
		System.out.println(addresses.values());
		System.out.println(addresses.values());
	}
	
	
}

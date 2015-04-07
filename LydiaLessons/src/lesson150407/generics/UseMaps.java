package lesson150407.generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMaps {
	public static void main(final String[] args) {
		Map<String, String> phones = new HashMap<>();
		phones.put("Ivanov", "+7 921 1234567");		
		phones.put("Petrov", "+7 911 1234567");		
		phones.put("Sidorov", "+7 906 1234567");
		
		System.out.println(phones.get("Petrov"));
		
		Map<Integer,List<String>> groups = new HashMap<>();
		groups.put(120, new LinkedList<String>() {
			{
				add("Ivanov");
				add("Petrov");
				add("Sidorov");
			}
		});
		groups.put(new Integer(200), Arrays.asList("Peters", "Jobs", "Scully"));
		System.out.println(groups.get(200));
	}
}

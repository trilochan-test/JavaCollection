package mapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "Java");
		map1.put("2", "Python");
		map1.put("3", "C");
		map1.put("4", "C++");

		// Synchronized map
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);

		// ConcurrentHashMap:it does not thrown an ConcurrentModificationException
		ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<>();
		ch.put("A", "100");
		ch.put("B", "90");
		ch.put("C", "70");

		System.out.println(ch.get("A"));

	}

}

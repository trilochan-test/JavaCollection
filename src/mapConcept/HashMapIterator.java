package mapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterator {
	// no order-no index
	// stores :key-value pair
	// Key can't be duplicate
	// can store n number of null values but only one null key
	// hashmap has no thread safe -unsynchronized

	public static void main(String[] args) {

		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("A", "Naveen");
		empMap.put("B", "Tom");
		empMap.put("C", "Peter");
		empMap.put("D", "Lisa");
		empMap.put(null, "Naveen");
		empMap.put(null, "Tri");
		empMap.put("E", null);
		empMap.put("F", null);

		System.out.println(empMap.get("C"));
		System.out.println(empMap.get(null));

		// iterator:over the keys--by using keySet()
		Iterator<String> iterator = empMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String values = empMap.get(key);

			System.out.println("Key is =" + key + " and value for :" + values);

		}

		System.out.println("-------------------------");

		// iterator:over the set(pair--by using entrySet()
		Iterator<Entry<String, String>> it = empMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> ne = it.next();
			System.out.println("Key is =" + ne.getKey() + " and value for :" + ne.getValue());

		}
		System.out.println("-------------------------");

		// iterate hashmap by using JDK 1.8 for each with lambda

		empMap.forEach((k, v) -> System.out.println("Key is =" + k + " and value for :" + v));

	}

}

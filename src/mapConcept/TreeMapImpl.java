package mapConcept;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1000, "Tom");
		treeMap.put(2000, "Peter");
		treeMap.put(3000, "Steve");
		treeMap.put(11000, "Naveen");
		treeMap.put(1400, "Robby");
		treeMap.put(100, "Trilochan");

		System.out.println(treeMap);
		treeMap.forEach((k, v) -> System.out.println(k + " = " + v));

		Integer lastKey = treeMap.lastKey();
		System.out.println(lastKey);

		Integer firstKey = treeMap.firstKey();
		System.out.println(firstKey);

		Entry<Integer, String> firstEntry = treeMap.firstEntry();
		System.out.println(firstEntry);

		Entry<Integer, String> lastEntry = treeMap.lastEntry();
		System.out.println(lastEntry);

		System.out.println("-------------------------------");

		TreeMap<String, Integer> treeMap1 = new TreeMap<>();
		treeMap1.put("James", 100);
		treeMap1.put("Brad", 200);
		treeMap1.put("Albert", 150);
		treeMap1.put("George", 160);
		treeMap1.put("Larry", 10);
		treeMap1.put("Ted", 1000);
		treeMap1.put("Paul", 10000);

		treeMap1.forEach((k, v) -> System.out.println(k + " = " + v));

	}

}

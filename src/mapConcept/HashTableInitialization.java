package mapConcept;

import java.util.Hashtable;

public class HashTableInitialization {

	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("Naveen", 100);
		hashtable.put("Tom", 200);
		hashtable.put("Lisa", 300);
		hashtable.put("Peter", 400);
		hashtable.put("Robby", 600);
		hashtable.put("Tri", 100);
		hashtable.put("Reddy", 200);
		hashtable.put("Ram", 300);
		hashtable.put("Sam", 400);
		hashtable.put("jam", 600);

		// hashtable.put(null, 100);
		// hashtable.put("Tri", null);

		System.out.println(hashtable.get("Naveen"));
		// System.out.println(hashtable.get(null));//NullPointerException
		// System.out.println(hashtable.get("Tri"));//NullPointerException

	}

}

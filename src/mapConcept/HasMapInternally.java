package mapConcept;

import java.util.HashMap;

public class HasMapInternally {

	public static void main(String[] args) {

		HashMap<String, Integer> mList = new HashMap<String, Integer>();
		mList.put("Naveen", 100);
		mList.put("Tom", 200);
		mList.put("Lisa", 300);
		mList.put("Peter", 400);
		mList.put("Ruby", 600);

		mList.put(null, 700);
		mList.put(null, 800);

		System.out.println();

	}

}

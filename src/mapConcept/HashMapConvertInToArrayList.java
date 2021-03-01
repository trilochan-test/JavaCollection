package mapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConvertInToArrayList {

	public static void main(String[] args) {

		Map<String, Integer> compMap = new HashMap<>();
		compMap.put("Google	", 10000);
		compMap.put("WalMart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 40000);
		compMap.put("Cisco	", 50000);

		System.out.println("Comp Map size: " + compMap.size());
		System.out.println("-----------------");

		compMap.forEach((k, v) -> System.out.println(k + " = " + v));

		System.out.println("-----------------");
		ArrayList<String> compNameList = new ArrayList<>(compMap.keySet());
		System.out.println("compNameList size: " + compNameList.size());
		System.out.println("-----------------");
		compNameList.forEach(k -> System.out.println(k));
		System.out.println("-----------------");
		ArrayList<String> compValuesList = new ArrayList<>(compMap.keySet());
		System.out.println("compValuesList size: " + compValuesList.size());
		System.out.println("-----------------");
		compNameList.forEach(k -> System.out.println(k));

	}

}

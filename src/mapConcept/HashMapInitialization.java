package mapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {
	
	
	public static HashMap<String, Integer> map3;
	
	static {
		map3=new HashMap<>();
		map3.put("A", 100);
		map3.put("B", 200);
		map3.put("C", 300);
	}

	public static void main(String[] args) {
		
		//1.using hashMap class
		HashMap<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2=new HashMap<>();
		
		
		//2.Static way:Static hashMap:
		Integer integer = HashMapInitialization.map3.get("A");
		System.out.println(integer);
		System.out.println(map3);
		
		
		//3.immutable map with only one single entry
		Map<Integer, String> singletonMap = Collections.singletonMap(101, "Trilochan");
		System.out.println(singletonMap.get(101));
		
	}

}

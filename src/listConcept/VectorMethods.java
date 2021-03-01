package listConcept;

import java.util.Collections;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(4);
		v.add(6);
		v.add(8);
		v.add(10);
		v.add(12);
		v.add(14);
		v.add(16);

		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println(v.remove(3));
		System.out.println(v);

		Vector<Integer> v1 = new Vector<>();
		v1.add(-99);

		v1.add(-96);
		v.addAll(v1);

		System.out.println(v);
		
		
		for (Integer integer : v) {
			System.out.println(integer);
		}
		
		Collections.sort(v);
		System.out.println(v);

	}

}

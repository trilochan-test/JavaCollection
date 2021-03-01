package SetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethods {
	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Gama");
		hs.add("Testing");
		hs.add("Alpha");
		hs.add(null);
		hs.add(null);

		System.out.println(hs);

		// contains()
		System.out.println(hs.contains("Testing"));

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 5, 6, 8, 9, 10 }));

		Set<Integer> second = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 5, 6, 7, 9 }));

		// get the union:combing both
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		System.out.println("--------------------------------------------");

		// get the intersection:commom elemtsx
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		System.out.println("--------------------------------------------");

		// get the differences:
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);

	}

}

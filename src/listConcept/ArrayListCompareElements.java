package listConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompareElements {

	public static void main(String[] args) {

		// 1.sort and then equals

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "E", "D"));

		Collections.sort(l1);
		Collections.sort(l2);

		System.out.println(l1.equals(l2));
		Collections.sort(l3);
		System.out.println(l2.equals(l3));

		// 2.compare two list--find additional elements

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "H"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));

		/*
		 * l4.removeAll(l5); System.out.println(l4);
		 */

		// 3.find out missing element
		/*
		 * l5.removeAll(l4); System.out.println(l5);
		 */

		// 4.find out common elements
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "H"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));

		l6.retainAll(l7);
		System.out.println(l6);

		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7, 8, 10));

		// al1.removeAll(al2);//find additional elements
		// al2.removeAll(al1);//find missing elements
		al1.retainAll(al2);// find common elements
		System.out.println(al1);
	}

}

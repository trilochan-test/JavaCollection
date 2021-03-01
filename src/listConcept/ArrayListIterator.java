package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Java");
		lang.add("Python");
		lang.add("PHP");
		lang.add("JavaScript");
		lang.add("C");

		System.out.println("----------------1.Typical for loop ----------------");

		// 1.Typical for loop
		for (int i = 0; i < lang.size(); i++) {
			System.out.println(lang.get(i));
		}

		System.out.println("----------------2.For each loop ----------------");

		// 2.For each loop
		for (String la : lang) {
			System.out.println(la);
		}

		System.out.println("----------------3.JDK 8-Lambda ----------------");

		// 3.JDK 8-Lambda
		lang.forEach(la -> System.out.println(la));

		System.out.println("----------------4.JDK 8  Streams With Lambda ----------------");

		// 4.With Streams
		lang.stream().forEach(la -> System.out.println(la));

		System.out.println("----------------5.Iterator ----------------");

		// 5.Iterator
		Iterator<String> it = lang.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("----------------6.ListIterator ----------------");

		// 6.ListIterator
		ListIterator<String> listIterator = lang.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}

}

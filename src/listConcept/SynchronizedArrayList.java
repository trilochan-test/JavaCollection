package listConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// 1.Collections.synchronizedList:Its a method
		List<String> langList = Collections.synchronizedList(new ArrayList<String>());
		langList.add("Java");
		langList.add("C");
		langList.add("C++");

		// Add,remove-we don't need to use explicit synchronization
		// To fetch\travel -we need to use explicit synchronization

		synchronized (langList) {
			Iterator<String> iterator = langList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		}

		System.out.println("-----------------");
		// 2.CopyOnwriteArrayList:It a class:Thread-safe/Synchronized already

		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();

		// we don't no use explicit synchronization for any
		// operation:add/remove/fetch(or)traverse

		empList.add("Trilochan");
		empList.add("Reddy");
		empList.add("Tri");
		empList.add("ObulaReddy");
		empList.add("Trill");
		empList.add("Obula");

		/*
		 * Iterator<String> iterator = empList.iterator();
		 * 
		 * do { System.out.println(iterator.next());
		 * 
		 * } while (iterator.hasNext());
		 * 
		 */
		for (Iterator<String> iterator2 = empList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);

		}

	}

}

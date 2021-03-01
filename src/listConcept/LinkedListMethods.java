package listConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		// LL constructors
		// LinkedList()
		// LinkedList(Collection c)

		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());// 0
		// add()
		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");
		System.out.println(names.size());// 2
		System.out.println(names);
		System.out.println(names.get(1));

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		names.add(4, "Trilochan");

		System.out.println(names);
		names.add(2, "Ram");
		System.out.println(names);

		LinkedList<String> users = new LinkedList<>();
		users.add("peter");
		users.add("Trump");

		// addAll()
		names.addAll(users);
		System.out.println(names);
		// addFirst()
		names.addFirst("Reddy");
		System.out.println(names);
		// addLast()
		names.addLast("Pavan");
		System.out.println(names);

		// remove()
		// names.remove(2);
		names.remove();// if no index given it will remove first element
		System.out.println(names);

		// removeAll()
		names.removeAll(users);
		System.out.println(names);

		// removeFirst
		names.removeFirst();
		// removeLast
 		names.removeLast();
		System.out.println(names);

		names.clear();
		System.out.println(names);

		LinkedList<String> lang = new LinkedList<>();
		lang.add("Java");
		lang.add("C");
		lang.add("python");
		lang.add("JavaScript");
		System.out.println(lang.size());

		// reverse the linkedList
		Iterator<String> iterator2 = lang.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
		
		
		
		//sort:
		Collections.sort(lang);
		System.out.println(lang);

	}

}

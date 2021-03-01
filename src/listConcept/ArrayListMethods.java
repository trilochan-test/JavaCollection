package listConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<String> langList = new ArrayList<String>(Arrays.asList("Java", "Python", "PHP", "Ruby"));

		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Trilochan", "Reddy", "ObulaReddy", "Reddy"));

		// 1.addAll()
		/*
		 * langList.addAll(namesList); System.out.println(langList);
		 * 
		 * langList.addAll(3, namesList); System.out.println(langList);
		 */

		// 2.clear()
		langList.clear();
		System.out.println(langList);

		// 3.clone()
		ArrayList<String> cloneList = (ArrayList<String>) namesList.clone();
		System.out.println(cloneList);

		// 4.contains()
		boolean contains = namesList.contains("Trilochan");
		System.out.println(contains);
		boolean contains2 = namesList.contains("HI");
		System.out.println(contains2);

		// 5.indexOf()
		int indexOf = namesList.indexOf("Reddy");
		System.out.println(indexOf);

		// 6.lastIndexOf()
		int lastIndexOf = namesList.lastIndexOf("Reddy");
		System.out.println(lastIndexOf);

		// 7.remove
		String remove = namesList.remove(0);
		System.out.println(remove);
		System.out.println(namesList);
		boolean remove2 = namesList.remove("Reddy");
		System.out.println(remove2);
		System.out.println(namesList);

		// 8.removeIf()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		// numbers.removeIf(num ->num%2==0);
		numbers.removeIf(num -> num % 2 == 1);
		System.out.println(numbers);

		// 9.retainAll()
		ArrayList<String> langnames = new ArrayList<String>(Arrays.asList("Java", "Python", "PHP", "Ruby", "Java"));
		langnames.retainAll(Collections.singleton("PHP"));
		System.out.println(langnames);

		// 10.subList()
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50));
		List<Integer> subList = num.subList(2, 9);
		System.out.println(subList);
		ArrayList<Integer> subList1 = new ArrayList<>(num.subList(2, 9));
		System.out.println(subList1);

		// 11.toArray()
		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "Python", "PHP", "Ruby", "C", "C++"));
		System.out.println(lang);
		Object[] array = lang.toArray();
		System.out.println(Arrays.toString(array));

		for (Object o : array) {
			System.out.println(o);
		}

	}

}

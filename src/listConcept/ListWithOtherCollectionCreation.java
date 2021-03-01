package listConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ListWithOtherCollectionCreation {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "Python", "PHP"));
		lang.forEach(la -> System.out.println(la));

		System.out.println("---------------");

		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(100, 200, 300));
		marks.stream().forEach(m -> System.out.println(m));

	}

}

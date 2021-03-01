package listConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 6, 5, 7, 8, 9, 7, 8, 9));

		// 1.By using Linked Hash Set
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(marksList);
		// System.out.println(linkedHashSet);
		ArrayList<Integer> removeDuplictesFromMarksList = new ArrayList<Integer>(linkedHashSet);
		System.out.println(removeDuplictesFromMarksList);

		// 2.By JDK 1.8 Streams()
		ArrayList<Integer> numList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 6, 5, 7, 8, 9, 7, 8, 9));
		List<Integer> removeDuplicatesFromNumList = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicatesFromNumList);

	}

}

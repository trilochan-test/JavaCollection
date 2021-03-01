package SetConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetMethods {

	enum lang {
		JAVA, JAVASCRIPT, PYTHON, RUBY, CSHARP
	}

	public static void main(String[] args) {

		// created a new enumset using enum
		EnumSet<lang> langs = EnumSet.allOf(lang.class);
		System.out.println(langs);

		// Empty EnumSet:
		EnumSet<lang> emptyEnumSet = EnumSet.noneOf(lang.class);
		System.out.println(emptyEnumSet);

		// range(e1,e2):
		EnumSet<lang> rangeEnum = EnumSet.range(lang.JAVASCRIPT, lang.RUBY);
		System.out.println(rangeEnum);

		// of():for particular or single create enumset
		EnumSet<lang> enumSetJAVASCRIPT = EnumSet.of(lang.JAVASCRIPT);
		System.out.println(enumSetJAVASCRIPT);

		EnumSet<lang> multipleEnumSet = EnumSet.of(lang.JAVASCRIPT, lang.RUBY);
		System.out.println(multipleEnumSet);

		// add() and addAll()
		EnumSet<lang> lang1 = EnumSet.allOf(lang.class);
		EnumSet<lang> lang2 = EnumSet.noneOf(lang.class);
		lang2.add(lang.JAVA);
		lang2.addAll(lang1);
		System.out.println(lang2);

		// How to iterate EnumSet:using iterator()
		EnumSet<lang> fullLangs = EnumSet.allOf(lang.class);
		Iterator<lang> iterator = fullLangs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		//remove() and removAll():
		EnumSet<lang> newLangs = EnumSet.allOf(lang.class);
		System.out.println(newLangs);
		boolean remove = newLangs.remove(lang.CSHARP);
		System.out.println(newLangs);
		boolean removeAll = newLangs.removeAll(newLangs);
		System.out.println(removeAll);
		
		

	}

}

package listConcept;

import java.util.Vector;

public class Vector2DConcept {

	public static void main(String[] args) {

		Vector<String> langVector = new Vector<String>();
		langVector.add("Java");
		langVector.add("C");
		langVector.add("C#");
		langVector.add("C++");
		langVector.add("Python");
		
		
		Vector osVector=new Vector();
		osVector.add(langVector);//0
		
		
		for (int i = 0; i < langVector.size(); i++) {
			String string = ((Vector<String>) osVector.get(0)).get(i);
			System.out.println(string);
			
		}

	}

}

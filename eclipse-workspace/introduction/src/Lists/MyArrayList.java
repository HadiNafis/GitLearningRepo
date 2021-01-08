package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList();
		
		Double x = 45.0;
		
		
		Pair<String, Integer> p1 = new Pair("Hadi", 6407);
		
		Pair<Boolean, String> p2 = new Pair(true, "Hello");
		
		p1.getDescription();
		p2.getDescription();
	}

	
}

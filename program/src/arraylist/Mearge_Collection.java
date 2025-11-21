package arraylist;

import java.util.ArrayList;

public class Mearge_Collection {

	public static void main(String[] args) {
		
		ArrayList<Object> a1 = new ArrayList<> ();
		
		a1.add("mango");
		a1.add("apple");
		a1.add("banana");
		a1.add("grapes");
		a1.add("pineApple");
		
		ArrayList<Object> a2 = new ArrayList<>();
		
		a2.add("potato");
		a2.add("tomato");
		a2.add("radish");
		a2.add("onion");
		a2.add("garlic");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("==================================================");
		
//		a1.addAll(a2);
//		System.out.println(a1);
//		
		System.out.println("====================================================");
		a1.addAll(2, a2);
		System.out.println(a1);
		
	}
}

package arraylist;

import java.util.ArrayList;

public class Remove_Element {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add(1);
		a1.add("PRAJWAL");
		a1.add(56);
		a1.add(21);
		a1.add(45);
		
		System.out.println(a1.remove(1));  // it take index
		
		System.out.println(a1.remove((Integer)56));  //it remove object
		
		System.out.println(a1);
	}

}

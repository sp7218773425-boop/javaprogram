package arraylist;

import java.util.ArrayList;

public class ar4 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> a1 = new ArrayList<>();
		
		a1.add(2);
		a1.add(8);
		a1.add(6);
		a1.add(4);
		a1.add(3);
		a1.add(1);
		
		//System.out.println(a1.contains(3));  // it print true if the object pass is present in arrayList
		
		System.out.println(a1.indexOf(0));
		System.out.println(a1.indexOf(1));
		System.out.println(a1.indexOf(2));
		System.out.println(a1.indexOf(3));
		System.out.println(a1.indexOf(4));
		System.out.println(a1.indexOf(5));

	
	}
}

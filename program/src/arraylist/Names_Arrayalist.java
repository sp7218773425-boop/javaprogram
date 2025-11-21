package arraylist;

import java.util.ArrayList;

public class Names_Arrayalist {
	public static void main(String[] args) {
		
		ArrayList<Object> names = new ArrayList<>();
		
		names.add("ramesh");
		names.add("mahesh");
		names.add("suresh");
		names.add("ajay");
		names.add("pavan");
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.print(names.get(i) + " ,");
		}
	}

}

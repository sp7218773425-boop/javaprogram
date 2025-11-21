package arraylist;

import java.util.ArrayList;

public class Attendence_List  {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList ();
		
		list.add(new Attendence("Ajay", "PECM26", "ajay@123.com", "9876543210"));
		list.add(new Attendence("Vjay", "PECM27", "vijay@123.com", "4876943210"));
		list.add(new Attendence("Mayur", "PECM26", "mayur@123.com", "5776573210"));
		list.add(new Attendence("Nikhil", "PECM28", "nikhil@123.com", "7899543210"));
		list.add(new Attendence("Pavan", "PECM26", "pavan@123.com", "3776333210"));
		list.add(new Attendence("Akshay", "PECM28", "akshay@123.com", "9776333210"));
		list.add(new Attendence("Vishal", "PECM26", "vishal@123.com", "8877533210"));
		
		//System.out.println(list);
		System.out.println(checkBatch(list, "PECM27"));
		checkPhone(list);
	}
	
	public static ArrayList checkBatch(ArrayList list , String batchcode)
	{
		ArrayList filter = new ArrayList();
		
		for (int i = 0; i < list.size() ; i++)
		{
			Attendence a1 = (Attendence)list.get(i);
			
			if (a1.batch.equals(batchcode))
			{
				filter.add(a1);
			}
		}
		
		return filter ;
	}
	
	public static void checkPhone(ArrayList list)
	{
		for (int i = 0; i < list.size() ; i++) {
			
		Attendence a1 = (Attendence)list.get(i);
		
			if (a1.phno.length()== 10) 
			{
				int ch = a1.phno.charAt(0);
				
				if (ch >= '6' && ch<='9') 
				{
					continue ;
				}
				else
				{
					System.out.println(a1.name + " gives wrong phon no..!");
				}
				
			}
			else
			{
				System.out.println(a1.name + " gives wrong phon no..!");
			} 
		
		
		}
	}
}

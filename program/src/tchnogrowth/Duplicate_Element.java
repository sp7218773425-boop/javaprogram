package tchnogrowth;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate_Element {
	
	public static void main(String[] args) {
		
	
		
		
		int ch [] = {1,2,3,4,5,2};
		
		int count = 0 ;
		
		for ( int i = 0; i < ch.length; i++ ) 
		{
			for (int k = i+1; k < ch.length; k++)
			{
				if (ch[i]==ch[k])
				{
					count ++ ;
					break ;
				}
			}
		}
		
		if (count > 0)
		{
			System.out.println("repeated element found");
		}
		else
		{
		System.out.println("NO element repeated");
	}	
		
//		ArrayList  ch = new ArrayList  ();
//		
//		ch.add('r');
//		ch.add('a');
//		ch.add('b');
//		ch.add('r');
//		ch.add('r');
//		ch.add('c');
//		
//		HashSet h = new HashSet (ch);
//		
//		System.out.println(h);
//		
//		
//		
		
		
		
		
		
		
		
		
	}
}

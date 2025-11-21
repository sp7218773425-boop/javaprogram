package arrays;

public class CombineArray 
{
	public static void main(String[] args)
	{
		
		int a [] = {1,2,3,4,5} ;
		int b [] = {11,12,13,14,15};
		
		int c [] = new int [a.length + b.length] ;
		
		int memory = 0 ;
		
		for (int i = 0; i < a.length; i++)
		{
			c[memory] = a [i] ;
			memory++ ;	
		}
		for (int i = 0; i < b.length; i++)
		{
			c[memory] = b[i] ;
			memory++ ;
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + ",");
		}
	}

}

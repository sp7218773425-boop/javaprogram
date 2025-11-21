package arrays;
public class Uniq_No
{
	public static void main(String[] args)
	{		
		int a [] = {2,3,4,5,7,6,9};
		int count= 0 ;
		for (int i = 0; i < a.length; i++)
		{
			count = 0 ;
			 
			for (int j = 0; j < a.length; j++)
			{
				if (a[i] == a[j]) 
				{
					count++ ;
				}
				if (count > 1)
				{
					break ;
				}
			}
			
			if (count > 1)
			{
				break ;
			}
		}
		
		if (count == 1)
		{
			System.out.println("it is a unique Array..!");
		} 
		else
		{
			System.out.println("it is not a unique Array..!");
		}	
	}
}

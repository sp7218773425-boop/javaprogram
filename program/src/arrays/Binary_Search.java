package arrays;

import java.util.Scanner;

public class Binary_Search 
{
	public static void main(String[] args)
	{
		int ip [] = {5,12,25,37,49,55,78,123,345,456,678,990};
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a key value");
		int key = sc.nextInt();
		
		int start = 0 , end = ip.length-1 ;
		int mid = (start +end)/2 ;
		
		boolean found = false ;
		
		for (int i = 0; i < ip.length; i++) 
		{
			if (key == ip[mid]) 
			{
				found = true ;
				break ;
			}
			
			else if (key > ip[mid])
			{
				start = mid + 1 ;
			}
			
			else if (key < ip[mid])
			{
				end = mid - 1 ;
			}
			
			mid = (start + end) / 2 ;
		}
		
		if (found == true)
		{
			System.out.println("Key is found at " + (mid + 1) + " th position..!");
		}
		else
		{
			System.out.println("key is not found..!");
		}
	}
}

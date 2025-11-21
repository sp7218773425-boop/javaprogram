package arrays;

import java.util.Scanner;

public class Repeat_Element_In_Array
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a key.");
		int key = s.nextInt();
		
		int a [] = {2,2,3,4,5,6,5,2,7,8,2,8,0,2};
		
		int count = 0 ; 
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == key) 
			{
				count++ ;
			}
		}
		
		if (count == 0)
		{
			System.out.println("Key not found..");
		}
		else
		{
			System.out.println(key + " is repeated " +count+ " times");
		}
	}

}

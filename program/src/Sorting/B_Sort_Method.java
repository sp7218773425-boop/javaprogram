package Sorting;

import java.util.Scanner;

public class B_Sort_Method 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of array.");
		int size = sc.nextInt();
		
		//int a [] = {25,97,18,5,66,3,98,1};
		int [] a = new int [size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter array element");
			int e = sc.nextInt();
			
			a[i] = e;
		}
		
		printArray(a);
			
	}
	
	public static void printArray(int a [] )
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++)
			{
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp ;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + ",");
		}
		
	}
}

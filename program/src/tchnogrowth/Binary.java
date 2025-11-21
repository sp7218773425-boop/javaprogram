package tchnogrowth;

import java.util.Scanner;

public class Binary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter key value");
		int key = sc.nextInt();
		
		int arr [] = {1,2,3,5,8,9,7,3};
		
		int start = arr[0];
		int end = arr[arr.length-1];
		
		int mid = (start + end ) / 2 ;
		
		boolean found = true ;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (key == mid)
			{
				found = true ;
				break ;
			}
			else if( key > mid)
			{
				start = mid + 1 ;
			}
			else if( key < mid)
			{
				end = mid - 1 ;
			}
			
			mid =  (start + end ) / 2 ;
			
		}
		
		if (found == true)
		{
			System.out.println("key is found " );
		} 
		else
		{
			System.out.println("key is not found");
		}
	}

}


package arrays;

import java.util.Scanner;

public class Linear_Search {
	
	public static void main(String[] args) {
		
		Scanner m = new Scanner(System.in);
		
		System.out.println("Enter a key..");
		int key = m.nextInt();
		
		int a [] = {1,2,3,4,5,6,7,8,9} ;
		
		int i ;
		
		for (i = 0; i < a.length; i++)
		{
			
			if (a[i] == key) {
				
				System.out.println("Element fount at " + i+ " index");
				break;
			}
		}
		
		if (i == a.length) {
			
			System.out.println("Elenemt not Found..");
		}
		
	}
}

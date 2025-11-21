package tchnogrowth;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Length {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please provide a String ");
//		String s = sc.next();
		
		String s = "technogrowth";
		
		char ch [] = new char [s.length()];
	
		
		int count = 0 ;
		
		for (char c : ch)
		{
			count ++ ;
		}
		
		System.out.println("length of the String is : " + count);
	}

}

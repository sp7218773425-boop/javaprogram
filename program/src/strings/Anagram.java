package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		char ch1 [] = sc.next().toLowerCase().trim().toCharArray();
		
		System.out.println("Enter secong string");
		char ch2 [] = sc.next().toLowerCase().trim().toCharArray();
		
		if (ch1.length==ch2.length)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			int i ;
			for (i = 0; i < ch2.length; i++) 
			{
				if (ch1[i] != ch2[i])
				{
					break ;
				}
			}
			
			if (i == ch1.length)
			{
				System.out.println("It is Anagram..");	
			}
			else
			{
				System.out.println("Not Anagram..");
			}
			
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}

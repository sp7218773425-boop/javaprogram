package strings;

import java.util.Scanner;

public class Replace_Method 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String ip = sc.nextLine();
		
		System.out.println("please select a character which is replace ");
		char s = sc.next().charAt(0);
		
		System.out.println("Character Replace by..");
		char r = sc.next().charAt(0);
		
		String ans = replaceChar(ip, s, r);
		System.out.println(ans);
		
	}
	public static String replaceChar(String ip ,char s , char r )
	{	
		String ans = "";

		for (int i = 0; i < ip.length(); i++)
		{
			char ch = ip.charAt(i);
			
			if (ch == s) 
			{
				ans = ans + r ;
			}
			else
			{
				ans = ans + ch ;
			}
		}
		  return ans ;
	}
	

}

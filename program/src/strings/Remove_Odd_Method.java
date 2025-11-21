package strings;

import java.util.Scanner;

public class Remove_Odd_Method {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String ip = sc.nextLine().trim();
		
		System.out.println(removeOddChar(ip));
	}
	
	public static String removeOddChar(String ip)
	{
		String ans = "";
		
		for (int i = 0; i < ip.length(); i++) 
		{
			char ch = ip.charAt(i);
			
			if (ch % 2 != 0 && ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)))
			{
				continue ;
			} 
			else 
			{
				ans = ans + ch ;
			}
		}
		
		return ans ;
	}
}

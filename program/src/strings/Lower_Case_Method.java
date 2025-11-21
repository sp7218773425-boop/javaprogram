package strings;

public class Lower_Case_Method 
{	
	
	public static void main(String[] args) 
	{
		
		String ans = toLower("RiTeSh");
		System.out.println(ans);
		
		String ans1 = toUpper(ans);
		System.out.println(ans1);
	
	}
	
	public static String toLower(String s)
	{
		 String convert = "" ;
		
		for (int i = 0; i < s.length(); i++)
		{
			
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				convert =  convert +(char)(s.charAt(i)+32) ;
			} 
			else 
			{
				 convert =  convert + s.charAt(i) ;
			}
			
			
		}
		return  convert;
	}
	
	
	public static String toUpper(String s)
	{
		 String convert = "" ;
		
		for (int i = 0; i < s.length(); i++)
		{
			
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				 convert =  convert +(char)(s.charAt(i)-32) ;
			} 
			else 
			{
				 convert = convert + s.charAt(i) ;
			}
			
			
		}
		return  convert;
	}
	


}

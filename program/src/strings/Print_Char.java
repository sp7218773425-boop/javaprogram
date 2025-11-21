package strings;

public class Print_Char {
	public static void main(String[] args) {
		
		String s1 = "Qspider" ;
		
		for (int i = 0 ; i < s1.length() ; i++) 
		{
			System.out.println(s1.charAt(i));
		}
		
		//reverse same
		
		for (int i = s1.length()-1; i >= 0; i--) 
		{
			System.out.println(s1.charAt(i));
		}
	}
}

package strings;

public class Method_StringToArray {
	
	public static char[] stringToArray(String s)
	{
		char ch [] = new char [s.length()];
		
		for (int i = 0; i < ch.length; i++)
		{
			ch[i] = s.charAt(i);
		}
		
		return ch ;
	}

	public static void main(String[] args) {
		
		char ans [] = stringToArray("India");
		
		
		for (int i = 0; i < ans.length; i++)
		{
			System.out.println(ans[i]);
		}
	}
}

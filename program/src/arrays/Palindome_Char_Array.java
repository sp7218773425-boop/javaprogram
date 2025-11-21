package arrays;

public class Palindome_Char_Array {
	
	public static void main(String[] args) {
		
		char [] a = {'n','i','t','i','n'} ;
		char b [] = new char [a.length] ;
		
		int j = 0 ;
		
		for(int i = a.length-1 ; i >= 0 ; i--)
		{
			b[j] = a[i] ;
			j++ ;
		}
		
		int check = 0 ;
		
		for (int i = 0; i < b.length; i++)
		{
				if (a[i] != b[i]) 
				{
					check++ ;
				}
		}
				if (check > 0)
				{
					System.out.println(" it is not a palindrom Array..");
				}
				else
				{
						System.out.println(" it is a palindrom Array..");
				}		
	}
}

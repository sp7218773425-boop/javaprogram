package arrays;

public class Palindrom_Arrays {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,6,5,4,2,1};
		int b [] = new int [a.length] ;
		
		int j = 0 ;
		for (int i = a.length-1; i >= 0 ; i--)
		{
			b[j] = a[i] ;
			j++ ;
		}
		
		int check = 0 ;
		
		for (int i = 0; i < b.length; i++) {
			
			if (a[i] != b[i]) 
			{
				check++ ;
			}
		}
			if (check > 0) {
				System.out.println(" it is not a palindrom Array..");
			} else {
				System.out.println(" it is a palindrom Array..");
			}
			
		
		
	}
}

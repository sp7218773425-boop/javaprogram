package arrays;

public class Reverse_Array {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int b [] = new int [a.length] ;
		
		int j = 0 ;
		for (int i = a.length-1; i >= 0 ; i--)
		{
			b[j] = a[i] ;
			j++ ;
		}
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i] + ",");
		}
	}
}

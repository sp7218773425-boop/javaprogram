package arrays;

public class CopyArray_One_to_Another {
	public static void main(String[] args) {
		
		int a [] = {45,689,489,269,5468,486,168,43654,35469,46,64,6463,468,768,7};
		
		int b [] = new int [a.length];
		
		for (int i = 0; i < b.length; i++) {
			
			b[i] = a[i] ;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "," );
		}
	}
}

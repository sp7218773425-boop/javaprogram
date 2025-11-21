package arrays;

public class EvenNumInArray {
	public static void main(String[] args) {
		
		int a [] = {45,689,489,269,5468,486,168,43654,35469,46,64,6463,468,768,7};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 == 0) {
				System.out.print(a[i]+ ",");
			}
		}
	}

}

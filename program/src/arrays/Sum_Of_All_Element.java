package arrays;

public class Sum_Of_All_Element {
	public static void main(String[] args) {
		
		int a [] = {45,689,489,269,5468,486,168,43654,35469,46,64,6463,468,768,7};
		
		int sum = 0;
		
		for (int i =0; i < a.length; i++) 
		{
			sum += a[i];		
		}
		System.out.println("The total sum of all element is : " + sum);
	}

}

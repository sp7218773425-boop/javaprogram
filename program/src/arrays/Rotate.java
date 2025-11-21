package arrays;

public class Rotate {
	public static void main(String[] args) {
		
		int a [] = {1,58,32,67,44,16};
		
		int temp = a[a.length-1];
		
		for (int i = a.length-1; i > 0; i--)
		{
			a[i] = a[i-1];
		}
		
			a[0] = temp ;
			
			for (int i = 0; i < a.length; i++)
			{
				System.out.print(a[i] + ", ");
			}
	}

}

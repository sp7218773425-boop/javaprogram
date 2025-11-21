
import java.util.Scanner;

public class No_To_World {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		
		
		
		//String op = "";
			System.out.println("enter no");
			int num = sc.nextInt();
			
			while (num != 0)
			{
			
				int rem = num % 10 ;
				String op ="";
				
				switch (rem)
				{
					case 0: op=" zero "+op; break ;
					case 1: op=" one "+op; break ;
					
				
				}
				
				num /= 10 ;
				
			}
			
			
			
		
		
		
	}

}

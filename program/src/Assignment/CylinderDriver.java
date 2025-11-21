package Assignment;

import java.util.Scanner;

public class CylinderDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		Cylinder [] c = new Cylinder [5];
		
		for (int i = 0; i < c.length; i++)
		{
			System.out.println("Enter Cylinder name");
			String cylindername = sc.next();
			
			System.out.println("Enter 1 Gas name");
			String gasname1 = sc.next();
			
			System.out.println("Enter 1 Gas Qty");
			double gasqty1 = sc.nextDouble();
			
			System.out.println("Enter 2 Gas name");
			String gasname2 = sc.next();
			
			System.out.println("Enter 2 Gas Qty");
			double gasqty2 = sc.nextDouble();
			
			System.out.println("Enter 3 Gas name");
			String gasname3 = sc.next();
			
			System.out.println("Enter 3 Gas Qty");
			double gasqty3 = sc.nextDouble();
			
			System.out.println(" Cylinder loaded succesfully..! ");
			System.out.println("Plz Enter Another Cylinder details..! ");
			
			
			
			c [i] = new Cylinder  (cylindername,gasname1,gasqty1,gasname2,gasqty2,gasname3,gasqty3);
		}
		
		for (int i = 0; i < c.length; i++) 
		{
			c[i].displayCylinder();
		}
		
		double [] s = new double [3];
				
			double sum1 = 0 ;
			double sum2 = 0 ;
			double sum3 = 0 ;
		
		for (int i = 0; i < c.length; i++)
		{
			sum1 += c[i].gasqty1 ;
			sum2 += c[i].gasqty2 ;
			sum3 += c[i].gasqty3;
			
		}
		
		s[0] = sum1 ;
		s[1] = sum2 ;
		s[2] = sum3 ;
		
		double max = s[0] ;
		
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i] > max)
			{
				max = s[i] ;
			}
		}
		
		System.out.println("max qty of gas : " + max);
	}
}
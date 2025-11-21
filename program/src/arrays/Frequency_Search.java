package arrays;

public class Frequency_Search 
{
	public static void main(String[] args)
	{
	
		int a[] = {5,8,9,7,5,9,7,0};
		int freq [] = new int [a.length];
		
		for (int i = 0; i < freq.length; i++)
		{
			int count = 1 ;
			
			if (freq [i] != -1)
			{
				for (int j = i+1; j < freq.length; j++)
				{
					if (a[i] == a[j])
					{
						count++ ;
						freq[j] = -1 ;
					}
				}
			}
			
			if (freq[i] != -1)
			{
				freq[i] = count ;
			}
		}
	
		for (int i = 0; i < a.length; i++)
		{
			if (freq[i] != -1)
			{
				System.out.println(a[i] + "is repeated " + freq[i] + " times..");
			}
		}
	}
}

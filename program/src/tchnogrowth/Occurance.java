package tchnogrowth;

public class Occurance {
	
	public static void main(String[] args) {
		
		String s = "Technogrowth";
		
		char ch [] = s.toCharArray();
		
		int count = 1 ;
		
		for (int i = 0; i < ch.length; i++)
		{
			
				
				for (int j = i+1; j < ch.length; j++)
				{
					
					if (ch[i]==ch[j])
					{
						count++ ;
						
					}
				}
				System.out.println(ch[i] + " count is : " + count);
			}
			
	}

}

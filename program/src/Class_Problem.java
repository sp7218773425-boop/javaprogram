

public class Class_Problem {
	public static void main(String[] args) {
		
		String  s = "3456789";
		
		char [] c = new char [s.length()];
		
		for (int i = 0; i < c.length; i++) {
			
			c[i] = s.charAt(i);
		}
		
		
        int [] res = new int [s.length()];
		
		int p = 0 ;
		int k = 2;
		
		for (int i = c.length-k; i>=0 ; i--,p++)
		{
				res[p] = c[i];
		}
	
		for (int i = 0; i < res.length; i++) {
			
			System.out.println(res[i]);
		}
				
			
	}

	
}

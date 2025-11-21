package strings;

public class String_Methods {
	
	public static void main(String[] args) {
		
		String s1 = "Maharashtra" ;
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo("tra"));
		System.out.println(s1.concat(" State"));
		System.out.println(s1.contains("Maha"));
		System.out.println(s1.endsWith("tra"));
		System.out.println(s1.equals("maharashtra"));
		System.out.println(s1.equals("Maharashtra"));
		System.out.println(s1.equalsIgnoreCase("maharashtra"));
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode()=="Maharashtra".hashCode());
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.indexOf('r' , 5));
		System.out.println(s1.indexOf("ra"));
		System.out.println(s1.indexOf("ra" , 5));
		System.out.println(s1.isEmpty());
		System.out.println("".isEmpty());
		System.out.println(s1.lastIndexOf("ra"));
		System.out.println(s1.lastIndexOf("ra" , 6));
		System.out.println(s1.lastIndexOf("ra" , 9));
		System.out.println(s1.length());
		System.out.println(s1.replace('a', '@'));
		
		String [] a = s1.split("ra");
			for (int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
			
		System.out.println("===========================");	
			
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(4 , 8));
		
		char ch [] = s1.toCharArray() ;
		
			for (int i = 0; i < ch.length; i++)
			{
				System.out.print(ch[i] + " ");
			}
				System.out.println();
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println("   hiii   ".trim());
	
	}

}

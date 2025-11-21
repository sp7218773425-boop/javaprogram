package practice_mock;

public interface Raja {

	int a = 10 ;
	String r = "Raja" ;
	
	char d = 'J' ;
	
	void dance ();
	void draw ();
	
	public static void demo()
	{
		System.out.println("demo from RAJA");
	}
}

interface Rani
{
	int a = 50 ;
	String r = "RANI" ;
	
	char c = 'R' ;
	
	void dance ();
	void draw ();
	
	public static void demo()
	{
		System.out.println("demo from RANI");
	}
}

class Roja implements Raja,Rani
{

	
	public void dance()
	{
		System.out.println("Lavaniii");
	}

	public void draw()
	{
		System.out.println("Painting");	
	}
	
//	public void demo()
//	{
//		System.out.println(" demo override");
//	}
	
}

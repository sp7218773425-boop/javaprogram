package practice_mock;

public class AB_Driver 
{

	public static void main(String[] args)
	{
		
		AB1 a = new AB2 (); //up-casted
		
		a.demo();
		a.test();
		
		AB2 b = new AB2 (); // without up-casted
		
		b.demo();
		b.test();
	}
}

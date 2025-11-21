package practice_mock;

public class Method_Overriding {
	
	static int a = 10 ;
	double d = 10.22 ;
	
	
	public void test()
	{
		System.out.println("from test of parent");
	}
	
	public static void demo()
	{
		System.out.println("static from parent");
	}

}

class A extends Method_Overriding
{
	static int a = 100 ;
	double d = 100.22222 ;
	
	
	public void test()
	{
		System.out.println("from test of child");
	}
	
	public static void demo()
	{
		System.out.println("static from child");
	}
}


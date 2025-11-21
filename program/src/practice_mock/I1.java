package practice_mock;

public interface I1 {
	
	int a = 9 ;
	
	//char c;---> it is static and final so we need to initialize it in current interface .
	
	int b = 10 ;
	
	void demo();
	void abc();
	
	public abstract void name();
	
	public static void test()
	{
		System.out.println("from test of I1");
	}

}

class CI1 implements I1
{
	public void name()
	{
		System.out.println(" name from class");
	}

	
	public void demo() {
		
		System.out.println("demo from class");
	}

	
	public void abc() {
		
		System.out.println("abc from class");
	}
}



package practice_mock;

public abstract class AB1 {
	
	public void demo()
	{
		System.out.println("demo from AB1");
	}
	
	public abstract void test();

}

class AB2 extends AB1
{
	public void test()
	{
		System.out.println("test fron child");
	}
	
	public void demo()
	{
		System.out.println("demo from child");
	}
}

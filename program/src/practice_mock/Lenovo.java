package practice_mock;

public abstract class Lenovo 
{
	
	public void welcome(String name)
	{
		System.out.println("Welcome.. " +name+ " To the word of lenovo..");
	}
	
	public abstract void calculator(int a , int b);
}

class Windows extends Lenovo
{
	public void calculator(int a , int b)
	{
		System.out.println( "sum --> " + (a+b));
	}
}

class Linux extends Lenovo
{
	public void calculator(int a , int b)
	{
		System.out.println("Mul --> " +(a*b));
	}

}

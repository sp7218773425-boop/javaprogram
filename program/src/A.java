
public class A {
	
private static A a ;
	
	private A() {}
	
	public static A getObj()
	{
		if (a != null) 
		{
			return a ;
		}
		else
		{
			a = new A ();
			return a ;
		}
	}
}

class B
{
	public static void main(String[] args) {
		
		A a1 = A.getObj();
		A a2 = A.getObj();
		
		System.out.println(a1);
		System.out.println(a2);
	}
}




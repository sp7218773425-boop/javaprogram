package practice_mock;

public class B_Driver {
	
	public static void main(String[] args) {
		
		A a1 = new A (); //child object ref use to invoke then it comes from child class
		
		a1.demo();
		a1.test();
		
		System.out.println("======================");
		
		Method_Overriding m1 = new A ();	// Up-casting id done here
		
		m1.demo();		//overriding --> parent ref use then it comes from parent class.
						//if we try to override static method then Method shadowing is happened.
		m1.test();
		
		System.out.println("======================");
		
		Method_Overriding.demo();	//static method called by class name.
		
		System.out.println("======================");
		
		System.out.println(a1.a);
		System.out.println(a1.d);
		
		System.out.println("======================");
		
		System.out.println(m1.a);
		System.out.println(m1.d);
		
		System.out.println(Method_Overriding.a);
		
	}

}

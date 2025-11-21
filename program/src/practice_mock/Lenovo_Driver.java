package practice_mock;

public class Lenovo_Driver {

	public static void main(String[] args) {
		
		Lenovo l1 = new Windows ();
		
		l1.welcome("Ajay");
		l1.calculator(2, 3);
		
		Lenovo l2 = new Linux();
		
		l2.welcome("Shubham");
		l2.calculator(3, 3);
	}
}

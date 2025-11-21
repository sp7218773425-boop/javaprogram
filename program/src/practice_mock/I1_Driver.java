package practice_mock;

public class I1_Driver {
	public static void main(String[] args) {
		
		CI1 i = new CI1();
		
		i.abc();
		i.demo();
		i.name();
		
		System.out.println(I1.a);
		
		I1.test();
	}

}

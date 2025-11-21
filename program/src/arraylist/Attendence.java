package arraylist;

public class Attendence {
	
	String name ;
	String batch ;
	String email ;
	String phno ;
	
	Attendence () {}

	Attendence(String name, String batch, String email, String phno)
	{
		super() ;
		
		this.name = name;
		this.batch = batch;
		this.email = email;
		this.phno = phno;
	}
	
	public static void displayAttendence()
	{
//		System.out.println(name);
//		System.out.println(batch);
//		System.out.println(email);
//		System.out.println(phno);
    }

	@Override
	public String toString() {
		return "[name=" + name + ", batch=" + batch + ", email=" + email + ", phno=" + phno + "]";
	}
}

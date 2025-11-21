package practice_mock;

public class Student_Driver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Shubham", 25, "CS", 88.25);
		System.out.println(s1);
		
		Student s2 = new Student("Kalpesh", 27, "IT", 65.25);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("====================================");
		
		Student s3 = new Student("Vaibhav", 25, "CS", 80.25);
		System.out.println(s3);
		
		Student s4 = new Student("Vaibhav", 25, "CS", 80.25);
		System.out.println(s4);
		
		System.out.println(s3==s4);
		System.out.println("equals-->" + s3.equals(s3));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s3.hashCode()==s4.hashCode());
		
	}
	

}

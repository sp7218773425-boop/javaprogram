package practice_mock;

public class Student {
	
	String name ;
	int age ;
	String branch ;
	double marks ;
	
	public Student() {}

	public Student(String name, int age, String branch, double marks)
	{
		super();
		this.name = name;
		this.age = age;
		this.branch = branch;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", branch=" + branch + ", marks=" + marks + "]";
	}

	
}

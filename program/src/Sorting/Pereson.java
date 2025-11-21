package Sorting;

public class Pereson
{
	String name ;
	int mark ;
	
	Pereson() {}

	public Pereson(String name, int mark)
	{
		
		this.name = name;
		this.mark = mark;
	}
	
	public void displayPereson()
	{
		System.out.println("Name : " + name);
		System.out.println("Mark : " + mark);
	}				
	
}

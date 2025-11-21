package Sorting;

public class Pereson_Driver
{
	public static void main(String[] args) 
	{

		Pereson p [] = new Pereson [6] ;
		
		p[0] = new Pereson ("Raju", 57) ;
		p[1] = new Pereson ("Kaju", 75) ;
		p[2] = new Pereson ("Kapil", 36) ;
		p[3] = new Pereson ("Manoj", 48) ;
		p[4] = new Pereson ("Sunil", 55) ;
		p[5] = new Pereson ("Sunny", 89) ;
		
		Pereson SortedAns [] = sortPerson(p);
		
		for (int i = 0; i < SortedAns.length; i++) 
		{
			SortedAns[i].displayPereson();
		}
	}
	
	public static Pereson [] sortPerson(Pereson [] p)
	{
		for (int i = 0; i < p.length-1; i++)
		{
			for (int j = 0; j < p.length-1-i; j++) 
			{
				if (p[j].mark > p[j+1].mark)
				{
					Pereson temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp ;
				}
			}
		}
		
		return p ;
	}
}

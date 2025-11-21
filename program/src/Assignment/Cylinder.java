package Assignment;

class Cylinder 
{
	String cylindername ;
	String gasname1 ;
	double gasqty1 ;
	String gasname2 ;
	double gasqty2;
	String gasname3 ;
	double gasqty3;
	
	
	Cylinder() {} ;
	
	 Cylinder(String cylindername,String gasname1, double gasqty1,String gasname2 ,double gasqty2,String gasname3, double gasqty3) 
	{
		this.cylindername = cylindername;
		this.gasname1 = gasname1;
		this.gasqty1 = gasqty1;
		this.gasname2 = gasname2;
		this.gasqty2 = gasqty2;
		this.gasname3 = gasname3;
		this.gasqty3 = gasqty3;
	}

	public void displayCylinder()
	{
		System.out.println("Cylinder name : " +cylindername);
		System.out.println("Gas 1 name : " +gasname1);
		System.out.println("Gas 1 Qty : "+gasqty1 );
		System.out.println("Gas 2 name : " +gasname2);
		System.out.println("Gas 2 Qty : "+gasqty2 );
		System.out.println("Gas 3 name : " +gasname3);
		System.out.println("Gas 3 Qty : "+gasqty3 );
		System.out.println("====================================");
	}
}

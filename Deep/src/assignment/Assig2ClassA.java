/*Day3: 12-Jan-19: Assignment: We have to print in below sequence (Assig2ClassA and Assig2ClassB)
 Parent Default Constructor
 Parent 2 parameter Constructor
 Parent 1 parameter Constructor
 Child Default Constructor
 Child 2 parameter Constructor
 Child 1 parameter Constructor*/


package assignment;

public class Assig2ClassA {
	
	public Assig2ClassA() {
		System.out.println("Parent Default Constructor");
	}
	
	public Assig2ClassA(int a) {
		this (11,12);
		System.out.println("Parent 1 parameter Constructor");
	}
	
	public Assig2ClassA(int a, int b) {
		this ();
		System.out.println("Parent 2 parameter Constructor");
	}
}




// Same question by using method instead of constructor

/*public class Assig2ClassA {
	
	public void pm1()
	{
		System.out.println("Parent Default method");
	}
	public void pm1(int a)
	{
		this.pm1(11, 12);
		System.out.println("Parent 1 parameter method");
	}
	public void pm1(int a, int b)
	{
		this.pm1();
		System.out.println("Parent 2 parameter method");
	}
}*/
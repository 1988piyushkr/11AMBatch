package assignment;
// Day3: 12-Jan-19: Assignment
public class Assig2ClassB extends Assig2ClassA{
	
	public Assig2ClassB() {
		super (11);
		System.out.println("Child Default Constructor");
	}
	
	public Assig2ClassB(int a) {
		this (11,12);
		System.out.println("Child 1 parameter Constructor");
	}
	
	public Assig2ClassB(int a, int b) {
		this ();
		System.out.println("Child 2 parameter Constructor");

    }
	
	public static void main(String[] args) {
		Assig2ClassB obj = new Assig2ClassB(21);
	}
}




//Same question by using method instead of constructor

/*public class Assig2ClassB extends Assig2ClassA{
	public void cm1()
	{
		super.pm1(11);
		System.out.println("Child Default method");
	}
	public void cm1(int a)
	{
		this.cm1(11, 12);
		System.out.println("Child 1 parameter method");
	}
	public void cm1(int a, int b)
	{
		this.cm1();
		System.out.println("Child 2 parameter method");
	}
	public static void main(String[] args) {
		Assig2ClassB obj = new Assig2ClassB();
		obj.cm1(11);
	}
}*/


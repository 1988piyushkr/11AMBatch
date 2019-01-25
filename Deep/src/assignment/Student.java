// Day 1: 05-Jan-19: Assignment:

package assignment;

public class Student {
	
	int Age;
	int Roll_No;
	
	public void display1() 
	{
		System.out.println("Welcome All");		
	}	
	public void display2() 
	{
		System.out.println("Welcome All of you");		
	}
	
	public static void main(String[] args) {
		
	Student piyush= new Student();
	Student kumar= new Student();
	
	piyush.Age=22;
	System.out.println(piyush.Age);
	piyush.Roll_No=50;
	System.out.println(piyush.Roll_No);
	piyush.display1();
	piyush.display2();
	
	kumar.Age=28;
	System.out.println(kumar.Age);
	kumar.Roll_No=10;
	System.out.println(kumar.Roll_No);	
	kumar.display1();
	kumar.display2();
	
	}
}
	

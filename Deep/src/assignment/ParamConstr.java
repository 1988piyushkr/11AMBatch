//Day 1: 05-Jan-19: Assignment:

package assignment;

public class ParamConstr {
	public ParamConstr() 
	{
		this(1,2); //move to constructor with two parameter
		System.out.println("Constructor with no parameter/default Constructor");
	}
	public ParamConstr(int a) 
	{
		this(1,2,3); //move to three parameterized constructor
		System.out.println("Constructor with one parameter");
	}
	public ParamConstr(int p,int q) 
	{
		System.out.println("Constructor with two parameter"); //This will print first
	}
	public ParamConstr(int p,int q, int r)    
	{
		this(); //move to default constructor
		System.out.println("Constructor with three parameter"); 
	}
	public static void main(String[] args) {
			ParamConstr obj = new ParamConstr(1); // Whenever we create object, constructor will be called
	}
	}


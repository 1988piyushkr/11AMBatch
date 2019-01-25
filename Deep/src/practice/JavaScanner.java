package practice;

import java.util.Scanner;

/*public class JavaScanner {
public static void main(String[] args) {
	System.out.println("Please enter value of a");
	Scanner s = new Scanner(System.in); //here we are using "System.in" because we have to provide input to the system
    
	//s.nextInt(); .... this will be used to give the input to the system. Here nextInt is the method of class Scanner
	//Now we have to store the value of "s.nextInt()" to print, which is integer so finally we are using below statement
	
	int a= s.nextInt();  //nextInt is the method of class Scanner
	System.out.println("Value of a is:" +a);
	
}
}*/


public class JavaScanner {
public static void main(String[] args) {
	System.out.println("Please enter value of a");
	Scanner s = new Scanner(System.in); //here we are using "System.in" because we have to provide input to the system
    
	//s.nextInt(); .... this will be used to give the input to the system. Here nextInt is the method of class Scanner
	//Now we have to store the value of "s.nextInt()" to print, which is integer so finally we are using below statement
	
	String a= s.next();  //nextInt is the method of class Scanner
	System.out.println("Value of a is:" +a);
	
}
}




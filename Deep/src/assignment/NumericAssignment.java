//Day 2: 06-Jan-19: Assignment:

package assignment;

/*public class NumericAssignment {
public int sum(int a, int b)
{
   int c;
   c= a+b;
   return c;
}
public int mul(int a, int b)
{
   int c;
   c= a*b;
   return c;
}
public int div(int a, int b)
{
   int c;
   c= a/b;
   return c;
}
public void sub(int a, int b)
{
   int c;
   c= a-b;
   System.out.println("Result is:"+ c);

}
public static void main(String[] args) {
	NumericAssignment obj=new NumericAssignment();
	int p= obj.sum(10, 2);
	int q= obj.mul(p, 2);
	int r= obj.div(q, 2);
	int s= obj.sum(r,2);
	obj.sub(s, 2);
}
}*/


//(((10-2)*2)/2)+2)-2) 

/*public class NumericAssignment {
public int sum(int a, int b)
{
   int c;
   c= a+b;
   return c;
}
public int mul(int a, int b)
{
   int c;
   c= a*b;
   return c;
}
public int div(int a, int b)
{
   int c;
   c= a/b;
   return c;
}
public int sub1(int a, int b)
{
   int c;
   c= a-b;
   return c;

}
public void sub(int a, int b)
{
   int c;
   c= a-b;
   System.out.println("Result is:"+ c);

}
public static void main(String[] args) {
	NumericAssignment obj=new NumericAssignment();
	int p= obj.sub1(10, 2);
	int q= obj.mul(p, 2);
	int r= obj.div(q, 2);
	int s= obj.sum(r,2);
	obj.sub(s, 2);
}
}*/



public class NumericAssignment {
public int sum(int a, int b)
{
   int c;
   c= a+b;
   return c;
}
public int mul(int a, int b)
{
   int c;
   c= a*b;
   return c;
}
public int div(int a, int b)
{
   int c;
   c= a/b;
   return c;
}
public int sub(int a, int b)
{
   int c;
   c= a-b;
   return c;

}

public static void main(String[] args) {
	NumericAssignment obj=new NumericAssignment();
	int p= obj.sub(10, 2);
	int q= obj.mul(p, 2);
	int r= obj.div(q, 2);
	int s= obj.sum(r,2);
	int t= obj.sub(s, 2);
	System.out.println("final result is  "+t);
}
}
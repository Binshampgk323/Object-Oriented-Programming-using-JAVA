package inheritance;

import java.util.Scanner;

public class Multilevel2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		C c=new C();
		System.out.println("Enter two numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		c.display();
		c.add(n1, n2);
		c.sub(n1, n2);
		c.mul(n1, n2);
		c.div(n1, n2);
		s.close();
	}
}
class Asd
{
	void display()
	{
		System.out.println("Operations");
	}
	void mul(int n1,int n2)
	{
		System.out.println("Mul: "+(n1*n2));
	}
	void div(int n1,int n2)
	{
		System.out.println("Div: "+(n1/n2));
	}
}
class B extends Asd
{
	void sub(int n1,int n2)
	{
		System.out.println("Sub: "+(n1-n2));
	}
	
}
class C extends B
{
	void add(int n1,int n2)
	{
		System.out.println("Add: "+(n1+n2));
	}
}
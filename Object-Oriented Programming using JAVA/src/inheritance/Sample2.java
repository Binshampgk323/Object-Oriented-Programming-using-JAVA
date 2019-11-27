package inheritance;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter food you want(Biriyani/vegBiriyani)");
	String str=s.next();
	A a=new A();
	a.display();
	a.food(str);
s.close();
	}

}
class Hotel
{
	void display()
	{
		System.out.println("Welcome to hotel A");
		System.out.println("*****************");
	}
}
class A extends Hotel
{
	void food(String a)
	{
		System.out.println(a);
		if(a.contentEquals("Biriyani"))
		{
			System.out.println("Price:80 ");
		}
		else
		{
			System.out.println("Price:60 ");
		}
	}
}

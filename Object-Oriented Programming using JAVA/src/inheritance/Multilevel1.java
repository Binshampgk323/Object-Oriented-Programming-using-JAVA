package inheritance;

import java.util.Scanner;

public class Multilevel1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Model m=new Model();
		System.out.println("Enter the car name");
		String str=s.next();
		m.display();
		m.name(str);
		m.name1(str);
		s.close();
	}

}
class Car2
{
	void display()
	{
		System.out.println("Welcome to our showroom");
	}
}
class Audi extends Car2
{
	void name1(String a)
	{
		System.out.println(a+" is a car");
	}

	
}
class Model extends Audi
{
	void name(String a)
	{
		System.out.println("Model: "+a);
	}
}

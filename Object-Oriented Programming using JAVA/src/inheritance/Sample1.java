package inheritance;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of car");
		int n=s.nextInt();
		Carb c=new Carb();
		c.name();
		c.speed(n);
		
		s.close();
	}
}
class Car
{
	void name()
	{
		System.out.println("Carb");
	}
}
class Carb extends Car
{
	void speed(int n)
	{
		System.out.println("Speed: "+n);
	}
}

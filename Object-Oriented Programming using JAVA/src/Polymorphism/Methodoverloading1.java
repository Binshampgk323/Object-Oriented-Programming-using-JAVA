package Polymorphism;
import java.util.Scanner;
public class Methodoverloading1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		Add a=new Add();
		a.add(n1);
		a.add(n1,n2);
		a.add(n1,n2,n3);
	}
}

class Add
{
	void add(int a)
	{
		System.out.println("First sum is: "+a);
	}
	
	void add(int a,int b)
	{
		System.out.println("Second sum is: "+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Third sum is: "+(a+b+c));
	}
}

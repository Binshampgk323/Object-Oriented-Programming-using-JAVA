package oops;
import java.util.Scanner;
public class Pgm1 {

public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the name");
	String str=S.next();
	Carnew c=new Carnew(str);
	c.a();
	c.b();
	c.m();
	c.display(str);

	}
}
class Carnew{
	String str;
	public Carnew(String str)
	{
		str=str;
	}
public static void m()
{
	System.out.println("Welcome Car m");
	System.out.println("Car model 1234");

}
public static void a()
{
	System.out.println("Welcome Car a");
	System.out.println("Car model 5678");

}
public static void b()
{
	System.out.println("Welcome Car b");
	System.out.println("Car model abcd");

}
public static void display(String str)
{
	System.out.println(str);
}


}


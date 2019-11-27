package oops;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("1=Add 2=Sub 3=Mul 4=Div 5=Mul");
		int n=s.nextInt();
		System.out.println("Enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		Opert o=new Opert(a,b);
		switch(n)
		{
		case 1:o.add(a,b);
		break;
		case 2:o.sub(a,b);
		break;
		case 3:o.mul(a,b);
		break;
		case 4:o.div(a,b);
		break;
		case 5:o.mod(a,b);
		break;
		}

	}
}
class Opert
{
int a,b;
public  Opert(int a,int b)
{
	a=a;
	b=b;
}
	public void add(int a,int b) {
		
		System.out.println("Add : "+(a+b));
	}

	public void mod(int a, int b) {
		System.out.println("Mod : "+(a%b));
		
	}

	public void div(int a, int b) {
		System.out.println("Div : "+(a/b));
		
	}

	public void mul(int a, int b) {
		System.out.println("Mul : "+(a*b));
		
	}

	public void sub(int a, int b) {
		
		System.out.println("Sub : "+(a-b));
	}
	
}

	



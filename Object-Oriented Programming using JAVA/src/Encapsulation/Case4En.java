package Encapsulation;
import java.util.Scanner;
public class Case4En {

	public static void main(String[] args) {
		Tbooking t=new Tbooking();
		t.book();
		t.total(t.getN(),t.getName(),t.getC(),t.getAge(),t.getTick());
	}

}
class Tbooking
{
	int n;
	String name;
	char c;
	int age;
	int tick;
	double totalAmount=0;
	double d1=0.0,d2=0.0,d3=0.0;
	String Nam[]=new String[25];
	char Gen[]=new char[25];
	int Ag[]=new int[25];
	Scanner s=new Scanner(System.in);
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTick() {
		return tick;
	}
	public void setTick(int tick) {
		this.tick = tick;
	}
	
public void book() {
	System.out.println("Enter Price of a ticket :");
	setTick(s.nextInt());
	System.out.println("Enter Number of Persons :");
	setN(s.nextInt());	
		
	}
	public void total(int n2, String cname, char c2, int age2, int tick2) {
		
		for(int i=1;i<n+1;i++)
		{
			System.out.println("Enter Details for Person "+i);
			System.out.println("Name :");
			setName(s.next());
			Nam[i]=name;
			System.out.println("Gender (M or F) :");
			setC(s.next().charAt(0));
			Gen[i]=c;
			System.out.println("Age: ");
			setAge(s.nextInt());
			Ag[i]=age;

			if(age<16)
			{
				d1=tick*0.5;
				totalAmount=totalAmount+(tick-d1);
			}
			else if(age>16&&age<64)
			{
				 if(c=='f')
				{
					d3=tick*0.1;
					totalAmount=totalAmount+(tick-d3);
				}
				 else
				 {
					 totalAmount=totalAmount+tick;
				 }
			}
			
			else if(age>64)
			{
				d2=tick*0.25;
				totalAmount=totalAmount+(tick-d2);
			}
			
		}
		System.out.println(tick);
		System.out.println("Ticket Details are :");
		System.out.println("Number of Passengers : "+n);
		System.out.println("Price of a ticket :"+tick);
		System.out.println("Total Amount  :"+totalAmount);
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+")"+Nam[i]+"("+Gen[i]+","+Ag[i]+")");
		
		}

	}
}
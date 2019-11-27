package inheritance;

import java.util.Scanner;

public class Hierarchical1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark of two sub");
		int m1=s.nextInt();
		int m2=s.nextInt();
		System.out.println("Enter name of student");
		String str=s.next();
		Mark m=new Mark();
		Rank r=new Rank();
		m.display(str);
		m.mar(m1, m2);
		r.display(str);
		r.ran(m1, m2);
		s.close();
	}

}
class Student
{
	void display(String str)
	{
		System.out.println("Name: "+str);
	}
}
class Mark extends Student
{
	void mar(int a,int b)
	{
		System.out.println("Total mark: "+(a+b));
	}
}

class Rank extends Student
{
	void ran(int a,int b)
	{
		int t=0;
		t=a+b;
		if(t>50)
		{
			System.out.println("1 Rank");
		}
		if(t<50&&t>=40)
		{
			System.out.println("2 Rank");
		}
		if(t<40&&t>=30)
		{
			System.out.println("3 Rank");
		}
		if(t<30&&t>=20)
		{
			System.out.println("4 Rank");
		}
		if(t<=10)
		{
			System.out.println("Fail");
		}

	}
}
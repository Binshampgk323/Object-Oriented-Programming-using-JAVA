package oops;

import java.util.Scanner;

public class Detail {
	Scanner s=new Scanner(System.in);
	String name,id,code,rank;
	int maths,eng,phy,che,mala,ag;
	double total,avg;
	public void student() {
		System.out.println("Enter the student name");
		name=s.next();
		System.out.println("Student Age");
		ag=s.nextInt();
		System.out.println("Student Id");
		id=s.next();
		System.out.println("Couse code");
		code=s.next();	
		
	}
	public void mark() {
		System.out.println("Maths");
		maths=s.nextInt();
		System.out.println("English");
		eng=s.nextInt();
		System.out.println("Physics");
		phy=s.nextInt();
		System.out.println("Chemistry");
		che=s.nextInt();
		System.out.println("Malayalam");
		mala=s.nextInt();
		total=maths+eng+phy+che+mala;
		avg=total/5;
		
	}
	public void display() {
		System.out.println("Student Details");
		System.out.println("==================");
		System.out.println("Name: "+name);
		System.out.println("Age: "+ag);
		System.out.println("Std Id: "+id);
		System.out.println("Couse code: "+code);
		System.out.println("Maths: "+maths);
		System.out.println("English: "+eng);
		System.out.println("Physics: "+phy);
		System.out.println("Chemistry: "+che);
		System.out.println("Malayalam: "+mala);
		System.out.println("Total mark: "+total);
		System.out.println("Avg: "+avg);
		System.out.println("Rank: "+rank);
			
	}
	public void ranks() {
		if(total>=700)
		{
			rank="1";
		}
		else if(total>=600&&total<700)
		{
			rank="2";
		}
		else if(total>=500&&total<600)
		{
			rank="3";
		}
		else if(total>=400&&total<500)
		{
			rank="4";
		}
		else if(total>=300&&total<500)
		{
			rank="5";
		}
		else if(total>=200&&total<300)
		{
			rank="6";
		}
		else if(total>=100&&total<200)
		{
			rank="7";
		}
		else if(total<100)
		{
			rank="Failed";
		}
		
	}
	

}

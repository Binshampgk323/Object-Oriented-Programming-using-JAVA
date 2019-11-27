package Polymorphism;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		int tno;
		String cname;
		int cnu;
		double callcost;
		Scanner s=new Scanner(System.in);
		TelePhoneBill t=new TelePhoneBill(0, null);
		System.out.println("Enter the number of custemers");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("\n1=Telephone bill\n 2=Current bill");
			int ch=s.nextInt();
			System.out.println("Customer "+i);
			if(ch==1)
			{
				System.out.println("Enter the Telephone Bill Number :");
				tno=s.nextInt();
				System.out.println("Enter the Customer Name :");
				cname=s.next();
				System.out.println("Enter the Number of Calls made :");
				cnu=s.nextInt();
				System.out.println("Enter the Cost per Call :\n");
				callcost=s.nextDouble();
				t.generateBill(tno,cname,cnu,callcost);
			}
			else
			{
				System.out.println("Enter the Current Bill Number :");
				tno=s.nextInt();
				System.out.println("Enter the Customer Name"); 
				cname=s.next();
				System.out.println("Enter the Number of Units Consumed :");
				cnu=s.nextInt();
				System.out.println("Enter the Cost per Unit :");
				callcost=s.nextDouble();
				t.generateBill(tno,cname,cnu,callcost);
			}
		}
		
	
	}

}
class Bill
{
	private int billNumber;
	private String name;
	Bill(int billNumber,String name)
	{
		
	}
	
}

class CurrentBill extends Bill
{
	private int numberOfUnitsConsumed;
	private double costPerUnit;
	CurrentBill(int billNumber, String name)
	{
		super(billNumber, name);
	}
	
	void generateBill(int tno, String cname, int cnu, double callcost)
	{
		System.out.println("\nBill number:"+tno);
		System.out.println("Customer name:"+cname);
		double sum=cnu*callcost;
		System.out.printf("Current Bill Amount :%.1f",sum);
		
	}
}

class TelePhoneBill extends CurrentBill
{
	private int numberOfCallsMade;
	private double costPerCall;
	TelePhoneBill(int billNumber, String name)
	{
		super(billNumber, name);
	}
	public void generateBill(int tno, String cname, int cnu, double callcost) {
		System.out.println("\nBill number:"+tno);
		System.out.println("Customer name:"+cname);
		double sum=cnu*callcost;
		System.out.printf("Telephone Bill Amount :%.1f",sum);
		
	}
}
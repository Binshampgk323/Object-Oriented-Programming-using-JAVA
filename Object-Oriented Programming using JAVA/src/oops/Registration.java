package oops;
import java.util.Scanner;
public class Registration {
Scanner s=new Scanner(System.in);
static int booked[]=new int[25];
static int id[]=new int[25];
String name[]=new String[25];
String pr="",ac,cot,cable,wifi,laundry,as="",re="";
int total,b=0,n=1,d,e,f,status=0,i=1,j=1,c,date,sdate,edate;
	public void reg() {
		do {
	
		System.out.println("Registration");
		System.out.println();
		System.out.println("Enter your name");
		name[n]=s.next();
		n++;
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Contact Number");
		String number=s.next();
		System.out.println("E-Mail ID");
		String mail=s.next();
		System.out.println("Enter proof type");
		String proof=s.next();
		System.out.println("Enter proof id");
		String proofid=s.next();
		System.out.println("Enter the date of booking");
		date=s.nextInt();
		System.out.println("Do you want to book a room(y/n)");
		pr=s.next();	
		
		if(pr.contentEquals("y"))
		{
			id[i]=i;
			System.out.println("Thank you for registering... Your id is  "+i);
			i++;
			book();
			System.out.println("Do you want to proceed(y/n)");
			as=s.next();
		
			if(as.contentEquals("y"))
			{
				System.out.println("Thank you for booking");
				booked[j]=j;
				System.out.println("Your room number is: "+j);
				j++;
			}
				System.out.println("Do you want to countinue registration(y/n)");
				re=s.next();
				if(re.contentEquals("y"))
				{
					reg();
				}
				else
				{
					view();
				}
					
		}	
		
	}
	while(pr.contentEquals("n"));
	}
	private void view() {
		
	
		System.out.println("View All booking");
		System.out.println("=================");
		System.out.println("Enter the starting date");
		sdate=s.nextInt();
		System.out.println("Enter the ending date");
		edate=s.nextInt();
		System.out.println("The bookings made from "+sdate+" to "+edate+" are");
		if(date>=sdate&&date<=edate)
		{
			System.out.println("Room Number\tCostmer name");
			for(int m=1;m<i;m++)
			{
				System.out.println(booked[m]+"\t\t"+name[m]);
			}
		date++;
		}
		else
		{
			System.out.println("No bookings");
		}
	 	System.out.println();
	}
	private void book() {
	
		System.out.println("Booking");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=s.next();
		if(ac.contentEquals("AC")==true) 
		{b=1500;}
		else 
		{b=700;}

		System.out.println("Cot(S/D)");
		cot=s.next();
		if(cot.contentEquals("S")==true) 
		{c=50;}
		else 
		{c=100;}

		System.out.println("Cable(C/nC)");
		cable=s.next();
		if(cable.contentEquals("C")==true)
		{d=50;}
		else
		{d=0;}

		System.out.println("Wifi(W/nW)");
		wifi=s.next();
		if(wifi.contentEquals("W")==true)
		{e=200;}
		else
		{e=0;}
		
		System.out.println("Laundry(L/nL)");
		laundry=s.next();
		if(laundry.contentEquals("L")==true)
		{f=100;}
		else 
		{f=0;}
		total=b+c+d+e+f;
		
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are");
		System.out.println("*************************");
		if(c==50)
		{
			System.out.println("Single cot");
		}
		else
		{
			System.out.println("Double cot");
		}
		if(d==50)
		{
			System.out.println("Cable connection enabled");
		}
		else
		{
			System.out.println("Cable connection not enabled");
		}
		if(e==200)
		{
			System.out.println("WiFi enabled");
		}
		else
		{
			System.out.println("WiFi not enabled");
		}
		if(f==100)
		{
			System.out.println("with laundry service");
		}
		else
		{
			System.out.println("No laundry service");
		}
	}


}

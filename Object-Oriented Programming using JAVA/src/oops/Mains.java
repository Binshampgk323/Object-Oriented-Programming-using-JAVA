package oops;
import java.util.*;
public class Mains {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;
		System.out.println("Booking:");
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		String service=s.next();
		System.out.println("Cot(Single/Double)");
		String cot=s.next();
		System.out.println("With cable connection/without cable connection(C/nC)");
		String cable=s.next();
		System.out.println("Wi-Fi needed or not(W/nW)");
		String wifi=s.next();
		System.out.println("Laundry service needed or not(L/nL)");
		String laundry=s.next();
		Booking b=new Booking(service,cot,cable,wifi,laundry);
		b.sum(a,service,cot,cable,wifi,laundry);
	}
}
class Booking
{
	String service,cot,cable,wifi,laundry;int a=0;
	public Booking(String service,String cot,String cable,String wifi,String laundry )
	{
		this.service=service;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;
	}
	public void sum(int a,String service,String cot,String cable,String wifi,String laundry) {
		if(service.equals("AC"))
		{
			a=a+1000;
		}
		else
		{
			a=a+750;
		}
		if(cot.equals("Single"))
		{
			a=a+0;
		}
		else
		{
			a=a+350;
		}
		if(cable.equals("W"))
		{
			a=a+50;
		}
		else
		{
			a=a+0;
		}
		if(wifi.equals("W"))
		{
			a=a+200;
		}
		else
		{
			a=a+0;
		}
		if(laundry.equals("L"))
		{
			a=a+100;
		}
		else
		{
			a=a+0;
		}
		System.out.println("The total charge is Rs. "+a);
		System.out.println("The services chosen are");
		
		
	}
}

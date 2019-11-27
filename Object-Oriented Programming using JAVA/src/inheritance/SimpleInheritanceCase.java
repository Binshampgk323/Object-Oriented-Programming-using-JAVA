package inheritance;

import java.util.Scanner;

public class SimpleInheritanceCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		int n=s.nextInt();
		System.out.println("Enter the number of days");
		int d=s.nextInt();
		System.out.println("Enter the room type(AC/NonAC)");
		String str=s.next();
		System.out.println("Enter the tariff for single person");
		int t=s.nextInt();
		
		seasonBooking b=new seasonBooking();
		b.roomBooking(n, d, t);
	}

}
class Booking
{
	void roomBooking(int n,int d,int t)
	{
		System.out.println("Total Tariff: "+t*n*d+"/-");
	}
}

class seasonBooking extends Booking
{
	
}
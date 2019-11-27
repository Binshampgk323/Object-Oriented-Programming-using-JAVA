package inheritance;

import java.util.Scanner;

public class HierarchicalCase {

	public static void main(String[] args) {
		int m;
		Scanner s=new Scanner(System.in);
		PeakSeason p=new PeakSeason();
		LeanSeason l=new LeanSeason();
		p.roomBooking();
		System.out.println("Enter the number of persons");
		int n=s.nextInt();
		System.out.println("Enter the number of days");
		int d=s.nextInt();
		System.out.println("Enter the room type(AC/NonAC)");
		String str=s.next();
		System.out.println("Enter the month");
		int mon=s.nextInt();
		System.out.println("Enter the hariff for single person");
		int t=s.nextInt();		
		
		if(mon==4||mon==5||mon==6||mon==9||mon==11||mon==12)
		{
			System.out.println("Enter the peak charge");
			int pic=s.nextInt();
			p.roomBook(n,d,t,pic);
		}
		else
		{
			System.out.println("discount");
			double  dis=s.nextDouble();
			l.roomBooking(n, d, t,dis);
		}
	}

}
class RBooking
{
	void roomBooking()
	{
		System.out.println("Booking");
	}
}

class  PeakSeason extends RBooking
{
	void roomBook(int n,int d,int t,int pic)
	{
		System.out.println("Total Tariff: "+t*n*d*pic+"/-");
	}	
}

class LeanSeason extends RBooking
{
	void roomBooking(int n,int d,int t,double dis)
	{
		double di=0,de=0.0;
		de=dis/100;
		di=t*n*d*de;
		System.out.println("Total Tariff: "+((t*n*d)-di)+"/-");
	}	
	
}
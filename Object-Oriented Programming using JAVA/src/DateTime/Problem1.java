package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		LocalDate date=LocalDate.now();  //getting today date
		int nroom1=0;
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the Address");
		String address=s.next();
		System.out.println("Enter number of room");
		int nroom=s.nextInt();
		System.out.println("Number person");
		int num=s.nextInt();
		System.out.println("AC or Non-AC");
		String ac=s.next();
		System.out.println("Booking Date (yyyy-mm-dd)");
		String bdate=s.next();
		System.out.println("Checkout Date (yyyy-mm-dd)");
		String cdate=s.next();  
		LocalDate ds = LocalDate.parse(bdate);  //string date convert into date
		LocalDate de = LocalDate.parse(cdate);  //string date convert into date
		long nday = ChronoUnit.DAYS.between(ds,de); //find no of days
		
		double total=0;
		nroom1=Math.round(num/2);  //no of room calculate from no of persons
		if(nroom1==nroom)
		{
		
			if((ac.contentEquals("AC"))&&num%2!=0)
			{
				ac="Yes";
				total=1150*nday*(nroom-1);
				total=total+(1400*nday);
			}
			else if((ac.contentEquals("AC"))&&num%2==0)
			{
				ac="Yes";
				total=1150*nday*nroom;
			}
			else if((ac.contentEquals("Non-AC"))&&num%2!=0)
			{
				ac="No";
				total=1250*nday*(nroom-1);
				total=total+(1000*nday);
			}
			else if((ac.contentEquals("Non-AC"))&&num%2==0)
			{
				ac="No";
				total=1000*nday*nroom;
			}
			
			System.out.println("Reg-Details:");
			System.out.println("Name : "+name);
			System.out.println("Address : "+address);
			System.out.println("No.of rooms : "+nroom);
			System.out.println("No.of Guest : "+num);
			System.out.println("AC : "+ac);
			System.out.println("No.of Days : "+nday);
			System.out.println("Amount : "+total);
			
			
		}
		else
		{
			System.out.printf("sorry,You need to book %d room more",nroom1-nroom);
		}
		
		
		
		

	}

}

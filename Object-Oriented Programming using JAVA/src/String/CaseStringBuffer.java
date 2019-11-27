package String;
import java.util.Scanner;
public class CaseStringBuffer {

	public static void main(String[] args) {
		
	
		Scanner s=new Scanner(System.in);
		int booked[]=new int[25];
		String pr="",up="";int i=1;
		StringBuffer b=new StringBuffer();
		do
		{
		
			System.out.println("Registration");
			System.out.println();
			System.out.println("Enter your name");
			b.append("Name : "+s.next()+"\n");
			System.out.println("Enter your address");
			b.append("Address : "+s.next()+"\n");
			System.out.println("Contact Number");
			b.append("Contact number : "+s.next()+"\n");
			System.out.println("E-Mail ID");
			b.append("Email : "+s.next()+"\n");
			System.out.println("Enter proof type");
			b.append("Proof Type : "+s.next()+"\n");
			System.out.println("Enter proof id");
			b.append("Proofid : "+s.next()+"\n");
			booked[i]=1;
		b.append("Thank you... Your id is  "+i);
		i=i+1;
		System.out.println("Do you want to proceed(yes/no)");
		if(s.next().contentEquals("no"))
		{
			System.out.println("Do you want to update the email id(yes/no)");
			if(s.next().equals("yes"))
			{
				System.out.println("Update Email:");
				System.out.println("Enter new Email id");
				b.append("\nNew Email : "+s.next()+"\n");
				System.out.println("Email updated");
				System.out.println();
			}
			System.out.println ("\n Your details are .....\n");
			System.out.println(b);

		}
		
		
	}
		while(s.next().contentEquals("yes"));
	}

}

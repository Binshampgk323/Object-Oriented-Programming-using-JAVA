package String;

import java.util.Scanner;

public class DynamicEmplyeedtailsStringBuffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer b=new StringBuffer();
		System.out.println("Enter  Name");
		b.append("Name : "+s.next()+"\n");
		System.out.println("Enter Id");
		b.append("Id : "+s.next()+"\n");
		System.out.println("Enter Age");
		b.append("Age : "+s.nextInt()+"\n");
		System.out.println("Enter address");
		b.append("Address : "+s.next()+"\n");
		System.out.println("\nEmployee Detials...\n");
		System.out.println(b);

	}

}

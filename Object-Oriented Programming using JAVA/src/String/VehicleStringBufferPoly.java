package String;
import java.util.Scanner;
public class VehicleStringBufferPoly {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car ca=new Car();
		Bike bi=new Bike();
		System.out.println("1)Car\n2)Bike");
		switch(s.nextInt())
		{
			case 1:ca.display();
				break;
			case 2:	bi.dispaly();
				break;
			default:System.out.println("Invalid input");
		}

	}

}

class Bike
{
	Scanner s=new Scanner(System.in);
	StringBuffer b1=new StringBuffer();
	public void dispaly() {
		System.out.println("Enter the details of bike");
		   System.out.println("Enter the color");
		   b1.append("Color : "+s.next()+"\n");
		   System.out.println("Enter the maximum speed");
		   b1.append("Speed : "+s.nextInt()+"\n");
		   System.out.println("Enter the number of seats");
		   b1.append("Number seat : "+s.nextInt()+"\n");
		   System.out.println("Enter the number of wheels");
		   System.out.println("Enter the status of diskbreak(true/false)");
		   b1.append("Number of : "+s.nextInt()+"\n");
		   b1.append("Disk status : "+s.next()+"\n");
		   System.out.println();
		   System.out.println(b1);
	}
	
}
class Car
{
	Scanner s=new Scanner(System.in);
	StringBuffer b=new StringBuffer();
	public void display() {
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		b.append("Color : "+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		b.append("Speed : "+s.nextInt()+"\n");
		System.out.println("Enter the number of seats");
		b.append("Number of seat : "+s.nextInt()+"\n");
		System.out.println("Enter the number of wheels");
		b.append("Number of wheels : "+s.nextInt()+"\n");
		System.out.println("Enter the number of doors");
		b.append("Number of door : "+s.nextInt()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		b.append("Ac/NonAc : "+s.next()+"\n");
		System.out.println();
		System.out.println(b);
	}
	
}
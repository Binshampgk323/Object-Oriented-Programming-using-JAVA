package Polymorphism;
import java.util.Scanner;
public class Vehicle {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("1)Car\n2)Bike");
			int ch=s.nextInt();
			Car ca=new Car();
			Bike bi=new Bike();
			switch(ch)
			{
			case 1:System.out.println("Enter the details of car");
			   System.out.println("Enter the color");
			   String Ccol=s.next();
			   System.out.println("Enter the maximum speed");
			   int Csp=s.nextInt();
			   System.out.println("Enter the number of seats");
			   int Cseat=s.nextInt();
			   System.out.println("Enter the number of wheels");
			   int Cw=s.nextInt();
			   System.out.println("Enter the number of doors");
			   int Cdoor=s.nextInt();
			   System.out.println("Enter the status of AC(true/false)");
			   String Cac=s.next();
				ca.display(Ccol,Csp,Cseat,Cw,Cdoor,Cac);
				break;
			case 2:System.out.println("Enter the details of bike");
				   System.out.println("Enter the color");
				   String Bcol=s.next();
				   System.out.println("Enter the maximum speed");
				   int Bsp=s.nextInt();
				   System.out.println("Enter the number of seats");
				   int Bseat=s.nextInt();
				   System.out.println("Enter the number of wheels");
				   int Bw=s.nextInt();
				   System.out.println("Enter the status of diskbreak(true/false)");
				   String Bdisk=s.next();
				   bi.dispaly(Bcol,Bsp,Bseat,Bw,Bdisk);
				break;
				default:System.out.println("Invalid input");
			}

		}

	}

	class Bike
	{

		public void dispaly(String bcol, int bsp, int bseat, int bw, String bdisk) {
			
			System.out.println("Bike Details");
			System.out.println("Color :"+bcol);
			System.out.println("Maximum Speed :"+bsp);
			System.out.println("Number of Seats :"+bseat);
			System.out.println("Number of Wheels :"+bw);
			System.out.println("Disk Break :"+bdisk);
		}
		
	}
	class Car
	{

		public void display(String ccol, int csp, int cseat, int cw, int cdoor, String cac) {
			System.out.println("Car Details");
			System.out.println("Color :"+ccol);
			System.out.println("Maximum Speed :"+csp);
			System.out.println("Number of Seats :"+cseat);
			System.out.println("Number of Wheels :"+cw);
			System.out.println("Number of Doors :"+cdoor);
			System.out.println("Ac :"+cac);
			
		}
		
	}


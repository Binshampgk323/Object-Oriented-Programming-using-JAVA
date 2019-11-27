package Polymorphism;

import java.util.Scanner;

public class MethodoverrindingSuper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ridings r=new Ridings();
		r.display();

	}

}
class Polys
{
	public void display() {
		
		System.out.println("Parent class");	
	}
	
}
class Ridings extends Polys
{

	public void display() {
		super.display();
		System.out.println("Child class");
		super.display();
	}
	
}

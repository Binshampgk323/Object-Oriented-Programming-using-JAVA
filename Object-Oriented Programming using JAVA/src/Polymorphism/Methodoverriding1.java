package Polymorphism;

import java.util.Scanner;

public class Methodoverriding1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Riding r=new Riding();
		r.display();
	}

}
class Poly
{
	public void display() {
		System.out.println("Parent class");
		
	}
	
}
class Riding extends Poly
{

	public void display() {
		System.out.println("Child class");
		
	}
	
}

package Polymorphism;

import java.util.Scanner;

public class Methodoverloading3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter the customer name");
		String name=s.next();
		System.out.println("Enter food type(Veg/nonveg)");
		String type=s.next();
		c.view(type);
		System.out.println("Enter food items");
		String food=s.next();
		int price=0;
		c.view(food,price);

	}

}
class Customer
{
	public void view(String type) {
		
		if(type.contentEquals("Veg"))
		{
			System.out.println("Dosha=10/-\nIddly=5/-\nMeal=50/-\nMasala dosha=35/-");
		}
		else if(type.contentEquals("nonveg"))
		{
			System.out.println("Biriyani=60/-\nChicken fry=30/-");
		}
			
	}

	public void view(String food, int price) {
		
		if(food.contentEquals("Dosha"))
		{
			price=price+10;
		}
		if(food.contentEquals("Iddly"))
		{
			price=price+5;
		}
		if(food.contentEquals("Meal"))
		{
			price=price+50;
		}
		if(food.contentEquals("Masala dosha"))
		{
			price=price+35;
		}
		if(food.contentEquals("Biriyani"))
		{
			price=price+60;
		}
		if(food.contentEquals("Chicken fry"))
		{
			price=price+30;
		}
		System.out.println("Total Price is: "+price);

		
	}
	
}
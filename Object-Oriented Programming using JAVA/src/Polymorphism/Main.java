package Polymorphism;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    Calories f=new Calories();
    System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
    System.out.println("Enter the choice");
    int ch=s.nextInt();
    System.out.println("Enter the number of Slice of bread");
    int n=s.nextInt();
    if(ch==1)
    {
    	f.calculateCalories(n);
    }
    else if(ch==2)
    {
      System.out.println("Enter the number of teaspoon of Jam");
    	int j=s.nextInt();
    	f.calculateCalories(n,j);
    }
    else if(ch==3)
    {
       System.out.println("Enter the number of teaspoon of Jam");
    	int j=s.nextInt();
       System.out.println("Enter the number of teaspoon of Butter");
       int b=s.nextInt();
         f.calculateCalories(n,j,b);
    }
  }
}
class Calories 
{
  double cal=4.1868;
  float bcal=74,jcal=26,btcal=102;
  double totcal=0;
  void calculateCalories(int n)
  {
    float c=n*bcal;
    totcal=n*cal*bcal;
     System.out.printf("%.3f kJ of energy generated from %.1f calories",totcal,c);
  }
  
   void calculateCalories(int n,int j)
   {
     float c=(n*bcal)+j*(jcal);
    totcal=(n*cal*bcal)+(j*cal*jcal);
       System.out.printf("%.3f kJ of energy generated from %.1f calories",totcal,c);
   }
   void calculateCalories(int n,int j,int b)
   {
     float c=(n*bcal)+j*(jcal)+(b*btcal);
    totcal=(n*cal*bcal)+(j*cal*jcal)+(b*cal*btcal);
     System.out.printf("%.3f kJ of energy generated from %.1f calories",totcal,c);
   }
  void calculateEnergy() 
  {
    
  }
  
}
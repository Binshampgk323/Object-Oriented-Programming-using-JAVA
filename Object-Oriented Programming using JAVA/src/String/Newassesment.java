package String;

import java.util.Scanner;

public class Newassesment {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    System.out.println("Size");
			  int n=s.nextInt();
			  int d=n/2;
			  int a[]=new int[n];
			  System.out.println("Array element");
			  for(int i=0;i<n;i++)
			  {
				  a[i]=s.nextInt();
			  }
			  System.out.print("[");
			  for(int i=0;i<n;i++)
			  {
				if(a[i]<a[n-1])
				{
						  System.out.print(a[n-1]+", ");
				}
				 
				System.out.print(a[i]);
				if(i<n-1)
				{
				  System.out.print(", ");
				}
					 
				 n=n-1;    
			  }
			  System.out.print("]");
		

	}

}

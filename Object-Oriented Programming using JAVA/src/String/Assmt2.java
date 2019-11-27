package String;
import java.util.Scanner;
public class Assmt2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		System.out.println("enter char");
		char c1=s.next().charAt(0);
		System.out.println("next char");
		char c2=s.next().charAt(0);
		System.out.println("next char ");
		char c3=s.next().charAt(0);
		char a[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||(i+j)==(n-1))					
					a[i][j]=c3; 					
				else
					a[i][j]=c2; 
			}
		}
		for(int i=0;i<n/2;i++)
		{
			for(int j=i+1;j<n-1-i;j++)
			{
				a[i][j]=c1; 
				a[n-1-i][j]=c1; 
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}

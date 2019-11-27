/*
 input:
 
 char=L/R
 string=s;;upimrrfod;pbr
 
 output:
 
 String=allyouneedislove
 */


package String;
import java.util.Scanner;
public class Qustn1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c[]= {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};
		System.out.println("Enter L/R");
		char side=s.next().charAt(0);
		System.out.println("Enter String");
		String string1=s.next();
		int l=string1.length();  //String length
		int l2=c.length;  //array length
		for(int i=0;i<l;i++)
		{
			char str=string1.charAt(i);
			for(int j=0;j<l2;j++)
			{
				if(str==c[j]&&side=='R')
				{
					System.out.print(c[j-1]);
				}
				else if(str==c[j]&&side=='L')
				{
					System.out.print(c[j+1]);
				}
				
			}
		}

	}

	
}

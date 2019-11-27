/*

SAMPLE INPUT & OUTPUT 1:
Enter the Pasha's string
abcdef
Enter the number of days
1
Enter the position from which Pasha started transforming
2
The resultant string
aedcbf
SAMPLE INPUT & OUTPUT 2:
Enter the Pasha's string
vwxyz
Enter the number of days
2
Enter the position from which Pasha started transforming
2 2
The resultant string
vwxyz
 
 
 */
package String;

import java.util.Scanner;

public class Qstn4 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	System.out.println("Enter the Pasha's string");
	String string1=s.next();
	System.out.println("Enter the number of days");
	int day=s.nextInt();
	System.out.println("Enter the position from which Pasha started transforming");
	int l=string1.length();
	int pos=0;
	char str[]=new char[l];
	for(int i=0;i<l;i++)
	{
		str[i]=string1.charAt(i);
	}
	for(int i=1;i<=day;i++)
	{
		pos=s.nextInt();
		
	for(int j=1;j<=l;j++)
	{
		char t=str[pos];
		str[pos]=str[l-pos];
		str[l=pos]=t;
	}
	}
	for(int i=0;i<l;i++)
	{
		System.out.println(str[i]);
	}
	
}

}

/*
SAMPLE INPUT & OUTPUT 1:
Enter the string
saba
Enter the number of palindromes in the string
2
NO
SAMPLE INPUT & OUTPUT 2:
Enter the string
saddastavvat
Enter the number of palindromes in the string
2
YES
 */
package String;

import java.util.Scanner;

public class Qstn3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String string1=s.next();
		System.out.println("Enter the number of palindromes in the string");
		int num=s.nextInt();
		int len=string1.length();
		String left="",right="",left1="",right1="";
		for(int i=0;i<len/num;i++)
		{
			left=left+string1.charAt(i);
		}
		for(int i=(len/num);i<len;i++)
		{
			right=right+string1.charAt(i);
		}
		for(int i=left.length()-1;i>=0;i--)
		{
			left1=left1+left.charAt(i);
		}
		for(int i=right.length()-1;i>=0;i--)
		{
			right1=right1+right.charAt(i);
		}
		
//System.out.println("1"+left);
//System.out.println("2"+right);
//System.out.println("1"+left1);
//System.out.println("2"+right1);
		
	if(left.contentEquals(left1)&&right.contentEquals(right1))
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}

	}

}

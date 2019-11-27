package String;
import java.util.Scanner;
public class VowelConsonentUppercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three strings");
		String s1=s.next();
		String s2=s.next();
		String s3=s.next();
		char c[]=s1.toCharArray();
		char c1[]=s2.toCharArray();
		for(int i=0;i<c.length;i++)
		{
	
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				c[i]='$';
			}
			System.out.print(c[i]);		
		}
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u'||c1[i]=='A'||c1[i]=='E'||c1[i]=='I'||c1[i]=='O'||c1[i]=='U')
			{
				c1[i]=c1[i];
			}
			else
			{
				c1[i]='#';
			}
			
			System.out.print(c1[i]);	
			
		}
		System.out.print(s3.toUpperCase());

	}

}

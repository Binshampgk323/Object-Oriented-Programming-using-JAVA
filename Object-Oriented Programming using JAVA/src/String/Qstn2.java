package String;
import java.util.Arrays;
import java.util.Scanner;
public class Qstn2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String p="";
		System.out.println("Enter the guest's name");
		String name=s.next();
		System.out.println("Enter the name of the residence host");
		String host=s.next();
		System.out.println("Enter the letters in a pile");
		String pile=s.next();
		int f=0;
		String nh=name+host;
		int l=nh.length();
		int pilel=pile.length();
		char c[]=nh.toCharArray();
		char p1[]=pile.toCharArray();
		Arrays.sort(c);
		Arrays.sort(p1);
		if(pilel==l)
		{
			for(int i=0;i<l;i++)
			{
				if(c[i]==p1[i])
				{
					f=1;
				}
				else
				{
					f=0;
				}
			}
		}
		else
		{
			f=0;
		}
		
if(f==1)
{
	System.out.println("Yes");
}
else
{
	System.out.println("No");
}
		
	}

}


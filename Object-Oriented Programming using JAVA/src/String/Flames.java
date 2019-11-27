package String;
import java.util.Scanner;
public class Flames {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("First name");
		String name1=s.next();
		System.out.println("Second name");
		String name2=s.next();
		int d=0;
		name1.toLowerCase();
		name2.toLowerCase();
		char c[]=name1.toCharArray();
		char c2[]=name2.toCharArray();
		if(c.length>c2.length)
		{
			for(int i=0;i<c.length;i++)
			{
				d=0;
				for(int j=0;j<c2.length;j++)
				{
					if(c[i]!=c2[j])
					{
						d++;
					}
					else
					{
						c2[j]='0';
					}
					
					
				}
			
			}
		}
		else
		{
			for(int i=0;i<c2.length;i++)
			{
				d=0;
				for(int j=0;j<c.length;j++)
				{
					if(c2[i]!=c[j])
					{
						d++;
					}
					else
					{
						c[j]='0';
					}
				}
			
			}
		}
		System.out.println("d "+d);
		String string1="flame";
		char c3[]=string1.toCharArray();
		int y=d%c3.length;
		System.out.println(c3[y]);
	}

}

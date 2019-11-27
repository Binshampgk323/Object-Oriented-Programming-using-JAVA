package threadClass;

import java.util.Scanner;

public class SimpleThread {

	public static void main(String[] args) {
		Single s=new Single();
		s.start();

	}

}
class Single extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter String");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
				try
				{
					System.out.println(c);
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			
		}
	}
}
package threadClass;
import java.util.Scanner;
public class SingleThread {

	public static void main(String[] args) {
		Add a=new Add();
		a.start();

	}

}
class Add extends Thread
{
	Scanner s=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter two number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		try
		{
			System.out.println("Sum : "+(n1+n2));
			Thread.sleep(2000);
			System.out.println("Sub : "+(n1-n2));
			Thread.sleep(3000);
			System.out.println("Mul : "+(n1*n2));
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
package threadClass;

public class Thread4 {

	//Multithreading
	
	public static void main(String[] args) {
		CarA a=new CarA();
		CarB b=new CarB();
		CarC c=new CarC();
		a.start();
		b.start();
		c.start();

	}

}
class CarA extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)yield();
			System.out.println("Car A running "+i);
		}
		System.out.println("Car A running");
	}
}

class CarB extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)stop();
			System.out.println("Car B running "+i);
		}
		System.out.println("Car B running");
	}
}


class CarC extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
				try {
					System.out.println("Car A running sleep");
					Thread.sleep(10000);
				}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
		
	}
}
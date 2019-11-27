package threadClass;
public class Thread3 {

	public static void main(String[] args) {
		C c=new C();
		c.start();

	}

}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println("Thread going to sleep "+i+" time");
				Thread.sleep(10000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			System.out.println("Thread running "+i+" Time");
			System.out.println(i);
		}
	}
}
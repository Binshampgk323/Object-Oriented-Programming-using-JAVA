package threadClass;

public class Thread2 {

	public static void main(String[] args) {
		
		A1 a=new A1();
		Thread t=new Thread(a);
		t.start();
	}

}
class A1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread ruuning");
	}
}
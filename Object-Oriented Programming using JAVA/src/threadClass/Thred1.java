package threadClass;

public class Thred1 {

	public static void main(String[] args) {
		A a=new A();
		a.start();
		B b=new B();
		b.start();

	}

}
class A extends Thread
{
	public void run()
	{
		System.out.println("A thread running");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("B thread running");
	}
}
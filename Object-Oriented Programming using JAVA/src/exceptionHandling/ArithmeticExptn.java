package exceptionHandling;

public class ArithmeticExptn {

	public static void main(String[] args) {
		try
		{
			int a=5;
			int b=0;
			System.out.println(a/b);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}

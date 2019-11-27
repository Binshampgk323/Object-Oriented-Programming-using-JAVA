package exceptionHandling;

public class Finalyy {

	public static void main(String[] args) {
		try
		{
			int a=45;
			int b=0;
			System.out.println(a/b);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("pgm closed");
		}

	}

}

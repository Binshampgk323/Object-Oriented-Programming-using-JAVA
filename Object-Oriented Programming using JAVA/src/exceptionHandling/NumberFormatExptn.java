package exceptionHandling;

public class NumberFormatExptn {

	public static void main(String[] args) {
		try
		{
			String str="abc";
			System.out.println(Integer.parseInt(str));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}

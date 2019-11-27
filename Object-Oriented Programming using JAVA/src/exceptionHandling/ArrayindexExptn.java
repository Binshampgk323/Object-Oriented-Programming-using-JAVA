package exceptionHandling;

public class ArrayindexExptn {

	public static void main(String[] args) {
		try
		{
			int a[]={1,2,4,5,6};
			System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}

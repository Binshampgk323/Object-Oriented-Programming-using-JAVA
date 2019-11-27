package Interface;
import java.util.Scanner;
public class Studentinterface {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter id");
		int id=s.nextInt();
		System.out.println("Enter the total");
		int t=s.nextInt();
		Student1 st=new Student1();
		st.detail(name,id);
		st.total(t);
	}

}
interface rank{
	public void detail(String name, int id) ;
}
interface details{
	public void total(int t) ;
}

class Student1 implements rank,details
{

	public void detail(String name, int id) {
		
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);


	}

	public void total(int t) {
		System.out.println("Total: "+t);

		
	}
	
}
package Abstraction;
import java.util.Scanner;
public class StudentAbstract {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.next();
		System.out.println("Enter Rollno");
		int rollno=s.nextInt();
		System.out.println("Maths score");
		int maths=s.nextInt();
		System.out.println("English score");
		int eng=s.nextInt();
		System.out.println("Physics score");
		int phy=s.nextInt();
		System.out.println("Chemistry score");
		int che=s.nextInt();
		System.out.println("Malayalam score");
		int mal=s.nextInt();
		StDetails d=new StDetails();
		d.display(name,rollno,maths,eng,phy,che,mal);
		d.mark(maths,eng,phy,che,mal);		
	}

}
abstract class Report
{
	abstract public void display(String name, int rollno, int maths, int eng, int phy, int che, int mal);
	abstract public void mark(int maths, int eng, int phy, int che, int mal);

public void view(int total) {
		
		
		if(total>450)
		{
			System.out.println("1 Rank");
		}
		else if(total<450&&total>400)
		{
			System.out.println("2 Rank");
		}
		else if(total<400&&total>350)
		{
			System.out.println("3 Rank");
		}
		else if(total<350&&total>300)
		{
			System.out.println("4 Rank");
		}
		else if(total<300)
		{
			System.out.println("Failed");
		}
	}
}
class StDetails extends Report
{

	public void display(String name, int rollno, int maths, int eng, int phy, int che, int mal) {
		
		System.out.println("Student details");
		System.out.println("**************");
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("Maths: "+maths);
		System.out.println("English: "+eng);
		System.out.println("Physics: "+phy);
		System.out.println("Chemistry: "+che);
		System.out.println("Malayalam: "+mal);
	}

	public void mark(int maths, int eng, int phy, int che, int mal) {
		int total=0;
		total=maths+eng+phy+che+mal;
		double avg=0;
		avg=total/5;
		System.out.println("--------------");
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);
		super.view(total);
	}
	
}
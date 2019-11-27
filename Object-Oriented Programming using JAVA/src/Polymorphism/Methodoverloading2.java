package Polymorphism;
import java.util.Scanner;
public class Methodoverloading2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=s.next();
		System.out.println("Enter the Roll no");
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
		Studentd st=new Studentd();
		st.display(name,rollno,maths,eng,phy,che,mal);
		st.display(maths,eng,phy,che,mal, mal);
		
	}
}

class Studentd
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

	public void display(int maths, int eng, int phy, int che, int mal, int mal2) {
		int total=0;
		total=maths+eng+phy+che+mal;
		double avg=0;
		avg=total/5;
		System.out.println("--------------");
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);
		display(total);
	}

	private void display(int total) {
		
		
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
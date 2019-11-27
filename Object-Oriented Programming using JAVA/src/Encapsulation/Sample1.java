package Encapsulation;
import java.util.Scanner;
public class Sample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter Name");
		st.setName(s.next());
		System.out.println("Id");
		st.setId(s.nextInt());
		System.out.println("Name: "+st.getName());
		System.out.println("Id: "+st.getId());
	}
}

class Student
{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

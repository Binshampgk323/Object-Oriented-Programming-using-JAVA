package String;
public class EmploydetailsBufferreader {

	public static void main(String[] args) {
		//Get employee details
	
		StringBuffer s=new StringBuffer("anu");
		StringBuffer a=new StringBuffer("45");
		StringBuffer id=new StringBuffer("abc123");
		StringBuffer id2=new StringBuffer("abc123");
		System.out.println("Employee details");
		
		s.insert(2,"f");   // insert value 
		id.replace(2, 4, "ecf"); //replace value of string
		a.append(" age"); //add value to string
		id2.reverse();
		System.out.println("Name :"+s);
		System.out.println("Age :"+a);
		System.out.println("id :"+id);
		System.out.println("reverse :"+id2);
		
		
		
		

	}

}

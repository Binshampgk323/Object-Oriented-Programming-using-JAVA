package Encapsulation;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Res r=new Res();
		Display d1=new Display();
		int id[]=new int[25];
		int i=1;
		System.out.println("Registration");
		System.out.println();
		System.out.println("Enter Name");
		r.setName(s.next());
		System.out.println("Enter address");
		r.setAddress(s.next());
		System.out.println("Enter contact Number");
		r.setContact(s.next());
		System.out.println("Enter Email id");
		r.setMail(s.next());
		System.out.println("Enter proof type");
		r.setProoftype(s.next());
		System.out.println("Enter proof id");
		r.setProofid(s.next());
		id[i]=i;
		
		d1.view(r.getName(),r.getAddress(),r.getContact(),r.getMail(),r.getProoftype(),r.getProofid());
		
		System.out.println("Thank you for registering... your id is "+i);
		i++;
	}

}
 class Res
{
	String name;
	String address;
	String contact;
	String mail;
	String prooftype;
	String proofid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getProoftype() {
		return prooftype;
	}
	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}
	public String getProofid() {
		return proofid;
	}
	public void setProofid(String proofid) {
		this.proofid = proofid;
	}
}

class Display
{
	 public void view(String name, String address, String contact, String mail, String prooftype, String proofid)
	 {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact: "+contact);
		System.out.println("E-Mail: "+mail);
		System.out.println("Proof type: "+prooftype);
		System.out.println("Proof id: "+proofid);
	 }
	 
	 
	
}

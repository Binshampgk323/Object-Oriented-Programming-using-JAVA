package Encapsulation;

import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Details d=new Details();
		d.registation();
		d.checking();

	}

}
class Details
{
	String no;
	String name;
	String address;
	String contact;
	String mail;
	String prooftype;
	String proofid;
	int ch=0,chn=0,cha=0,chp=0,chm=0,chc=0,chd=0;
	Scanner s=new Scanner(System.in);
	
	int id[]=new int[25];
	int i=1;
	
	public void registation() {
		System.out.println("Registration");
		System.out.println();
		System.out.println("Enter the number customer");
		setNo(s.next());
		System.out.println("Enter Name");
		setName(s.next());
		System.out.println("Enter address");
		setAddress(s.next());
		System.out.println("Enter contact Number");
		setContact(s.next());
		System.out.println("Enter Email id");
		setMail(s.next());
		System.out.println("Enter proof type");
		setProoftype(s.next());
		System.out.println("Enter proof id");
		setProofid(s.next());
	}
	
	public void checking() {
		if(ch==1&&chn==1&&cha==1&&chp==1&&chm==1&&chc==1&&chd==1)
		{
			System.out.println("Registration successfull..");
			view();
		}
		else
		{	
			if(ch==0)
			{
			System.out.println("Invalid no");
			
			}
			if(chn==0)
			{
			System.out.println("Invalid Name");
			
			}
			if(cha==0)
			{
			System.out.println("Invalid Address");
			
			}
			if(chc==0)
			{
			 System.out.println("Invalid Contact Number");
			 
			}
			if(chm==0)
			{
			 System.out.println("Invalid Email");
			
			}
			if(chp==0)
			{
			System.out.println("Invalid Proof type");
			
			}
			if(chd==0)
			{
			System.out.println("Invalid proof id");
			}
			System.out.println("Registration fails..");
		}
		
	}

	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		if(no.matches("^[0-9]*$"))
		{
			this.no = no;
			ch =1;
		}
		else
		{
			ch=0;	
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.matches("^[a-zA-Z]*$"))
		{
			this.name = name;
			chn=1;
		}
		else
		{
            chn=0;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address.matches("^[a-zA-Z0-9]*$"))
		{
			this.address = address;
			cha=1;
		}
		else
		{
            cha=0;
		}
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contact=contact;
            chc=1;
        }
        else
        {
            chc=0;
        }
    }
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail)
    {
        if (mail.contains("@"))
        {
            this.mail=mail;
            chm=1;
        }
        else
        {
            chm=0;
        }
    }
	
	public String getProoftype() {
		return prooftype;
	}
	
	public void setProoftype(String prooftype) {
		if(prooftype.matches("^[a-zA-Z]*$"))
		{
			this.prooftype = prooftype;
			chp=1;
		}
		else
		{
            chp=0;
		}
	}
	
	public String getProofid() {
		return proofid;
	}
	
	public void setProofid(String proofid) {
		if(proofid.matches("^[A-Za-z0-9]*$"))
		{
			this.proofid = proofid;
			chd=1;
		}
		else
		{
				chd=0;
		}
	}
	
	public void view() {

		System.out.println("Your Details");
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact: "+contact);
		System.out.println("E-Mail: "+mail);
		System.out.println("Proof type: "+prooftype);
		System.out.println("Proof id: "+proofid);
		id[i]=i;
		System.out.println("Your id is "+i);
		i++;
	}
	
}

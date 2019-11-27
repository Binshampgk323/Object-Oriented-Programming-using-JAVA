package oops;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    System.out.println("Enter your name");
    String name=s.nextLine();
    System.out.println("Enter your address");
    String address=s.nextLine();
    System.out.println("Contact Number");
    String mob=s.nextLine();
    System.out.println("E-Mail ID");
    String mail=s.nextLine();
     System.out.println("Enter proof type");
    String proof=s.nextLine();
       System.out.println("Enter proof id");
    String proofid=s.nextLine();
  Customer c=new Customer(num,name,address,mob,mail,proof,proofid);
    c.display(num,name,address,mob,mail,proof,proofid);
  }
}
  class Customer
  {
	  int num ;
    String name,address,mob,mail,proof,proofid;
    public Customer(int num,String name,String address,String mob,String mail,String proof,String proofid)
    {
    this.num=num;
      this.name=name;
      this.address=address;
      this.mob=mob;
      this.mail=mail;
      this.proof=proof;
      this.proofid=proofid;
    }
    public static void display(int num,String name,String address,String mob,String mail,String proof,String proofid)
    {
      
      System.out.println("Your Details");
      System.out.println(name);
      System.out.println(address);
      System.out.println(mob);
      System.out.println(mail);
      System.out.println(proof);
      System.out.println(proofid);
      System.out.println("Thank you for registering. Your id is 1...");
    }
  }

package Interface;
import java.util.*;
public class Newn {
	  public static void main(String args[])
	  {
	   	 Scanner s=new Scanner(System.in);int m=0;
	     CurrentAccount c=new CurrentAccount();
	     SavingsAccount sa=new SavingsAccount();
	     System.out.println("1.Current Account\n2.Savings Account");
	  	int n=s.nextInt();
	    if(n==1)
	    {
	      c.display();
	      c.computeMaintainanceCharge();
	    }
	    else if(n==2)
	    {
	         sa.display();
	     	 sa.computeMaintainanceCharge(m);
	    }
	  }
	}
	interface MaintainanceCharge
	{
	  void computeMaintainanceCharge();
	  void computeMaintainanceCharge(int m);
	}
	class Account
	{
	Scanner s=new Scanner(System.in);
	  void display()
	  {
	  System.out.println("Name");
	  String name=s.nextLine();
	  System.out.println("Account Number");
	  int account=s.nextInt();
	  System.out.println("Account Balance");
	  int bal=s.nextInt();
	  System.out.println("Enter the Start Date(yyyy-mm-dd)");
	  String date=s.nextLine();
	  }
	}
	class CurrentAccount extends Account implements MaintainanceCharge
	{
		public void computeMaintainanceCharge()
	    {
	    	System.out.println("Enter the Years");
	  		int n=s.nextInt();
	    	int am=0;int m=100;
	        am=(2*m*n)+200;
	        System.out.printf("Maintainence Charge For Current Account %.2f"+am);
	    }

		@Override
		public void computeMaintainanceCharge(int m) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class  SavingsAccount extends Account implements MaintainanceCharge
	{
	  public void computeMaintainanceCharge(int m)
	    {
	    	System.out.println("Enter the Years");
	  		int n=s.nextInt();
	    	int am=0;
	    	m=50;
	        am=(2*m*n)+50;
	        System.out.printf("Maintainence Charge For Current Account %.2f"+am);
	    }

	@Override
	public void computeMaintainanceCharge() {
		// TODO Auto-generated method stub
		
	}
	
	}

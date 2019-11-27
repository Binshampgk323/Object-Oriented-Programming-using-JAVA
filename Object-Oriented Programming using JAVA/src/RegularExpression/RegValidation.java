package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegValidation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//email format
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern mailpattern = Pattern.compile(regex);
		
		//first name format
		
		String firstName = "[A-Z][a-z]*";
		Pattern namepattern=Pattern.compile(firstName);
		
		// last name format
		
		String lastname= "[A-Z]+([ '-][a-zA-Z]+)*";
		Pattern lastpattern=Pattern.compile(lastname);
		
		//Register number format
		
		String regno="[0-9]*";
		Pattern regpattern=Pattern.compile(regno);
		
		// Rank format
		
		String rank="[0-9]*";
		Pattern rankpattern=Pattern.compile(rank);
		
		// Year format
		
		String year="[0-9]*";
		Pattern yearpattern=Pattern.compile(year);
		
		//Department format
		
		String dep="^[A-Z][.][A-Za-z]*$";
		Pattern deppattern=Pattern.compile(dep);
		
		System.out.println("Enter first Name");
		String fName=s.next();
		Matcher fnamemat=namepattern.matcher(fName); //check entered first name is matches to first name format
		
		System.out.println("Last name");
		String lname=s.next();
		Matcher lnamemat=lastpattern.matcher(lname);//check entered last name is matches to last name format
		
		System.out.println("Email");
		String mail=s.next();
		Matcher mailmat=mailpattern.matcher(mail);//check entered mail is matches to mail format
		
		System.out.println("Regno");
		String reg=s.next();
		Matcher regmat=regpattern.matcher(reg);//check entered regno is matches to regno format
		
		System.out.println("Rank");
		String r=s.next();
		Matcher rankmat=rankpattern.matcher(r);//check entered rank is matches to rank format
		
		System.out.println("Year");
		String y=s.next();
		Matcher yearmat=yearpattern.matcher(y);//check entered year is matches to year format
		
		System.out.println("Department");
		String dept=s.next();
		Matcher depmat=deppattern.matcher(dept);//check entered department is matches to department format
		
		Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		
		
		if(fnamemat.matches())
		{
			if(lnamemat.matches())
			{
				if(mailmat.matches())
				{
					if(regmat.matches())
					{
						if(rankmat.matches())
						{
							if(yearmat.matches())
							{
								if(depmat.matches())
								{
									System.out.println("User name: "+mail);
									System.out.println("Password:");
									String pass=s.next();
									Matcher passmatcher=pswNamePtrn.matcher(pass);
									if(passmatcher.matches())
									{
										System.out.println("Successfully login");
									}
									else
									{
										System.out.println("Invalid password");
									}
								}
								else
								{
									System.out.println("Invalid department");
								}
							}
							else
							{
								System.out.println("Invalid year");
							}
						}
						else
						{
							System.out.println("Invalid rank");
						}	
					}
					else
					{
						System.out.println("Invalid reg no");
					}
				}
				else
				{
					System.out.println("Invalid email");
				}
			}
			else
			{
				System.out.println("Invalid last name");
			}
		}
		else
		{
			System.out.println("Invalid first name");
		}
		
	}

}

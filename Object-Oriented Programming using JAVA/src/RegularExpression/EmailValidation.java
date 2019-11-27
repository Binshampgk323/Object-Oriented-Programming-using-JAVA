package RegularExpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//email format
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		//pasword format
		Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		//Pattern and Matcher are class ,compile is method matches is 
		Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter Email");
		String email=s.next();
		Matcher mailmatcher=pattern.matcher(email); 
		System.out.println("Enter password");
		String password=s.next();
		Matcher passmatcher=pswNamePtrn.matcher(password);
		if(mailmatcher.matches())
		{
			System.out.println("Valid email id");
		}
		else
		{
			System.out.println("Ivalid email id");
		}
		
		if(passmatcher.matches())
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Ivalid password");
		}
	}

}

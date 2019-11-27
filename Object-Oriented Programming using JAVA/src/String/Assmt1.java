package String;
import java.util.Scanner;
public class Assmt1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String string1=s.nextLine();
		string1=string1.replaceAll(" ","");
		string1=string1.toUpperCase();
		  for(char c='A';c<='Z';c++)
	        {
	            int count = 0;
	            for(int i = 0; i < string1.length(); i++)
	            {
	                char x=string1.charAt(i);
	                if(x==c)
	                {
	                    count++;
	                }
	            }
	            
	            if(count>0)
	            {
	                System.out.println(c+" "+count);
	            }
	        }

	}

}

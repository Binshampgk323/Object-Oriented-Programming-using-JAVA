package String;
import java.util.Scanner;
public class EvenstringOddreverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter word");
		
		// Take input from user
		
		String word=s.nextLine(); 
		
		// Store each word in array
		
		String words[]=word.split(" ");
		
		/*check position of each string and print even posion string and
		 reverse of odd position strings*/
		
		for(int i=0;i<words.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(words[i]+" ");
			}
			else if(i%2!=0)
			{
				String string1=words[i];
				for(int j=string1.length()-1;j>=0;j--)
				{
					System.out.print(string1.charAt(j));
					
				}
				System.out.print(" ");
				
			}
		
			
		}

	}

}

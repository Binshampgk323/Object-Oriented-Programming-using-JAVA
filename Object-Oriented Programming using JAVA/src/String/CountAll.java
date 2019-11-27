package String;
import java.util.Scanner;
public class CountAll {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter paragraph");
		String paragraph=s.nextLine();
		int space=0,number=0,upper=0,lower=0,symbol=0,chart=0,vowel=0;
		int length=paragraph.length();
		for(int i=0;i<length;i++)
		{
			char c=paragraph.charAt(i);
			if(c==32)
			{
				space++;
			}
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				vowel++;
			}
			else
			{
				chart++;
			}	

			if(c>=33&&c<=47||c>=58&&c<=64||c>=123&&c<=126||c>=91&&c<=96)
			{
				symbol++;
			}
			else if(c>=48&&c<=57)
			{
				number++;
			}
			if(c>=65&&c<=90)
			{
				upper++;
			}
			else if(c>=97&&c<=122)
			{
				lower++;
			}
				
		}
		System.out.println("Vowel count="+vowel);
		System.out.println("Character count="+chart);
		System.out.println("Lowercase count="+lower);
		System.out.println("Uppercase count="+upper);
		System.out.println("Number count="+number);
		System.out.println("Space count="+space);
		System.out.println("Special symbols count="+symbol);
		

	}

}

package String;

import java.util.Scanner;

public class Newassemnt2 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter paragraph");
		  String str=s.nextLine();
		  int m=0,l=0;
		  String word[]=str.split(" ");
		  for(int i=0;i<word.length-1;i++)
		  {
			  l=word[i].length();
			  if(l>m)
			  {
				  m=l;
			  }
		  }
		  for(int i=0;i<word.length;i++)
		  {
			   l=word[i].length();
			   if(l==m)
			  {
				  System.out.println(word[i]);
				   System.out.println(m);
			  }
		  }
		   
	
	 

	}

}

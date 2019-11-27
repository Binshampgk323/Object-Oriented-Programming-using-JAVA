package String;

public class Example1 {

	public static void main(String[] args) {
		String string1=new String("now is"); 
		String string2=new String ("the time");
		String string3=new String(" the");
		
		//find length of strings
		
		System.out.println("string1: "+string1.length()); 
		System.out.println("string2: "+string2.length());
		System.out.println("string3: "+string3.length());
		
		//find character at index 4
		
		System.out.println("char at: "+string1.charAt(4));  
		
		//get sub string start with index 1 and end with 5
		
		System.out.println("sub string: "+string1.substring(1,5));
		
		//return true when string start with "the"
		
		System.out.println("Start with: "+string2.startsWith("the"));
		
		// return staring index value "is"
		
		System.out.println("index: "+string1.indexOf("is")); 
		
		//concantidate two strings
		
		System.out.println("concat: "+string1.concat(string3)); 
		
		 //replace "t" with "T" 
		
		System.out.println("replace: "+string3.replace("t","T"));
		
		//store each word in array 
		
		String word[]=string1.split(" "); 
		System.out.print("split: ");
		for(int i=0;i<word.length;i++)
		{
			System.out.print("{"+word[i]+"}");
		}
		
		//check string equality
		
		System.out.println("\nequals: "+string2.equals(string3));
		
		//all character covert into uppercase
		
		System.out.println("string1: "+string1.toUpperCase()); 
		
		//all character convert into lowercase
		
		System.out.println("string1: "+string1.toLowerCase()); 

	}

}

package DateTime;
import java.util.Calendar;
public class CalenderDateYear {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println("Present year : "+c.get(Calendar.YEAR));
		System.out.println("Present day : "+c.get(Calendar.DATE));
		System.out.println("The current date : "+c.getTime());
		c.add(Calendar.DATE,-7);
		System.out.println("7 days ago : " +c.getTime());
		c.add(Calendar.MONTH, 10);
		System.out.println("10 months later : "+c.getTime());
		c.add(Calendar.YEAR, 10);
		System.out.println("10 years later : "+c.getTime());
	
	}

}

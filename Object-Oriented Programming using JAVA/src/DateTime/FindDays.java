package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FindDays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    String start =sc.nextLine();// format 2017-11-20
	    String end = sc.nextLine();
	    LocalDate ds = LocalDate.parse(start);
	    LocalDate de = LocalDate.parse(end);
	    long total = ChronoUnit.DAYS.between(ds,de);
	    System.out.println(total);
	 

	}

}

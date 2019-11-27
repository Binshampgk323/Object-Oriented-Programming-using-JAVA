package DateTime;

import java.time.*;  //time package contain local date and time

public class CurrentDateTime {

	public static void main(String[] args) {
		System.out.println("Today date");
		LocalDate date=LocalDate.now();  //getting today date
		System.out.println("Date : "+date);
		System.out.println("Current time");
		LocalTime time=LocalTime.now();  //getting current time
		System.out.println("Time : "+time);
		System.out.println("Current date and time");
		LocalDateTime dt=LocalDateTime.now();   // getting today date and cuurent time
		System.out.println("Date and Time : "+dt);
		

	}

}

package DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatt {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Before formatting : "+dt);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E, dd:mm:yyyy   hh:mm:ss");
		String formatdate=dt.format(format);
		System.out.println("After formatting : "+formatdate);
	}

}

package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".@");
		Matcher m=p.matcher("n@");
		boolean b=m.matches();
		System.out.println(b);

	}

}

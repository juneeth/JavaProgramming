package sample_exmaple;

import java.time.LocalDateTime;
import java.util.Formatter;

public class DateTimeFormatter {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

	}


	private static DateTimeFormatter ofPattern(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

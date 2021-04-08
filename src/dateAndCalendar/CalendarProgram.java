package dateAndCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarProgram {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date date1 = Date.from(Instant.parse("2019-07-28T19:42:06Z"));

		Calendar calendar1 = Calendar.getInstance();

		calendar1.setTime(date1);
		calendar1.add(Calendar.HOUR_OF_DAY, 4);
		date1 = calendar1.getTime();
		System.out.println(sdf1.format(date1));

		int minutes = calendar1.get(Calendar.MINUTE);
		System.out.println(minutes);

		int month = 1 + calendar1.get(Calendar.MONTH);
		System.out.println(month);

	}

}

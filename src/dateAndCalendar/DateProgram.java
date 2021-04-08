package dateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateProgram {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date date1 = sdf1.parse("25/06/2018");
		Date date2 = sdf2.parse("25/06/2018 15:42:07");

		Date date3 = new Date();
		Date date4 = new Date(System.currentTimeMillis());
		Date date5 = new Date(0L);
		Date date6 = new Date(1000L * 60L * 60L * 5);
		
		Date date7 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		
		
		System.out.println("--------------------------");
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date5);
		System.out.println(date6);
		System.out.println(date7);
		System.out.println(date1);
		System.out.println("--------------------------");		
		System.out.println("Date2: " + sdf2.format(date2)); 
		System.out.println("Date3: " + sdf2.format(date3)); 
		System.out.println("Date4: " + sdf2.format(date4)); 
		System.out.println("Date5: " + sdf2.format(date5)); 
		System.out.println("Date6: " + sdf2.format(date6)); 
		System.out.println("Date7: " + sdf2.format(date7)); 
		System.out.println("--------------------------");
		System.out.println("Date1: " + sdf3.format(date1));
		System.out.println("Date2: " + sdf3.format(date2)); 
		System.out.println("Date3: " + sdf3.format(date3)); 
		System.out.println("Date4: " + sdf3.format(date4)); 
		System.out.println("Date5: " + sdf3.format(date5)); 
		System.out.println("Date6: " + sdf3.format(date6)); 
		System.out.println("Date7: " + sdf3.format(date7)); 
	}

}

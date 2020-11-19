import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondSunday {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		cal.set(2010, 0, 1);

		for (int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);

			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
			
			cal.set(Calendar.DATE, secondSunday);
			
			Date d = cal.getTime();
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd F번쨰 E요일 입니다.").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DATE, 1);
		}
	}
}

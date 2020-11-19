import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Payday {
	static int paycheckCount(Calendar from, Calendar to) {

		if (from == null || to == null) {
			return 0;
		}
		if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
			return 1;
		}
		int FYear = from.get(Calendar.YEAR);
		int FMonth = from.get(Calendar.MONTH);
		int FDate = from.get(Calendar.DAY_OF_MONTH);

		int TYear = to.get(Calendar.YEAR);
		int TMonth = to.get(Calendar.MONTH);
		int TDate = to.get(Calendar.DAY_OF_MONTH);

		int monDiff = ((TYear * 12) + TMonth) - ((FYear * 12) + FMonth);

		if (monDiff < 0) {
			return 0;
		}

		if (FDate <= 21 && TDate >= 21) {
			monDiff++;
		}

		if (FDate > 21 && TDate < 21) {
			monDiff--;
		}

		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");

		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 0, 1);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 23);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);

		fromCal.set(2011, 0, 22);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
	}
}

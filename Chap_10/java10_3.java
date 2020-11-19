import java.text.DecimalFormat;
import java.text.NumberFormat;

public class java10_3 {

	public static void main(String[] args) {
		String data = "123,456,789.5";
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df1 = new DecimalFormat("#,####");
		System.out.println("data:" + data);
		try {
			Number num = df.parse(data);
			double d = num.doubleValue();
			System.out.println("반올림:" + Math.round(d));
			System.out.println("만단위:" + df1.format(d));
		} catch (Exception e) {

		}
	}

}

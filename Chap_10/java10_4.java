import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class java10_4 {

	public static void main(String[] args) {
		Date d;
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat df1 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		Scanner sc = new Scanner(System.in);
		String s;

		while (true) {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예:2007/05/11)");
			System.out.print(">>");
			try {
				s = sc.nextLine();
				d = df.parse(s);
				break;
			} catch (Exception e) {
			}
		}
		System.out.println(df1.format(d));
	}

}

package nctu05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTest {
	public static void main(String[] args) {
		SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM/dd HH:mm");
		SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E");
		Date n1 = new Date();
		System.out.println(myFmt.format(n1));
		System.out.println(myFmt2.format(n1));
	}

}

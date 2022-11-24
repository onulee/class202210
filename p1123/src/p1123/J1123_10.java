package p1123;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J1123_10 {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar now2 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초");
		
		String nowTime1 = sdf1.format(now); //"2022-11-23 16:27:34"
		String nowTime2 = sdf2.format(now2.getTime());
		System.out.println(nowTime1);
		System.out.println(nowTime2);
		
		

	}

}

package p1123;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class J1123_11 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 현재의 시간을 가져옴.
		String nowTime1 = sdf1.format(System.currentTimeMillis());
		LocalDateTime nowTime2 = LocalDateTime.now(); //java8이후
		System.out.println(nowTime1);
		System.out.println(nowTime2); //
		System.out.println(System.currentTimeMillis());

	}

}

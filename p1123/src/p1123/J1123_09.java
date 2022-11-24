package p1123;

import java.util.Calendar;

public class J1123_09 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //현재시간을 가져오게 됨.
		//[ 일자 ]
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		// 월은 1이 작음 - 0,1,2,3...11
		System.out.println("월 : "+(today.get(Calendar.MONTH)+1)); 
		System.out.println("일 : "+today.get(Calendar.DATE));
		// 1:일요일,2:월요일,3:화,4:수,5:목,6:금,7:토요일
		System.out.println("요일 : "+today.get(Calendar.DAY_OF_WEEK));
		
		// [ 시간 ]
		// 0:오전, 1:오후
		System.out.println("오전/오후 : "+today.get(Calendar.AM_PM));
		System.out.println("시 : "+today.get(Calendar.HOUR));
		System.out.println("분 : "+today.get(Calendar.MINUTE));
		System.out.println("초 : "+today.get(Calendar.SECOND));
		System.out.println("밀리초 : "+today.get(Calendar.MILLISECOND));
		

	}

}

package p1123;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class J1123_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int year=0;
		int age=0;
		System.out.println("주민번호를 입력하세요.>> 880101-1101111");
		String input = scan.next();
		
		String result = input.substring(0,2);
	    char ch = input.charAt(7);
		System.out.println("년도 : "+result);
		System.out.println("출생년대 : "+ch);
		
		// 8자리 1,2 -> 1900년대생
		// 8자리 3,4 -> 2000년대생
		
		LocalDate now = LocalDate.now();
//		LocalDateTime now2 = LocalDateTime.now();
		year = now.getYear();
		System.out.println("현재 년도 : "+year);
		
		switch(ch) {
		
		case '1':
			age = year - Integer.parseInt("19"+result);
		    System.out.print("당신은 남자이며, ");
		    System.out.printf("나이는 [ %d ]세 입니다.",age);
			break;
		case '2':
			age = year - Integer.parseInt("19"+result);
		    System.out.print("당신은 여자이며, ");
		    System.out.printf("나이는 [ %d ]세 입니다.",age);
			break;
		case '3':
			age = year - Integer.parseInt("20"+result);
		    System.out.print("당신은 남자이며, ");
		    System.out.printf("나이는 [ %d ]세 입니다.",age);
			break;
		case '4':
			age = year - Integer.parseInt("20"+result);
			System.out.print("당신은 여자이며, ");
			System.out.printf("나이는 [ %d ]세 입니다.",age);
			break;
		}
		
		
//		switch(result) {
//		
//		case "12","01","02":
//			System.out.println("겨울에 태어났습니다.");
//			break;
//		case "03","04","05":
//			System.out.println("봄에 태어났습니다.");
//			break;
//		case "06","07","08":
//			System.out.println("여름에 태어났습니다.");
//			break;
//		case "09","10","11":
//			System.out.println("가을에 태어났습니다.");
//			break;
//		
//		}
		
		// 생일이 12,1,2 - 겨울에 태어났습니다.
		// 3,4,5 - 봄에 태어났습니다. 6,7,8-여름에 태어났습니다. 9,10,11-가을에 태어났습니다.
		// 출력하시오
		
		
		
//		String name = "Hello! How are you?";
//		String input = name.substring(7, 14);
//		System.out.println(input);
//		System.out.println(input.length());
		

	}

}

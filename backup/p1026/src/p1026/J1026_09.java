package p1026;

import java.util.Scanner;

public class J1026_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("핸드폰 앞번호를 입력해주세요.");
		//010,011,016,017,018,019
		String str = scan.next();
		char ch = str.charAt(2);
		//1. char -> int형변환  2.7+"" int->String  3.String -> int Integer.parseInt()
		int num = ch-'0'; 
		// 1,7 -> SK  6,8 -> KT  9 -> LG
		switch(num) {
		
		case 1:
		case 7:
			System.out.println("SK");
			break;
		case 6: case 8:	
			System.out.println("KT");
			break;
		case 9:
			System.out.println("LG");
			break;
		default:
			System.out.println("다시 입력하세요.");
			break;
		}
		
		
		
//		switch(num) {
//		
//		case 1:
//			System.out.println("1이 입력되었습니다.");
//		case 2:
//			System.out.println("2가 입력되었습니다.");
//		case 3:
//			System.out.println("3이 입력되었습니다.");
//			break;
//		case 4:
//			System.out.println("4가 입력되었습니다.");
//			break;
//		case 5:
//			System.out.println("5가 입력되었습니다.");
//			break;
//		default:
//			System.out.println("6이상의 숫자입니다.");
//			break;
//		}//switch

	}//main

}//class

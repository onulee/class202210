package p1026;

import java.util.Scanner;

public class J1026_05_대소문자구분 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		String str = "abc";
		String str2 = new String("Abc");
		String str3 ="abc";
		String str4 = new String("abc");
		
//		if(str2==str4) {  // str == str2
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		// str == str2 안됨, equalsIgnoreCase : 대소문자 구분없이 비교
		if(str.equalsIgnoreCase(str2)) {  
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println(str);
		System.out.println(str2);
		
		
		
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요.");
//		String input = scan.next();
//		char ch = input.charAt(0);
//		// ch가 x 또는 X인지 확인
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("프로그램을 종료합니다.");
//		} else {
//			System.out.println("프로그램을 계속 실행합니다.");
//		}
	}// main

}// class

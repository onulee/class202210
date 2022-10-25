package p1025;

import java.util.Scanner;

public class J1025_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영문소문자를 입력하세요.>>");
		String str = scan.next();
	    char ch = str.charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("영문소문자입니다.");
			
			
			
			
		}else {
			System.out.println("영문소문자가 아닙니다.");
		}

	}

}

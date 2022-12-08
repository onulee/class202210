package p1024;

import java.util.Scanner;

public class J1024_08 {

	public static void main(String[] args) {
		// 대문자를 입력하면 소문자 1개를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.>>");
		String input = scan.next(); //abcdef
		char ch = input.charAt(0);  //String -> char
		
		// 영문소문자 1개를 입력하면 대문자가 출력되도록 하시오.
		char ch2 = (char)(ch+32);  //소문자를 대문자 취환

		System.out.println("입력문자 : "+input);
		System.out.println("첫글자 : "+ch2);

	}

}

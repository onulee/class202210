package p1123;

import java.util.Scanner;

public class J1123_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"홍길동","홍길자","홍길순","유관순","이순신","김구","김유신"};
		int[] score = {100,90,99,98,87,85,80};
		
		System.out.println("찾고자 하는 이름을 검색하세요.>>");
		String input = scan.nextLine();
		for(int i=0;i<name.length;i++) {
			if(input.contains(name[i])) { //true -> 찾고자하는 이름이 존재함.
				
			}
		}

	}

}

package p1123;

import java.util.Scanner;

public class J1123_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"홍길동","홍길자","홍길순","유관순","이순신","김구","김유신"};
		int[] score = {100,90,99,98,87,85,80};
		int count=0;
		
		while(true) {
			System.out.println("찾고자 하는 이름을 검색하세요.>>");
			String input = scan.nextLine(); //홍
			for(int i=0;i<name.length;i++) {
				if(name[i].contains(input)) { //true -> 찾고자하는 이름이 존재함.
					System.out.printf("이름 : %s, 점수 : %d \n",name[i],score[i]);
					count++;
				}
			}
			System.out.printf("찾고자 하는 학생 [ %d ]명이 검색되었습니다. \n",count);
			count=0;
			
		}//while

	}//main

}//class

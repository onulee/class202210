package p1110;

import java.util.Scanner;

public class J1110_03 {

	public static void main(String[] args) {
		// 변수선언
		StuCal stuCal = new StuCal(); //객체선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		loop:
		while(true) {
			// 1. 화면출력
			choice = stuCal.screen_print(); 
			switch(choice) {
			
			case 1: //성적입력
				stuCal.score_input();
				break;
			case 2:
				stuCal.score_print();
				break;
			case 3:
				stuCal.score_modify();
				break;
			case 4:
				stuCal.score_rank();
				break;
				
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			}//switch
			
		}//while

	}//main

}//class

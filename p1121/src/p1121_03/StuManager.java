package p1121_03;

import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) {
		
		StuCal stuCal = new StuCal();
		int choice = 0;
		
		loop:
		while(true) {
			
			//화면출력메소드 호출
			choice = stuCal.screen_print();
			
			switch(choice) {
			case 1:
				// 성적입력메소드 호출
				stuCal.score_input();
				break;
			case 2:
				// 성적출력메소드 호출
				stuCal.score_print();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 0:
				System.out.println(" [[ 프로그램 종료 ]] ");
				break loop;
			}//switch
			
			
			
			
		}
		
		
		

	}

}

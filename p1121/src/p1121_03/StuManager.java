package p1121_03;

import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) throws Exception {
		
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
				// 성적수정메소드 호출
				stuCal.score_modify();
				break;
			case 4:
				// 학생검색메소드 호출
				stuCal.stu_search();
				break;
			case 5:
				// 등수처리 호출
				stuCal.score_rank();
				break;
			case 6:
				// 성적정렬선택 호출
				stuCal.name_sort();
				break;
			case 7:
				// 파일불러오기 호출
				stuCal.open_file();
				break;
			case 8:
				// 파일저장오기 호출
				stuCal.save_file();
				break;
			case 0:
				System.out.println(" [[ 프로그램 종료 ]] ");
				break loop;
			}//switch
			
			
			
			
		}
		
		
		

	}

}

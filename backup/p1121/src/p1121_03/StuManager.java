package p1121_03;

import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		StuCal stuCal = new StuCal();
		int choice = 0,count=0;
		String id,pw;
		
		
		//로그인
		while(true) {
			System.out.println("[ 로그인을 해야 접속이 가능합니다. ]");
			System.out.println("ID를 입력하세요.(0.프로그램종료)>>");
			id = scan.next();
			System.out.println("PASS를 입력하세요.>>");
			pw = scan.next();
			
			if(count>3) {
				System.out.println("");
				break;
			}
			// 3번이상 맞지 않으면 프로그램 자동종료
			if(id.equals("admin") && pw.equals("1111")) {
				System.out.println("정상적으로 로그인 되었습니다.");
				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
				count++;
			}
			break;
		}//
		
		
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

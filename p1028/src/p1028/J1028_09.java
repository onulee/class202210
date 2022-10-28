package p1028;

import java.util.Scanner;

public class J1028_09 {

	public static void main(String[] args) {
		// 성적처리프로그램
		// 1. 변수선언
		// 2. 반복문 작성 - while
		// 3. 메인화면 출력 - print
		// 4. switch문 작성
		// 5. 각각 번호별로 프로그램 작성
		
		// 변수선언
		Scanner scan = new Scanner(System.in);
		int choice=0,score=0; //입력번호,점수수정 변수선언
		String name="";
		int kor=0,eng=0,math=0,total=0; //과목점수 변수선언
		double avg = 0;
		
		// 무한반복
		loop:
		while(true) {
			//메인화면출력
			System.out.println("  [ 성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			scan.nextLine();
			
			//switch문 작성
			switch(choice) {
			case 1:
				System.out.println("[[ 성적입력 ]]");
				
				
				
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				break;
				
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			
			
			}//switch
			
			
		}//while

	}//main

}//class

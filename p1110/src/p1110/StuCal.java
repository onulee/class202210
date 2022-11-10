package p1110;

import java.util.Scanner;

public class StuCal {

	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10]; //인스턴수 변수
	
	// 1. 화면출력
	int screen_print() {
		int choice = 0;
		System.out.println(" [ 성적처리프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();
		
		return choice;
	}//screen
	
	// 성적입력메소드
	void score_input() {
		
		
		
		
	}
	// 성적출력메소드
	void score_print() {
		
	}
	
	// 성적수정메소드
	void score_modify() {
		
	}
	
	// 등수처리
	void score_rank() {
		
	}
	
	
	
	
	
}

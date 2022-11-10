package p1110;

import java.util.Scanner;

public class StuCal {

	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10]; //배열선언
	String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	String name;
	int kor,eng,math,total,rank;
	double avg;
	int count;
	
	
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
		System.out.println("[[ 성적입력 ]]");
		System.out.println();
		System.out.printf("%d번째 이름을 입력하세요.(0.이전페이지 이동)>>\n",count+1);
		name = scan.next();
		if(name.equals("0")) {
			System.out.println("이전페이지 이동합니다.!!");
			System.out.println();
			return;
		}
		System.out.println("국어점수를 입력하세요.>>");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math = scan.nextInt();
		s[count] = new Student(name,kor,eng,math);
		System.out.printf("%d명 입력이 완료되었습니다.!!\n",count+1);
		count++;
	}
	// 성적출력메소드
	void score_print() {
		System.out.println("                   [[ 성적출력 ]]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------------");
		// 학생출력
		for(int i=0;i<count;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg,s[i].rank);
		}//for
	}
	
	// 성적수정메소드
	void score_modify() {
		
	}
	
	// 등수처리
	void score_rank() {
		
	}
	
	
	
	
	
}

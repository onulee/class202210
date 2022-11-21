package p1121_03;

import java.util.ArrayList;
import java.util.Scanner;

public class StuCal {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>(); //list 자동10개 생성
//	Student[] s = new Student[10];
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNum,name,checkName;
	int kor,eng,math,total,rank;
	double avg;
	int choice,count;
	
	//화면출력메소드
	int screen_print() {
		System.out.println("[ 성적처리프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();
		
		return choice;
	}//screen_print
	
	// 1. 성적입력메소드
	void score_input() {
		while(true) {
			System.out.println("[[ 성적입력 ]]");
			System.out.printf("%d 번째 이름을 입력하세요.(0.이전페이지 이동)>>",(list.size()+1));
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.!!");
				System.out.println();
				break; //이전페이지 이동
			}
			
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			list.add(new Student(name,kor,eng,math)); // list.size()
			System.out.println(name + " 학생이 입력되었습니다.");
		}//while
	}//성적입력
	
	// 2. 성적출력메소드 
	void score_print() {
		System.out.println("[[ 성적출력 ]]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					list.get(i).stuNum,list.get(i).name,list.get(i).kor,
					list.get(i).eng,list.get(i).math,list.get(i).total,list.get(i).avg,
					list.get(i).rank);
		}//for
		System.out.println();
		
	}//성적출력
	
	
	
	

}

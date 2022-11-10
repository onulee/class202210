package p1110;

import java.util.Scanner;

public class StuCal {

	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10]; //배열선언
	String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	String name,checkName;
	int kor,eng,math,total,rank;
	double avg;
	int choice,count,checkNo,flag;
	
	
	// 1. 화면출력
	int screen_print() {
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
		System.out.println("[[ 성적수정 ]]");
		System.out.println("수정할 학생의 이름을 입력하세요.>>");
		checkName = scan.next();
		// 홍길동,유관순,이순신
		for(int i=0;i<count;i++) {
			if(checkName.equals(s[i].name)) {
				System.out.printf("%s의 학생이 검색되었습니다.!! \n",s[i].name);
				checkNo = i;
				flag=1;
				break;
			}//if
		}//for
		
		if(flag==0) {
			System.out.println("해당학생이 없습니다. 다시 검색해주세요.!!");
			return;
		}//if
		
		flag=0; //학생검색 리셋
		
		//점수수정 화면출력
		System.out.printf("[ %s 의 학생성적수정 ]\n",s[checkNo].name);
		System.out.println("1. 국어점수");
		System.out.println("2. 영어점수");
		System.out.println("3. 수학점수");
		System.out.println("0. 수정취소");
		System.out.println("---------------");
		System.out.println("수정할 과목을 선택하세요.>>");
		choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			// 국어성적수정
			System.out.printf("현재 국어점수 : %d\n",s[checkNo].kor);
			System.out.printf("수정할 국어점수 입력 :\n");
			s[checkNo].kor = scan.nextInt();
			break;
		case 2:
			// 영어성적수정
			System.out.printf("현재 영어점수 : %d\n",s[checkNo].eng);
			System.out.printf("수정할 영어점수 입력 :\n");
			s[checkNo].eng = scan.nextInt();
			break;
		case 3:
			// 수학성적수정
			System.out.printf("현재 수학점수 : %d\n",s[checkNo].math);
			System.out.printf("수정할 수학점수 입력 :\n");
			s[checkNo].math = scan.nextInt();
			break;
		
		case 0:
			System.out.println("성적수정이 취소되었습니다.!!");
			System.out.println();
			return;
		}//switch
		
		s[checkNo].total = s[checkNo].kor + s[checkNo].eng + s[checkNo].math;
		s[checkNo].avg = s[checkNo].total/3.0;
		
		System.out.println("점수수정이 완료되었습니다.!!");
		System.out.println();
	}//switch
	
	// 등수처리
	void score_rank() {
		
	}
	
	
	
	
	
}

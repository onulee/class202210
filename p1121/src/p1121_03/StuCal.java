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
	int choice,count,checkNo,flag;
	
	
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
	
	
	// 3. 성적수정메소드 
	void score_modify() {
		System.out.println("[[ 성적수정 ]]");
		System.out.println("수정할 학생의 이름을 입력하세요.>>");
		name = scan.next();
		
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).name)) {
				System.out.printf("%s의 학생이 검색되었습니다. \n",name);
				checkNo = i;  // 학생이 검색되었을때 번호를 저장해둠.
				flag = 1;     // 학생 검색시 확인
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("해당학생이 없습니다. 다시 검색해주세요.!!");
			return;
		}//if
		
		flag = 0; //검색 리셋
		
		modify_print(checkNo); // 점수수정부분 - 메소드분리
		
	}//성적수정
	
	
	// 3. 성적수정메소드 - 점수수정부분메소드
	void modify_print(int checkNo) {
		System.out.println("[[[ 점수수정 ]]]");
		System.out.println("1. 국어점수수정");
		System.out.println("2. 영어점수수정");
		System.out.println("3. 수학점수수정");
		System.out.println("0. 수정취소");
		System.out.println("-------------------------");
		System.out.println("수정할 과목을 선택하세요.>>");
		choice = scan.nextInt();
		
	    switch(choice) {
	    case 1: //국어
	    	System.out.println("현재 국어점수 : " + list.get(checkNo).kor);
	    	System.out.println("수정할 국어점수를 입력하세요.>>");
	    	list.get(checkNo).kor = scan.nextInt(); //변수에 직접수정
	    	System.out.printf("국어점수가 %d 로 수정되었습니다. \n",list.get(checkNo).kor);
	    	System.out.println();
	    	break;
	    	
	    case 2: //영어
	    	System.out.println("현재 영어점수 : " + list.get(checkNo).eng);
	    	System.out.println("수정할 영어점수를 입력하세요.>>");
	    	list.get(checkNo).eng = scan.nextInt(); //변수에 직접수정
	    	System.out.printf("영어점수가 %d 로 수정되었습니다. \n",list.get(checkNo).eng);
	    	System.out.println();
	    	break;
	    
	    case 3: //수학	
	    	System.out.println("현재 수학점수 : " + list.get(checkNo).math);
	    	System.out.println("수정할 수학점수를 입력하세요.>>");
	    	list.get(checkNo).math = scan.nextInt(); //변수에 직접수정
	    	System.out.printf("수학점수가 %d 로 수정되었습니다. \n",list.get(checkNo).math);
	    	System.out.println();
	    	break;
	    	
	    }//switch
	    
	    list.get(checkNo).total = list.get(checkNo).kor + list.get(checkNo).eng + list.get(checkNo).math;
	    list.get(checkNo).avg = list.get(checkNo).total/3.0;
	    
	}//modify_print
	
	
	

}//class

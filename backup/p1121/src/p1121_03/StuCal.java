package p1121_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StuCal {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>(); //list 자동10개 생성
//	Student[] s = new Student[10];
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNum,name,checkName,data;
	String[] temp;
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
		System.out.println("6. 성적정렬선택");
		System.out.println("7. 파일불러오기");
		System.out.println("8. 파일저장하기");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();
		
		return choice;
	}//screen_print
	
	// 8. 파일저장하기메소드
	void save_file() throws Exception{
		System.out.println("[[ 파일저장하기 ]]");
		FileWriter fw = new FileWriter("c:/list.txt");
		for(int i=0;i<list.size();i++) {
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n",list.get(i).stuNum,
					list.get(i).name,list.get(i).kor,list.get(i).eng,list.get(i).math,
					list.get(i).total,list.get(i).avg,list.get(i).rank);
			fw.write(data);
		}
		fw.close();
		
		System.out.println("데이터를 파일에 저장했습니다.!!");
		System.out.println();
		
	}//save_file
	
	
	// 7. 파일불러오기메소드
	void open_file() throws Exception {
		System.out.println("[[ 파일불러오기 ]]");
		BufferedReader br = new BufferedReader(new FileReader("c:/list.txt"));
		while(true) {
			data = br.readLine();
			if(data==null) break;
			temp = data.split(","); //split : 데이터를 ,로 분리해서 배열로 리턴메소드 
			//list에 데이터 추가 
			list.add(new Student(temp[0],temp[1],Integer.parseInt(temp[2]),
					Integer.parseInt(temp[3]),Integer.parseInt(temp[4]),
					Integer.parseInt(temp[5]),Double.parseDouble(temp[6]),
					Integer.parseInt(temp[7])));
		}
		br.close(); //파일닫기
		
		Student.count = list.size();
		
		System.out.println("파일에서 데이터 불러오기 성공!!");
		System.out.println();
		
	}//open_file
	
	
	// 1. 성적입력메소드
	void score_input() {
		while(true) {
			System.out.println("[[ 성적입력 ]]");
			System.out.printf("%d 번째 이름을 입력하세요.(0.이전페이지 이동)>> \n",(list.size()+1));
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
	    case 0:
	    	System.out.println("점수수정을 취소하였습니다.!!");
	    	return; //메소드 종료
	    	
	    }//switch
	    
	    list.get(checkNo).total = list.get(checkNo).kor + list.get(checkNo).eng + list.get(checkNo).math;
	    list.get(checkNo).avg = list.get(checkNo).total/3.0;
	    
	}//modify_print
	
	// 4. 학생검색메소드
	void stu_search() {
		System.out.println("[[ 학생 검색 ]]");
		System.out.println("검색하고자 하는 학생이름을 입력하세요.>>");
		scan.nextLine(); //enter키 제거목적
		name = scan.nextLine();
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------------");
		count=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).name.contains(name)) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						list.get(i).stuNum,list.get(i).name,list.get(i).kor,
						list.get(i).eng,list.get(i).math,list.get(i).total,list.get(i).avg,
						list.get(i).rank);
				count++;
			}//if
		}//for
		System.out.printf("찾고자 하는 학생 [ %d ]명이 검색되었습니다.! ",count);
		System.out.println();
		
	}// stu_search
	
	// 5.등수처리메소드
	void score_rank() {
		System.out.println("[[ 등수처리 ]]");
		for(int i=0;i<list.size();i++) {
			count=1; //등수체크
			for(int j=0;j<list.size();j++) {
				if(list.get(i).total<list.get(j).total) {
					count++;
				}
			}
			list.get(i).rank = count; //등수 입력
		}//for
		
		System.out.println("등수처리가 완료되었습니다.!!");
		System.out.println();
		
	}//score_rank
	
	// 6. 이름정렬메소드
	void name_sort() {
		System.out.println("[[[ 성적정렬선택 ]]]");
		System.out.println("1. 번호순차정렬");
		System.out.println("2. 번호역순정렬");
		System.out.println("3. 이름순차정렬");
		System.out.println("4. 이름역순정렬");
		System.out.println("5. 점수순차정렬");
		System.out.println("6. 점수역순정렬");
		System.out.println("0. 취소");
		System.out.println("-------------------------");
		System.out.println("정렬 방법을 선택하세요.>>");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(list,new StudentStuNum());
			System.out.println("번호 순차정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 2:
			Collections.sort(list,new StudentStuNum().reversed());
			System.out.println("번호 역순정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 3:
			Collections.sort(list,new StudentName());
			System.out.println("이름 순차정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 4:
			Collections.sort(list,new StudentName().reversed());
			System.out.println("이름 역순정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 5:
			Collections.sort(list,new StudentTotal());
			System.out.println("점수 순차정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 6:
			Collections.sort(list,new StudentTotal().reversed());
			System.out.println("점수 역순정렬이 완료되었습니다.!!");
			System.out.println();
			break;
		case 0:
			System.out.println("정렬을 취소했습니다.!!");
			System.out.println();
			break;
		}//switch
		
	}//name_sort
	
	
	

}//class

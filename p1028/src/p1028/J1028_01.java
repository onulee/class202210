package p1028;

import java.util.Scanner;

public class J1028_01 {

	public static void main(String[] args) {
		
		//변수선언
		Scanner scan = new Scanner(System.in);
		int choice=0,score=0;
		int kor=0,eng=0,math=0,total=0;
		double avg = 0;
		String name="",grade="";
		
		//무한반복
		loop:
		while(true) {
			
			System.out.println("  [ 성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt(); //enter키  - next(),nextInt(),nextDouble()
			scan.nextLine();
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println("[[ 성적입력 ]]");
				System.out.println();
				
				//성적입력부분
				System.out.println("이름을 입력하세요.>>");
				name = scan.nextLine();
				System.out.println("국어점수를 입력하세요.>>");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.>>");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.>>");
				math = scan.nextInt();
				total = kor+eng+math;
				avg = total/3.0;
				
				// 성적입력끝
				System.out.println("성적입력이 완료되었습니다.!!");
				System.out.println();
				break;
			case 2:
				System.out.println("[[ 성적출력 ]]");
				System.out.println();
				//출력부분
				System.out.println("              [ 성적처리 프로그램 ]  ");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------------------------");
				//  홍길동 100 100 100 300 100.0 A
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
				//출력부분 끝
				
				break;
			case 3: //성적수정
				System.out.println("[[ 성적수정 ]]");
				System.out.println("1. 국어점수 수정");
				System.out.println("2. 영어점수 수정");
				System.out.println("3. 수학점수 수정");
				System.out.println("0. 이전화면으로 이동");
				System.out.println("---------------------");
				System.out.println("원하는 번호를 선택하세요.>>");
				choice = scan.nextInt();
				if(choice==1) {
					System.out.println("현재 국어점수 : "+kor);
					System.out.println("변경할 점수를 입력하세요.>>");
					kor = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println("변경 국어점수 : "+kor);
				}else if(choice==2) {
					System.out.println("현재 영어점수 : "+eng);
					System.out.println("변경할 점수를 입력하세요.>>");
					eng = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println("변경 영어점수 : "+eng);
					
				}else if(choice==3) {
					System.out.println("현재 수학점수 : "+math);
					System.out.println("변경할 점수를 입력하세요.>>");
					math = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println("변경 수학점수 : "+math);
				}else if(choice==0) {
					System.out.println("이전페이지로 이동합니다.!!");
					System.out.println();
					break;
				}

				System.out.println("점수가 변경되었습니다.!");
				System.out.println();
				break;
				
			case 0: //종료
				System.out.println("[[ 프로그램 종료 ]]");
				System.out.println();
				break loop;
				
			}//switch
			
		}//while
		
	}//main

}//class

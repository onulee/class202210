package p1027;

import java.util.Scanner;

public class J1027_06_성적처리 {

	public static void main(String[] args) {
		
		//변수선언
		Scanner scan = new Scanner(System.in);
		int choice=0;
		int kor=0,eng=0,math=0,total=0;
		double avg = 0;
		String name="",grade="";
		
		
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

			// 학점비교
			if(avg>=90) {
				grade="A";
				if(avg>=98) {
					grade = grade +"+";   //  grade += "+";  A+  ""+7+7 = "77"  7+"+" = "7+"
				}else if(avg<=92) {
					grade = grade +"-";   // A-
				}
			}else if(avg>=80) {
				grade="B";
				if(avg>=88) {
					grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
				}else if(avg<=82) {
					grade = grade +"-";   // A-
				}
			}else if(avg>=70) {
				grade="C";
				if(avg>=78) {
					grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
				}else if(avg<=72) {
					grade = grade +"-";   // A-
				}
			}else if(avg>=60) {
				grade="D";
				if(avg>=68) {
					grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
				}else if(avg<=62) {
					grade = grade +"-";   // A-
				}
			}else {
				grade="F";
			}//if
			// 성적입력끝
			
			break;
		case 2:
			System.out.println("[[ 성적출력 ]]");
			System.out.println();
			//출력부분
			System.out.println("              [ 성적처리 프로그램 ]  ");
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t학점");
			System.out.println("----------------------------------------------------");
			//  홍길동 100 100 100 300 100.0 A
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",name,kor,eng,math,total,avg,grade);
			//출력부분 끝
			
			break;
		case 3:
			break;
			
		}//switch
		
		
		
		
		
		
		

	}//main

}//class

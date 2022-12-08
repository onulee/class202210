package p1026;

import java.util.Scanner;

public class J1026_성적처리 {

	public static void main(String[] args) {
		// 이름,국어,영어,수학 점수를 입력받아 이름,국어,영어,수학,합계,평균,학점A+,A,A- 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>>");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		int math = scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;

		// 학점비교
		String grade ="";
		double score = avg;
		if(score>=90) {
			grade="A";
			if(score>=98) {
				grade = grade +"+";   //  grade += "+";  A+  ""+7+7 = "77"  7+"+" = "7+"
			}else if(score<=92) {
				grade = grade +"-";   // A-
			}
		}else if(score>=80) {
			grade="B";
			if(score>=88) {
				grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
			}else if(score<=82) {
				grade = grade +"-";   // A-
			}
		}else if(score>=70) {
			grade="C";
			if(score>=78) {
				grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
			}else if(score<=72) {
				grade = grade +"-";   // A-
			}
		}else if(score>=60) {
			grade="D";
			if(score>=68) {
				grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
			}else if(score<=62) {
				grade = grade +"-";   // A-
			}
		}else {
			grade="F";
		}
		
		//출력부분
		System.out.println("              [ 성적처리 프로그램 ]  ");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t학점");
		System.out.println("----------------------------------------------------");
		//  홍길동 100 100 100 300 100.0 A
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",name,kor,eng,math,total,avg,grade);




	}

}

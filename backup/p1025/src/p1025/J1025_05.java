package p1025;

import java.util.Scanner;

public class J1025_05 {

	public static void main(String[] args) {
		// 이름,국어,영어,수학을 입력받아 이름,국어,영어,수학,합계,평균을 출력하시오.
		//입력부분
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
		
		System.out.println("이름을 입력하세요.>>");
		String name2 = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		int kor2 = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		int eng2 = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		int math2 = scan.nextInt();
		int total2 = kor2+eng2+math2;
		double avg2 = total2/3.0;
		
		//출력부분
		System.out.println("   [ 학생성적처리 프로그램 ]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name,kor,eng,math,total,avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name2,kor2,eng2,math2,total2,avg2);

	}

}

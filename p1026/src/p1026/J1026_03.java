package p1026;

import java.util.Scanner;

public class J1026_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 국어점수,영어점수,수학점수 입력받아 평균을 이용해서 학점을 출력하시오.
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		int score = (int)avg;
		
		if(score>=90) {
			System.out.println("학점 : A");
		}else if(score>=80) {
			System.out.println("학점 : B");
		}else if(score>=70) {
			System.out.println("학점 : C");
		}else if(score>=60) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}

	}

}

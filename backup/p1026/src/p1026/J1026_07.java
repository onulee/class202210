package p1026;

import java.util.Scanner;

public class J1026_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = "";
		System.out.println("점수를 입력하세요.");
		int score=scan.nextInt();   //100,99,98 A+, 97,96,95,94,93 A, 92,91,90 A-
		
		if(score>=90) {
			grade="A";
			if(score>=98) {
				grade = grade +"+";   // A+  ""+7+7 = "77"      7+"+" = "7+"
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
		
		System.out.printf("학점 : %s", grade);

	}//main

}//class

package p1108;

import java.util.Scanner;

public class StuMethod {
	Scanner scan = new Scanner(System.in);
	
	Student input(Student s) {
		System.out.println("이름을 입력하세요.>>");
		s.name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		s.kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		s.eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		s.math = scan.nextInt();
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		return s;
		
	}
	

}

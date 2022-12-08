package p1109;

import java.util.Scanner;

public class J1109_07 {

	public static void main(String[] args) {
		
		// 숫자1개를 입력받아 출력하는 프로그램
		
		// 메소드호출
		// 결과값 출력
		Scanner scan =  new Scanner(System.in);
		//객체선언
		Method1 m = new Method1();
		int num =  m.input();
		int num2 =  m.input();
		int num3 =  m.input();
		int num4 =  m.input();
		
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int num3 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int num4 = scan.nextInt();
		
		System.out.println(num+num2+num3+num4);
		
		
		
		
		
		
//		Method1 m = new Method1(); //객체선언
//		int num = 0;
//		int[] j=new int[6];
//		
//		j = m.sum();
//		
//		
//		// 6개의 합을 출력하시오.
//		for(int i=0;i<6;i++) {
//			System.out.println("랜덤숫자 : "+ j[i]);
//			
//		}
		
		
		
//		num = m.random();
//		System.out.println("랜덤숫자 : "+num);
		

	}

}

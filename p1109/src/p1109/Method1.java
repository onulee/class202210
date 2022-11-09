package p1109;

import java.util.Scanner;

public class Method1 {
	
	
	// 메소드정의 - 숫자1개 입력받는 메소드
	int input() {
		Scanner scan = new Scanner(System.in);
		int num=0;
		
		System.out.println("숫자를 입력하세요.>>");
		num = scan.nextInt();
		
		return num;
		
	}
	
	
	
	
	// 6개를 랜덤숫자를 뽑고 
	// 숫자 6개의 합을 리턴하는 메소드 구현
	// 랜덤숫자 6개를 main에서 출력하시오.
//	int[] sum() {
//		
//		int num = 0;
//		int[] j = new int[6];
//		for(int i=0;i<6;i++) {
//			j[i] = (int)(Math.random()*45)+1;
//			num = num + j[i];
//		}
//		
//		return j;
//	}
	
	
	
	
	
	
	//랜덤이 되는 메소드 1-45
//	int random() {
//		int num = (int)(Math.random()*45)+1;
//		return num;
//	}

}

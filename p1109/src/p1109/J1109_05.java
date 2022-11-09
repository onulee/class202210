package p1109;

import java.util.Scanner;

public class J1109_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SumCal sum = new SumCal();
		int input1=0,input2=0;
		int result=0;
		
		// 1. 숫자 2개 입력
		System.out.println("숫자를 입력하세요.>>");
		input1 = scan.nextInt();
		System.out.println("숫자를 입력하세요.>>");
		input2 = scan.nextInt();
		
		// 메소드 호출 - input1,input2 매개변수
		result = sum.sum(input1, input2);
		
		System.out.println("합계 : "+result);

	}

}

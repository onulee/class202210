package p1108;

import java.util.Scanner;

public class J1108_09 {

	public static void main(String[] args) {
		// 두수를 입력받아 두수의 더하기,빼기,곱하기를 해서 출력하시오.
		// 두수 입력
		int[] result = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		Cal2 c2 = new Cal2();
		c2.cal(a, b, result);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);

	}

}

class Cal2{
	void cal(int a,int b,int[] result) {
		result[0] = a + b;
		result[1] = a - b;
		result[2] = a * b;
		
	}
}

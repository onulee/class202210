package p1031;

import java.util.Scanner;

public class J1031_01 {

	public static void main(String[] args) {
		//두수를 입력받아 작은수,큰수로 출력을 하시오.
		int a = 0;
		int b = 0;
		int temp = 0;
		int temp2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>>");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		//round(),ceil(),floor(),max(),min()
		temp = Math.min(a, b); //최소값
		temp2 = Math.max(a, b); //최대값
		
		System.out.println("작은수 : "+ temp);
		System.out.println("큰수 : "+ temp2);

	}

}

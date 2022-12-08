package p1028;

import java.util.Scanner;

public class J1028_10 {

	public static void main(String[] args) {
		// 입력한 구구단부터 출력을 하시오.
		// 5를 입력하면 5단~9단만 출력되도록 하시오.
		// 3,7을 넣으면 3단~7단까지 출력되도록 하시오.
		
		int a = 0;
		int b = 0;
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("시작하는 단을 입력하세요.>>");
		a = scan.nextInt();
		System.out.println("끝나는 단을 입력하세요.>>");
		b = scan.nextInt();
		
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i=a;i<=b;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}
		

	}

}

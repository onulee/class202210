package p1025;

import java.util.Scanner;

public class J1025_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 앞자리 2자리를 입력하세요.>>");
		// 220101-1111111 -> 100
		int a = scan.nextInt();
		int result = 122-a; 
		if(result>=18) {
			System.out.printf("나이:%d, 성인입니다.\n",result);
		}else {
			System.out.println("미성년자입니다.");
		}
		
		
//		int share = 10/8;
//		int remain = 10%8;
//		System.out.println(share);
//		System.out.println(remain);
		
		

	}

}

package p1025;

import java.util.Scanner;

public class J1025_07 {

	public static void main(String[] args) {
		
		// 실수입력받아 소수점2자리에서 반올림하시오. 첫째자리까지 출력
		Scanner scan = new Scanner(System.in);
		// 
		System.out.println("숫자를 입력하세요."); //12.56789
		double a = scan.nextDouble();
	    System.out.println("반올림 하고 싶은 자리를 입력하세요.");
	    // 2-> 2째자리에서 반올림, 3 -> 3째자리에서 반올림
	    // num 
	    int num = scan.nextInt(); //3 -> 12.57
	    double b = Math.pow(10, num-1); //10*10*10 10의3승
	    
		System.out.println(Math.round(a*b)/b);  //올림
		
//		System.out.println(Math.round(12.56874*1000)/1000.0);
//		
//		System.out.println(Math.ceil(12.1));  //올림
//		System.out.println(Math.round(12.1));  //반올림
//		System.out.println(Math.floor(12.1));  //버림
//		
//		double a = 25.687945;
//		//4자리에서 반올림,올림,내림
//		System.out.println(Math.ceil(a*1000)/1000.0);  //올림
//		System.out.println(Math.round(a*1000)/1000.0);  //반올림
//		System.out.println(Math.floor(a*1000)/1000.0);  //버림
		
		
		
		
//		int a = 1000000;
//		int b = 1000000;
//		// a+b,a-b,a*b,a/b을 출력하시오.
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println((double)a*b);
//		System.out.println(a/b);

	}

}

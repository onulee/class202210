package p1024;

import java.util.Scanner;

public class J1024_04 {

	public static void main(String[] args) {
		
		// 소수점 3자리에서 반올림을 해서 출력하시오.
		// Math.round()  1.75478
		double num = 1.75478;  // 
		// num*10 = 17.5478
		// Math.round(num*10) = 18
		// Math.round(num*10)/10.0 = 1.8
		System.out.println(Math.round(num*10)/10.0);
		
		// 5째 자리에서 반올림해서 출력하시오. 
		System.out.println(Math.round(num*10000)/10000.0);
		
		// Math.round():반올림, Math.floor():버림, Math.ceil():올림
		Scanner scan = new Scanner(System.in);
//		double num2 = 45.789456;
		double num2 = scan.nextDouble();
		//3자리 반올림
		//4자리 올림
		//5자리 버림 Math함수를 사용해서 출력하시오.
		System.out.println(Math.round(num2*100)/100.0);
		System.out.println(Math.ceil(num2*1000)/1000.0);
		System.out.println(Math.floor(num2*10000)/10000.0);
		System.out.println((int)(num2*10000)/10000.0);
		
		
		
		
		// 소수점 5자리까지 표현해서 출력하시오.
//		double num = 3.457895;
//		System.out.println((int)(num*100000)/100000.0);
		
		
		
		
		
		
		
//		// 소수점 3자리까지 표현해서 출력하시오.
//		double num2 = 102.145789;
//		System.out.println((int)(num*1000)/1000.0);
		
		
		
		
		
//		// 소수점 3자리이하 절사하시오.
//		double pi = 3.141592;  // 3.141
////		pi*1000/1000;
////		pi*1000; //3141.592;
////		(int)(pi*1000); //3141
//		double result = (int)(pi*1000)/1000.0; //3.141
//		System.out.println(result);

	}

}

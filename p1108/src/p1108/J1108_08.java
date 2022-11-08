package p1108;

import java.util.Scanner;

public class J1108_08 {

	public static void main(String[] args) {
		// 두수를 더하기 하는 메소드 선언
		int[] result = new int[3];  //result
		Cal cal = new Cal();
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]); //0 0 0 
		}
		cal.c(result);
		
		System.out.println("--------------------------");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]); // 
		}
		
	}//main
}//class

class Cal {
	void c(int[] result) {
		result[0]=100;
		result[1]=200;
		result[2]=300;
	}
}

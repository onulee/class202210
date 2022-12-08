package p1028;

import java.util.Scanner;

public class J1028_04 {

	public static void main(String[] args) {

		//1-100 랜덤숫자
		int input=0;
		int r_num=0;
		Scanner scan = new Scanner(System.in);
		r_num = (int)(Math.random()*100)+1;
//		System.out.println("랜덤숫자 : "+r_num);
		for(int i=1;i<=10;i++) { //0,1,2,3,4,5,6,7,8,9
			System.out.println(i+"번째 도전!! 1-100까지 숫자를 맞추시오.");
			input = scan.nextInt(); //입력
			
			if(r_num==input) { //비교확인
				System.out.println("정답입니다.");
				break;
			}else if(r_num>input) { // 75> 50
				System.out.println("오답입니다. 입력한 숫자보다 더 큽니다.");
			}else { //r_num<input 75<90
				System.out.println("오답입니다. 입력한 숫자보다 더 작습니다.");
			}//if
			
			
			
		}//for
		
		System.out.println("정답랜덤숫자 : "+r_num);
		
		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				for(int k=1;k<=3;k++) {
//					System.out.println(""+i+j+k);
//				}
//			}
//		}

	}//main

}//class

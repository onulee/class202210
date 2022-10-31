package p1031;

public class J1031_07 {

	public static void main(String[] args) {
		
		int[] score = {1,2,3,4,5,6,7,8,9,10};
		
		//단순for문 - 배열만 가능
		for(int i : score) {
			System.out.println(i);
		}
		
		//기본for문
//		for(int i=0;i<10;i++) {
//			System.out.println(score[i]);
//		}
		
//		// 1-100까지 숫자를 입력한 score배열을 생성해서 0-4까지의 5개 배열값을 출력하시오.
//		int[] score = new int[100];
//		for(int i=0;i<100;i++) {
//			score[i] = i+1;
//		}
//		
//		// 배열 섞기
//		int temp = 0;
//		int r_num = 0;
//		for(int i=0;i<1000;i++) {
//			r_num = (int)(Math.random()*100);
//			temp = score[0];
//			score[0] = score[r_num];
//			score[r_num] = temp;
//		}
//		
//		// 배열 100개 출력
//		for(int i=0;i<100;i++) {
//			System.out.printf("%d ",score[i]);
//		}
//		System.out.println();

	}//main

}//class

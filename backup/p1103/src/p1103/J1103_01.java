package p1103;

import java.util.Arrays;

public class J1103_01 {

	public static void main(String[] args) {
		int[] score = { 79,88,91,33,100,55,95 };
		int[] n_score = new int[score.length];
		Integer[] score2 = { 79,88,91,33,100,55,95 };
		int max = score[0];
		int min = score[0];
		System.out.println(Arrays.toString(score));
		System.out.println("----------------------");
		
		//순차정렬-객체
		Arrays.sort(score);  //순차정렬 됨. 1,2,3,4,5,.... 역순정렬 100,99,98,97...
		System.out.println("순차정렬 : "+Arrays.toString(score));
		//33, 55, 79, 88, 91, 95, 100
		
		//역순정렬
		for(int i=0;i<7;i++) {
			n_score[7-1-i] = score[i];
		}
		System.out.println("역순정렬 : "+Arrays.toString(n_score));
		
		
		
		
//		Arrays.sort(score2,new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1; //양수가 되면 자리바꿈
//			}
//		
//		});
		
//		System.out.println(Arrays.toString(score2));
		
		//최대값,최소값 구하는 식
//		for(int i=0;i<score.length;i++) { //최대값
//			if(max<score[i]) {
//				max = score[i];
//			}
//			
//			if(min>score[i]) { //최소값
//				min = score[i];
//			}
//			
//		}//for
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}

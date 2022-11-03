package p1103;

public class J1103_03 {

	public static void main(String[] args) {
		int[] score = new int[100];
		int[] score2 = new int[100];
		
		// 1-100까지 숫자를 score배열에 넣으시오.
		for(int i=0;i<100;i++) {
			score[i] = i+1;
		}
		
		// score들어가 있는 숫자를 역순으로 score2배열에 넣으시오.
		for(int i=0;i<100;i++) {
			score2[100-1-i] = score[i];
		}
		
		for(int i=0;i<100;i++) {
			System.out.println(score2[i]);
		}
		
		

	}

}

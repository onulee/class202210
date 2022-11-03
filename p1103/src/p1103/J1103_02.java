package p1103;

public class J1103_02 {

	public static void main(String[] args) {
		int[] score = {100,67,55,89,24,10,70};
		int[] score2 = new int[10];
		//score -> score2 복사하시오.
		for(int i=0;i<7;i++) {
			score2[i] = score[i];
		}
		
		// 출력
		for(int i=0;i<10;i++) {
			System.out.println(score2[i]);
		}

	}

}

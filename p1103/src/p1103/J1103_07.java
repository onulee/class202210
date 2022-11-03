package p1103;

public class J1103_07 {

	public static void main(String[] args) {
		// 변수선언
		int[] num = new int[25];
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		
		// num배열에 번호넣기
		// 0-20개, 1-5개
		for(int i=0;i<num.length;i++) {
			if(i<20) {
				num[i] = 0;
			}else {
				num[i] = 1;
			}//if
//			num[i] = i+1; //1-25까지 순서대로 숫자넣기
		}//for
		
		//번호섞기
		int temp = 0;
		int r_num = 0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}//for
		
		//score배열에 num배열 번호넣기
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = num[5*i+j];
				score2[i][j] = "♥";
			}
		}//for
		
		//무한반복 시작 ---->
		
		//score배열 출력
		System.out.println("               [ 숫자 확인 ]");
		System.out.printf("0|\t0\t1\t2\t3\t4\n");
		System.out.println("----------------------------------------------");
		for(int i=0;i<score.length;i++) {
			//앞쪽 좌표표시
			System.out.printf("%d|\t",i);
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d\t",score[i][j]);
			}//for
			System.out.println();
		}//for
		
		//-----------------------------------------------------------
		System.out.println();
		// 하트 화면표시
		System.out.println("               [ 화트 표시 ]");
		System.out.printf("0|\t0\t1\t2\t3\t4\n");
		System.out.println("----------------------------------------------");
		for(int i=0;i<score.length;i++) {
			//앞쪽 좌표표시
			System.out.printf("%d|\t",i);
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%s\t",score2[i][j]);
			}//for
			System.out.println();
		}//for
		
		
		
		//무한반복 끝 ---->

	}//main

}//class

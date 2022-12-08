package p1103;

public class J1103_05 {

	public static void main(String[] args) {
		// 0-50개, 1-50개 입력해서 출력하시오.
		// 랜덤으로 섞어서 출력하시오. 500
		
		int[] num = new int[100]; // 0,0,0,0,0,0,0,.....1,1,1,1,1,1,1
		int[][] score = new int[10][10];
		for(int i=0;i<num.length;i++) {
			if(i<50) {
				num[i] = 0;
			}else {
				num[i] = 1;
			}//if
		}//for
		
		// 랜덤섞기
		int temp=0;
		int r_num=0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*100);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}//for
		
		//num배열 출력
//		for(int i=0;i<num.length;i++) {
//			System.out.printf("%d : %d \n",i+1,num[i]);
//		}//for
		
		// num배열을 score배열에 넣기
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				score[i][j] = num[10*i+j]; //0,1,2,3,4,5,6,7,8,9,10,11
			}
		}//for
		
		//score배열 출력
		System.out.println("0|\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<10;i++) {
			System.out.printf("%d|\t",i);
			for(int j=0;j<10;j++) {
				System.out.printf("%d\t",score[i][j]);
			}
		    System.out.println();
		}//for
		
		
		
		
		
		
	}//main

}//class

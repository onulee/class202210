package p1101;

public class J1101_02 {
	public static void main(String[] args) {
		int[][] score = new int[5][3];
		// 입력
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				score[i][j] = 3*i+j+1;  //1-15
			}
		}
		
		// 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		

	}
}

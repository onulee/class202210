package p1028;

public class J1028_03 {

	public static void main(String[] args) {
		
		// 구구단 퀴즈
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %d \t",j,i,i*j);
			}
			System.out.println();
		}
		
		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j%2==0) {
//					System.out.printf("%d * %d = %d \t",i,j,i*j);
//				}
//			}
//			System.out.println();
//		}

	}

}

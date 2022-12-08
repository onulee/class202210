package p1028;

public class J1028_02 {

	public static void main(String[] args) {
		
		// 1,3,5,7,9 홀수단만 출력하시오.
		for(int i=1;i<=9;i++) {
			if(i%2==1) {
				continue;  //1번 종료 , break:완전종료
			}
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			}
		}//for
		
		
		
		
		//구구단 
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n", i,j,i*j);
//			}
//		}//for

	}//main

}//class

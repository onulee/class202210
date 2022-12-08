package p1027;

public class J1027_07 {

	public static void main(String[] args) {
		
		// 1-100까지의 합을 출력하시오.
		// 1-100 홀수의 합, 회수를 출력하시오.
		// 1-100 까지의 합에서 sum이 100 넘어가는 시점의 i,sum을 출력하시오.
		int sum=0;
		int i=0;
		for(i=1;i<=100;i++) {
			sum = sum + i;
			if(sum>100) {  // 1,2,3,4,5,6,7,8,9,10...
				break;    // 1,3,6,10,15
			}
		}
		
		System.out.printf("i:%d, sum:%d \n",i,sum);
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		int count=0; //회수
//		for(i=1;i<=100;i++) {
//			if(i%7==0) {
//				sum = sum + i;
//				count++;
//			}
//		}
//		System.out.printf("count: %d, sum:%d \n",count,sum);
		
		
//		long sum=0;
//		int i=0;
//		for(i=1;i<=10;i++) {
//			sum = sum + i;
//		}
//		System.out.printf("i: %d, sum:%d \n",i,sum);
		
		
		
//		for(int i=2;i<=12;i++) {
//			System.out.println(i);
//		}

	}

}

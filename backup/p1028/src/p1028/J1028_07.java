package p1028;

public class J1028_07 {

	public static void main(String[] args) {
		
		//while() => sum 200넘는 시점의 i,sum을 출력하시오.
		// 홀수만 더해서 200넘는 시점을 i,sum을 출력하시오.
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			if(i%2==1) {
				if(sum>200) {
					break;
				}
				sum = sum + i;
			}
			i++;
		}
		
		System.out.printf("i:%d, sum:%d \n", i-2,sum);   //29,225
//		System.out.printf("i:%d, sum:%d \n", i-1-1,sum-(i-1)); //20,210
		
		
//		int sum=0;
//		int i=0;
//		
//		// 50을 넘기기 전의 i의 수와 합을 출력하시오.
//		
//		for(i=1;i<=100;i++) {
//			if(sum>50) {
//				break;
//			}
//			sum = sum + i;
//		}//for
//		System.out.println("i : "+(i-1-1)); //50을 넘는때 시점
//		System.out.println("sum : "+(sum-(i-1))); //50을 넘는 값
//		(55-11-1 = 43)   
//		(55-(11-1) = 45)		
	}

}

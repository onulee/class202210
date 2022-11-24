package p1123;

public class J1123_12 {

	public static void main(String[] args) {
		// 시작시간
		System.out.println("시작합니다.!!");
		long startTime = System.currentTimeMillis();
		
		double sum = 0;
		for(double i=0;i<21000000000L;i++) {
			sum += i; 
		}
		
		System.out.println("합계 : "+sum);
		
		// 끝나는 시간
		long endTime = System.currentTimeMillis();
		// 몇초 걸리는지 시간을 체크해서 출력
		long betweenTime = (endTime-startTime)/1000;
		
		System.out.println("계산하는데 걸리는 시간 : "+betweenTime);
		

	}

}

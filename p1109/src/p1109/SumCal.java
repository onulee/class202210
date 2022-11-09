package p1109;

public class SumCal {
	
	// 메소드 정의
	// 처음숫자부터 나중숫자까지 합을 구하는 메소드
	// sum
	int sum(int input1,int input2) {
		int result=0;
		
		for(int i=input1;i<=input2;i++) {
			result = result + i;
		}
		
		
		return result;
	}
	
	
	

}

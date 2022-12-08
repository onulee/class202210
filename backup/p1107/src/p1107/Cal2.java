package p1107;

public class Cal2 {
	
	// 넓이 구하는 계산식
	// 직사각형 rect : 가로*세로
	// 마름모 rhom : 대각선길이 * 대각선길이 / 2
	// 사다리꼴 trape : (밑변 + 윗변)/2 * 높이 
	int rect(int a,int b) {
		return a*b;
	}
	
	int rhom(int a,int b) {
		return a*b/2;
	}
	
	int trape(int a,int b,int c) {
		return (a+b)/2*c;
	}

	
	

}

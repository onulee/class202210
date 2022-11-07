package p1107;

public class J1107_04 {

	public static void main(String[] args) {
		// Tv 클래스 -> 3개의 객체를 생성후, channel t[0]=10,t[1]=11,t[2]=12
		// 1. 3개 객체배열 
		// 2. for문을 사용해서 channel값을 넣기
		// 3. for문을 사용해서 출력
		
		
		Tv[] t = new Tv[3]; //배열선언 - t[0],t[1],t[2]
		//객체변수 입력
		for(int i=0;i<t.length;i++) {
			t[i] = new Tv(); //객체선언
			t[i].channel = 10+i;
		}
		//객체변수 출력
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].channel);
		}
		
		

	}

}

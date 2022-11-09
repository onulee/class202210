package p1109;

public class J1109_04 {

	public static void main(String[] args) {
		Lotto lo = new Lotto();
		int[] input = new int[6];
		int count=0;
		
		// 로또 입력호출
		count = lo.lotto_input(count, input);
		
		
		
		//출력
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		System.out.println("입력 횟수 : "+count);

	}

}

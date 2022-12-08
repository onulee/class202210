package p1031;

public class J1031_06_lotto {

	public static void main(String[] args) {
		
		//45개 배열생성 후 숫자입력
		int[] lotto = new int[45];
		for(int i=0;i<45;i++) {
			lotto[i] = i+1;
		}
		
		// 로또섞기
		int temp=0;
		int r_num=0;
		for(int i=0;i<2000;i++) {
			r_num = (int)(Math.random()*45); //0-44까지 랜덤숫자
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
		
		// 로또 번호출력
		System.out.print("로또번호 6개 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		
	}//main

}//class

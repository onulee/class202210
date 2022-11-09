package p1109;

import java.util.Scanner;

public class J1109_06 {

	public static void main(String[] args) {
		// 로또맞추기 게임
		// 1. 45개 배열생성
		// 객체선언
		Lotto2 lo = new Lotto2();
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];        //당첨 로또번호
		int[] input = new int[6];         //내가 입력한 로또번호
		int[] l_no = new int[6];          //당첨된 번호
		int count=0;                      //입력한 횟수
		int num=0;                        //당첨개수
		
		// 2. 1-45까지 숫자 넣기
		lo.lotto_input(lotto);
		
		// 3. 랜덤숫자 섞기
		lo.lotto_shuffle(lotto);
				
		// 4. 6개 번호넣기
		lo.my_input(input);
		
		// 5. 당첨번호 6개의 숫자 출력
		lo.lotto_print(lotto);
		
		// 6. 자신 번호 6개 숫자출력
		lo.my_print(input);
		
		// 7. 당첨번호개수 확인
		num = lo.lotto_count(lotto, input, l_no);
		
		//8. 당첨번호개수, 번호출력
		lo.lotto_no(num, l_no);
		

	}

}

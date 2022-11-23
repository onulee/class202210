package p1123;

import java.util.Scanner;

public class J1123_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		// 1조000000 - 9조999999
		// 랜덤으로 숫자를 생성 (1-9랜덤숫자)조(0-999999)
		// 랜덤숫자를 생성해서 출력을 한번 해보세요.
		int ranNum = (int)(Math.random()*9)+1; //1-9
		System.out.println(ranNum);
//		int ranNum2 = (int)(Math.random()*1000000); //012345
		String ranNum3 =String.format("%06d",(int)(Math.random()*1000000)); //012345
		
		//9조999999
		// 6자리 -> 맞는 개수 : 1개
		// 숫자입력
		// 마지막 2개의 숫자만 입력을 해서 맞는 개수를 출력하시오.
		System.out.println("숫자 6자리를 입력하세요.>>");
		String input = scan.next();
		System.out.println("입력한 숫자 : "+input);
		System.out.printf("랜덤숫자 : %s \n",ranNum3);
		
		for(int i=0;i<6;i++) {
			if(input.charAt(i)==ranNum3.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("맞는 개수 : "+count);
		
//		System.out.printf("랜덤숫자 : %d조%s \n",ranNum,ranNum3);
		
		

	}

}

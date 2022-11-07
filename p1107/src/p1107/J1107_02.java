package p1107;

import java.util.Scanner;

public class J1107_02 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] hour = new int[3];
		int[] minute = new int[3];
		int[] second = new int[3];
		
		//시,분,초를 scan사용하여 입력한 다음, 출력하시오.
		// 12:20:35, 1:40:20, 3:15:59
		// 입력 : for문 사용
		for(int i=0;i<hour.length;i++) {
			System.out.println("시간을 입력을 입력하세요.");
			hour[i] = scan.nextInt();
			System.out.println("분을 입력을 입력하세요.");
			minute[i] = scan.nextInt();
			System.out.println("초를 입력을 입력하세요.");
			second[i] = scan.nextInt();
		}//for
		
		// 시간출력
		for(int i=0;i<hour.length;i++) {
			System.out.printf("%d:%d:%d\n",hour[i],minute[i],second[i]);
		}//for
		

	}

}

package p1122_04;

import java.util.Scanner;

public class J1122_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    Exception e = new Exception("고의로 발생!!");
		
		while(true) {
			System.out.println("[무한반복 프로그램]");
			System.out.println("1. 숫자맞추기");
			System.out.println("2. 예외발생");
			System.out.println("3. 예외 사용하지 않은 경우");
			System.out.println("4. 종료");
			System.out.println("원하는 번호를 선택하세요.>>");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				while(true) {
					System.out.println("숫자를 입력하세요.(0.상위메뉴 이동)>>");
					choice = scan.nextInt();
					if(choice==0) {
						System.out.println("상위메뉴 이동");
						break;
					}
					System.out.println("입력한 번호 : "+choice);
				}
				break;
				
			case 2: //try(O)
				System.out.println("try-catch문 사용");
				try {
					//db접속하는 프로그램 부분
					throw e;
//					System.out.println(0/0);
				}catch(Exception e1) {
					e.printStackTrace(); //예외발생에 대한 코드 출력
					System.out.println(e.getMessage());
					System.out.println("예외처리가 발생했습니다.");
				}
				
				System.out.println("예외가 발생해서 상위메뉴로 이동");
				break;
				
			case 3: //try(X)
				System.out.println("try-catch문 사용하지 않음");
				System.out.println(0/0);
				
			}
			
		}
		
		

	}

}

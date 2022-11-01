package p1101;

import java.util.Scanner;

public class J1101_10 {

	public static void main(String[] args) {
		//1. 변수선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total=new int[3];
		double[] avg = new double[3];
		String[] title= {"이름","국어","영어","수학","합계","평균"};
		int count=0;
		
		// 무한반복
		while(true) {
			// 화면출력
			System.out.println("  [ 성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			System.out.println();
			
			scoreLoop:
			switch(choice) {
			case 1: //성적입력
				
				System.out.println("[[ 성적입력 ]]");
				System.out.println((count+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)>>");
				name[count] = scan.next(); //count
				//이전페이지 비교
				if(name[count].equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;
				}//if
				
				//점수입력
				for(int i=0;i<3;i++) {
						System.out.printf("%s 점수를 입력하세요.(0.이전페이지 이동)>>\n",title[i+1]);
						score[count][i] = scan.nextInt();
						if(score[count][i]==0) {
							System.out.println("이전페이지로 이동합니다.");
							System.out.println();
							break scoreLoop;
						}
						total[count] += score[count][i];
				}//for
				
				avg[count] = total[count]/3.0;
				
				System.out.println("1명의 학생 성적입력이 완료되었습니다.!!");
				System.out.println();
			    count++; //등록학생 수
				break;
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				break;
			}//switch
			
			
		}//while
		

	}//main

}//class

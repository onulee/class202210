package p1102;

import java.util.Scanner;

public class J1102_01 {

	public static void main(String[] args) {
		//4.성적출력
		
		// 1.변수선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;  // switch선택
		String check=""; // 이전페이지 이동때 사용 
		int checkNo=0;   // 해당되는 수정학생번호
		int flag=0;      // 검색할때 사용
		int count = 0;   // 입력된 학생수
		String[] name=new String[10];
		int[] kor=new int[10];
		int[] eng=new int[10];
		int[] math=new int[10];
		int[] total=new int[10];
		double[] avg=new double[10];
		
		// 무한반복
		loop:
		while(true) {
			// 2.화면출력
			System.out.println("  [ 성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 선택하세요.>>");
			choice = scan.nextInt();
			
			// 2-1.번호선택
			switch(choice) {
			
			case 1: //3. 성적입력
				System.out.println("[[ 성적입력 ]]");
				// 성적입력에 대한 프로그램구성

				// 3번반복
				while(count<10) {
					System.out.println("이름을 입력하세요.(0.이전페이지 이동)>>");
					check = scan.next();
					if(check.equals("0")) {
						System.out.println("이전페이지 이동합니다!!");
						break;
					}//if
					name[count] = check;
					System.out.println("국어 점수를 입력하세요.>>");
					kor[count] = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.>>");
					eng[count] = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.>>");
					math[count] = scan.nextInt();
					total[count] = kor[count]+eng[count]+math[count];
					avg[count] = total[count]/3.0;
					System.out.println("성적입력이 완료되었습니다.!!");
					
					count++;
				}//while
				
				break;
				
			case 2: // 4.성적출력
				System.out.println("[[ 성적출력 ]]");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------------------------------");
				
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}//for
				break;
				
			case 3: // 5. 성적수정
				
				System.out.println("[[ 성적수정 ]]");
				//3명 들어가 있으면 홍길동-name[0],kor[0],eng[0],math[0],total[0],avg[0],유관순-name[1],이순신-name[2]
				System.out.println("수정할 학생을 입력하세요.>>");
				check = scan.next();
				//name배열 -> 10 -> count
				for(int i=0;i<count;i++) {
					if(check.equals(name[i])) {  // 해당되는 학생이 있을때
						checkNo = i;
						flag=1;
						System.out.println(name[i]+" 학생이 검색되었습니다.!!");
						break;
					}
				}//for
				
				// 해당되는 학생이 없을때
				if(flag==0) {
					System.out.println("해당되는 학생이 검색되지 않았습니다. 다시 검색하세요.!!");
					break;
				}//if
				
				
				//국어점수,영어점수,수학점수
				System.out.println("1.국어점수");
				System.out.println("2.영어점수");
				System.out.println("3.수학점수");
				System.out.println("0.취소");
				System.out.println("------------");
				System.out.println("수정할 과목을 선택하세요.>>");
				choice = scan.nextInt();
				flag=0; // 검색flag 리셋
				// 수정할 프로그램 구성
				switch(choice) {
				case 1: //국어점수수정
					System.out.printf("현재 국어점수 : %d \n",kor[checkNo]);
					System.out.println("수정할 국어점수 입력 : ");
					kor[checkNo] = scan.nextInt();
					total[checkNo] = kor[checkNo]+eng[checkNo]+math[checkNo];
					avg[checkNo] = total[checkNo]/3.0;
					System.out.printf("%d 점으로 국어점수가 변경되었습니다!!\n",kor[checkNo]);
					break;
				case 2: //영어점수수정
					System.out.printf("현재 영어점수 : %d \n",eng[checkNo]);
					System.out.println("수정할 영어점수 입력 : ");
					eng[checkNo] = scan.nextInt();
					total[checkNo] = kor[checkNo]+eng[checkNo]+math[checkNo];
					avg[checkNo] = total[checkNo]/3.0;
					System.out.printf("%d 점으로 영어점수가 변경되었습니다!!\n",eng[checkNo]);
					break;
					
				case 3:
					System.out.printf("현재 수학점수 : %d \n",math);
					System.out.println("수정할 수학점수 입력 : ");
					math[checkNo] = scan.nextInt();
					total[checkNo] = kor[checkNo]+eng[checkNo]+math[checkNo];
					avg[checkNo] = total[checkNo]/3.0;
					System.out.printf("%d 점으로 수학점수가 변경되었습니다!!\n",math[checkNo]);
					break;
				
				case 0: //취소
					System.out.println("점수수정이 취소되었습니다.!!");
					break;
				
				}//switch
				
				break; //switch
			case 0: // 종료
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			
			
			}//switch
			
		}//while

	}//main

}//class

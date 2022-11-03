package p1102;

import java.util.Scanner;

public class J1102_03_학생성적완료 {

	public static void main(String[] args) {
		
		// 변수선언
		Scanner scan = new Scanner(System.in);
		int choice = 0; //번호선택
		
		//데이터 변수선언 - 이름,국어,영어,수학,합계,평균
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[10];
		int[][] score = new int[10][3]; //10명,3과목
		int[] total = new int[10];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		int count = 0;   // 인원수
		int r_count = 0; //등수 카운트
		String check=""; //이전페이지 이동
		int checkNo=0;   //수정할 학생번호
		int flag=0;      //수정할 학생이 없을경우
		
		
		//무한반복
		loop:
		while(true) {
			//1. 화면출력
			System.out.println(" [ 성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			//번호선택
			switch(choice) {
			case 1: //성적입력
				System.out.println("[[ 성적입력 ]]");
				
				//10명 학생확인
				while(count<name.length) {
					//이름입력
					System.out.printf("%d번째 이름을 입력하세요.(0.이전페이지이동)>>\n",count+1);
					check = scan.next();
					if(check.equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break; //while
					}//if
					name[count] = check;
					
					//점수입력
					for(int i=0;i<3;i++) {
						System.out.printf("%s점수를 입력하세요.>>\n",title[i+1]);
						score[count][i] = scan.nextInt();
					}//for
					
					//합계,평균
					total[count] = score[count][0]+score[count][1]+score[count][2];
					avg[count] = total[count]/3.0;
					
					System.out.printf("%d명의 성적입력이 완료되었습니다.!!\n",count+1);
					count++; //인원수 1증가
				}//while
				
				break;
			case 2: //성적출력
				//상단title
				System.out.println("[[ 성적출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("---------------------------------------------------------");
				// 학생출력
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",name[i],score[i][0],score[i][1],score[i][2],total[i],avg[i],rank[i]);
				}//for
				break;
			case 3: //성적수정
				System.out.println("[[ 성적수정 ]]");
				System.out.println("수정할 학생의 이름을 입력하세요.>>");
				check = scan.next();
				// 해당학생 검색
				for(int i=0;i<count;i++) {
					if(check.equals(name[i])) {
						System.out.printf("%s의 학생이 검색되었습니다.!!",name[i]);
						System.out.println();
						checkNo = i;
						flag = 1; //있을경우
						break;
					}//if
				}//for
				
				// 해당학생이 없을경우
				if(flag==0) {
					System.out.println("해당학생 이름이 없습니다. 다시 확인하세요.!!");
					break;
				}//if
				
				flag=0; //학생검색 리셋
				
				//점수수정 화면출력
				System.out.printf("[ %s 의 학생성적수정 ]\n",name[checkNo]);
				System.out.println("1. 국어점수");
				System.out.println("2. 영어점수");
				System.out.println("3. 수학점수");
				System.out.println("0. 수정취소");
				System.out.println("---------------");
				System.out.println("수정할 과목을 선택하세요.>>");
				choice = scan.nextInt();
				
				//취소
				if(choice==0) {
					System.out.println("성적수정이 취소되었습니다.!!");
					System.out.println();
					break;
				}//if
				
				// 성적수정
				System.out.printf("현재 %s점수 : %d\n",title[choice],score[checkNo][choice-1]);
				System.out.printf("수정할 %s점수 입력 :\n",title[choice]);
				score[checkNo][choice-1] = scan.nextInt();
				//합계 = 국어 + 영어 + 수학
				total[checkNo] = score[checkNo][0]+score[checkNo][1]+score[checkNo][2];
				//평균 = 합계/3.0
				avg[checkNo] = total[checkNo]/3.0;
				
				System.out.printf("%s점수가 %d 점으로 변경되었습니다.!!\n",title[choice],score[checkNo][choice-1]);
				System.out.println();
				
				break; //번호선택 switch
				
			case 4: //등수처리
				System.out.println("[[ 등수처리 ]]");
				
				//등수처리 입력
				for(int i=0;i<count;i++) {
					r_count=1; //등수초기화
					for(int j=0;j<count;j++) {
						if(total[i]<total[j]) { //total[j]가 클때 1증가
							r_count++;
						}//if
					}//for
					rank[i] = r_count; //등수입력
				}//for
				
				System.out.println("등수처리가 완료되었습니다!!");
				System.out.println();
				break;
				
			case 0: //프로그램종료
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			}//번호선택 switch
			
		}//while
		
		System.out.println("프로그램이 완전 종료되었습니다.!!");

	}//main

}//class

package p1123;

import java.util.Scanner;

public class J1123_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String[] file = {"1.txt","aaa.txt","bbb.hwp","c.doc","d.doc","e.txt","f.hwp"};
		
		while(true) {
			count=0;
			System.out.println("찾고자 하는 파일 확장자명을 입력하세요.>>");
			String input = scan.next();
			for(int i=0;i<file.length;i++) {
				if(file[i].endsWith(input)) {
					System.out.printf("파일명 : %s \n",file[i]);
					count++;
				}
			}//for
			System.out.printf("찾고자 하는 파일 [ %d ] 개가 검색되었습니다. \n",count);
		}//while
		
		

	}//main

}//class

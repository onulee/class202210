package p1122_04;

import java.util.Scanner;

public class J1122_12 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String[] name = { "   홍 길동 ","홍 길자","홍길  순","이순 신","유 관순","김 구"," 김유신"};
		String[] file = { "a.txt","b.hwp","c.doc","d.txt","e.txt","f.psd","g.txt"};
		int count=0;
		
		
		for(int i=0;i<file.length;i++) {
			if(file[i].endsWith("doc")) {
				System.out.println(file[i]);
				count++;
			}
		}
		
		System.out.println("txt파일 개수 : "+count);
		
		
		
		
//		while(true) {
//			System.out.println("찾고자 하는 이름을 검색하세요.>>");
//			String search = scan.nextLine();
//			
//			System.out.println("[ 검색된 이름 ]");
//			for(int i=0;i<name.length;i++) {
//				if(name[i].contains(search)) {
//					System.out.println(name[i]);
//					flag=1;
//				}
//			}
//			if(flag==0) {
//				System.out.println("찾는 이름이 없습니다.!!");
//			}
//			
//			flag=0;
//		}

	}

}

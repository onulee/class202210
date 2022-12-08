package p1123;

import java.util.ArrayList;
import java.util.Scanner;

public class J1123_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count=0;
		String str = "안녕! 아침인사를 합니다. 안녕! 점심인사를 합니다. 안녕! 저녁인사를 합니다.";
		System.out.println(str);
		System.out.println();
		while(true) {
			count=0;
			list.removeAll(list);
			System.out.println("검색하려는 단어를 입력하세요.>>");
			String input = scan.next();
			// 검색된 위치와 개수를 출력하시오.
			int idx = str.indexOf(input);
			while(idx !=-1) {
				list.add(idx);
				idx = str.indexOf(input,idx+input.length()); //한번 검색된 다음부터 다시검색
				count++;
			}
			
			for(int i=0;i<list.size();i++) {
				System.out.printf("검색된 위치 : %d \n",list.get(i));
			}
			
			System.out.printf("검색된 개수 : %d \n",count);
			
		}
		
		
		
		
		
		
		
//		String str = "Hello! How are you?";
//		//            012345
//		String word = "o";
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int idx = str.indexOf(word);
//		
//		while(idx != -1) {
//			list.add(idx);
//			// 4 -> 4+1=5
//			idx = str.indexOf(word,idx+word.length());
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.printf("검색된 개수 : "+list.size());
			
		

	}

}

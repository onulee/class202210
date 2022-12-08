package p1026;

import java.util.Scanner;

public class J1026_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 영문자만 입력이 된다고 가정
		// 소문자는 대문자로 출력, 대문자는 소문자로 출력 하시오.
		System.out.println("영문자를 입력하세요.");
	    String input = scan.nextLine(); //영문자
	    char ch = input.charAt(0);
	    // 영문자만 입력됨
	    char result = ('a'<=ch && ch<='z')?(char)(ch-32):(char)(ch+32);
	    System.out.println(result);
	    
	    
//	    if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z') {
//	    	
//	    }else {
//	    	System.out.println("영문자만 입력이 가능합니다. 다시 입력하세요.");
//	    }
	    
//	    char ch = input.charAt(7);
//		String str = (ch=='1'||ch=='3')?"남자입니다.":(ch=='2'||ch=='4')?"여자입니다.":"잘못입력하셨습니다.";
//		System.out.println(str);
		
		// 880101-1111111, 880101-2111111 
		// 020101-3111111, 020101-4111111
		//주민번호를 입력을 받아서
		// 여자인지 남자인지 출력하시오. 여자입니다. 남자입니다.
//		System.out.println("주민번호를 입력하세요.");
//	    String input = scan.nextLine(); //880101-1111111
//	    char ch = input.charAt(7);
//		String str = (ch=='1'||ch=='3')?"남자입니다.":(ch=='2'||ch=='4')?"여자입니다.":"잘못입력하셨습니다.";
//		System.out.println(str);
		
		
		
		
		// 입력한 숫자가 2의 배수인지 아닌지 출력하시오. 2의배수입니다. 2의배수가 아닙니다.
//		System.out.println("숫자를 입력하세요.");
//	    int num=scan.nextInt();
//		String str = (num%2==0)?"2의배수입니다.":"2의 배수가 아닙니다.";
//		System.out.println(str);
		
		
		
		
		//입력한 숫자가 양수입니다. 0입니다. 음수입니다.인지 출력하시오.
//	    System.out.println("숫자를 입력하세요.");
//	    int num=scan.nextInt();
//		String str = (num>0)?"양수입니다.":(num==0)?"0입니다.":"음수입니다.";
//		System.out.println(str);
	    
	    
	    
	    
//	    System.out.println("숫자를 입력하세요.");
//	    int num=scan.nextInt();
//		String str = (num>=0)?"양수입니다.":"음수입니다.";
//		System.out.println(str);
		
		
//		int num=5;
//		String str = (num>=0)?"양수입니다.":"음수입니다.";
//		System.out.println(str);
		
//		int score = 50;
//		char grade = (score>=90) ? 'A' : ((score>=80)?'B':'C');
//		System.out.println(grade);
		
//		int x = 7;
//		int abs_x = (x>=0)?x:-x;
//		System.out.println(abs_x);
//		int a = -5;
//		System.out.println(Math.abs(a));
		
		
//		char ch = 'a';
//		char ch2 = '7';
//		System.out.println('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z');
//		System.out.println('0' <= ch2 && ch <= '9');

	}

}

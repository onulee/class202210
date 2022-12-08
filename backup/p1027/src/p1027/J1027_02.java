package p1027;

import java.util.Scanner;

public class J1027_02 {

	public static void main(String[] args) {
		
		// 타입변경
		// int => String :    7+""="7"  글자길이 확인 => String 길이 length()
		// String => int : Integer.parseInt()
		// 숫자char => int : 숫자char-'0'
		// String => char : charAt(0);
		
		char ch ='a'; //99 => int
		String str ="aaaaaaaaaaaa";
		
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String str1 = scan.next();
		String str2 = scan.next();
		
		// 두수의 합을 구하시오. boolean,char,byte,short,int,long,float,double
		
	    int a = Integer.parseInt(str1);
	    int b = Integer.parseInt(str2);
//	    int c = (int)str1; //에러
	    sum = a + b;
		
		System.out.println(sum);
		
		
		
		
//		String str="";
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.>>");
//		str = str+" "+scan.nextInt();   //" 100 200 300"
//		System.out.println("숫자를 입력하세요.>>");
//		str = str+" "+scan.nextInt();
//		System.out.println("숫자를 입력하세요.>>");
//		str += " "+ scan.nextInt();
//		System.out.println("숫자를 입력하세요.>>");
//		str += " "+ scan.nextInt();
//		System.out.println("숫자를 입력하세요.>>");
//		str += " " + scan.nextInt();
//		System.out.printf("%s\n",str);
		
		
		
		
//		int num7 = 0;
//		boolean b = true;  //false;
//		char c =97;  // '0'=>48, 'A'=>65, 'a'=>97
//		byte by = 1; //-128~127 + 1 = 
//		int i = 3;
//		long o = 2245684747L;
//		float f = 1.21f;
//		double d = 1.21;
//		
//		System.out.println(c);

	}//메소드1개
	
}

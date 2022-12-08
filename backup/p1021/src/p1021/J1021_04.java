package p1021;

public class J1021_04 {

	public static void main(String[] args) {
		char ch = 'A'; //65
		char ch2 = 'a'; //97
		char ch3 = '0'; //48
		String s1 = "ab";
		String s2 = "";
		String s3 = "a";
//		char ch4 = ''; //에러 : 아무것도 안넣으면 에러
		char ch5 = ' ';
		String s4 = "A" + "B";
		String s5 = "좋은"+"하루";
		// s4 AB
		System.out.println(s4);
		System.out.println(s5);
		String s6 = "1"+"2"+"3"+"4"+"5";
		System.out.println(s6);
		System.out.println("--------------------------");
		String s7 = ""+7;
		System.out.println(s7);
		String s8 = ""+7+7;   // ""+7="7"+7 = "77"
		System.out.println(s8);
		String s9 = 7+7+""+7;  // 14+"" = "14"
		System.out.println(s9);

	}

}

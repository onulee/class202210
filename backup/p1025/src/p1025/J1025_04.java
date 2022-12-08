package p1025;

public class J1025_04 {

	public static void main(String[] args) {
		System.out.println(10/3.0);
		// 지시자 - %s:String,%d:정수형,%f:실수형,%c:문자
		System.out.printf("%f\n",10/3.0);
		String name = "홍길동";
		int kor = 100;
		int eng = 100;
		int math = 99;
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("이름    국어    영어    수학    합계    평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s   %d   %d   %d   %d   %.1f\n",name,kor,eng,math,total,avg);
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name,kor,eng,math,total,avg);
//		System.out.println("국어:"+kor+", 영어:"+eng+", 수학:"+math+", 평균:"+avg);
		

	}

}

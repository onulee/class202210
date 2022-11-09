package p1109;

public class J1109_02 {

	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.name="홍길동";
		s1.kor = 100;
		s1.eng = 99;
		s1.total = s1.kor + s1.eng;
		s1.avg = s1.total/2.0;
		
		// 객체선언 3개매개변수 
		Stu s2 = new Stu("유관순",90,99);
		
		
		

	}

}

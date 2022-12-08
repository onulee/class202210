package p1109;

public class J1109_03 {

	public static void main(String[] args) {
		// 3명의 학생객체선언
		int count=0;
		StuMethod stu = new StuMethod();
		Stu[] s = new Stu[5]; //배열선언
		s[0] = new Stu("홍길동",100,99);
		s[1] = new Stu("유관순",90,99);
		s[2] = new Stu("이순신",99,98);
		count=3;
		// 출력
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\n",s[0].name,s[0].kor,s[0].eng,s[0].total,s[0].avg);
		
		// input메소드 호출 -> 결과값
		// 홍길동, 홍길순변경해서 출력해보세요.
		count = stu.input(count,s);
		System.out.println("인원수 : "+count);
		System.out.println("바뀐 이름 : "+s[0].name);

	}

}

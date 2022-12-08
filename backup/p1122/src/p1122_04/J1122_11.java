package p1122_04;

public class J1122_11 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",100,100,99);
		Student s2 = new Student(s1);
		
		if(s1.equals(s2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}

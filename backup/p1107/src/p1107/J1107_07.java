package p1107;

public class J1107_07 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.m = 10L; //인스턴스변수 사용방법 : 참조변수명.변수명
		
		long value = mm.add(1L, 2L); //메소드 사용방법 : 참조변수명.메소드명
		System.out.println(value);

	}

}

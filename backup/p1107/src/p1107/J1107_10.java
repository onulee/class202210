package p1107;

public class J1107_10 {

	public static void main(String[] args) {
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,99,88};
		int[] eng = {99,98,87};
		int[] total = new int[3];
		double[] avg = new double[3];
		Stu s = new Stu(); //객체선언
		
		for(int i=0;i<name.length;i++) {
			s.print(i, name[i],kor[i],eng[i]);  //메소드호출
		}//for
		
		

	}

}

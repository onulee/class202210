package p1122_02;

public class J1122_05 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		System.out.println(t1);
		t1.hitPoint -= 10; //10만큼 데미지를 줌.
		t1.hitPoint -= 10; //10만큼 데미지를 줌.
		t1.hitPoint -= 10; //10만큼 데미지를 줌.
		t1.hitPoint -= 10; //10만큼 데미지를 줌.
		System.out.println(t1);
		SCV s1 = new SCV();
		s1.repair(t1);
		System.out.println(t1);
		
		// 마린 생성
		Marine m1 = new Marine();
		System.out.println(m1);
		m1.hitPoint -= 10;
		m1.hitPoint -= 10;
		m1.hitPoint -= 10;
		System.out.println(m1);
//		s1.repair(m1); //프로그램 에러 - scv가 Marine클릭하면 경고메세지를 띄우면 됨.
		System.out.println(m1);
		

	}

}

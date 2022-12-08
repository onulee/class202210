package p1111;

public class Child extends Parent {
	//기본생성자 없음
	Child(){
		super();
	} //자동으로 구성
	
	int x = 20;
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

}

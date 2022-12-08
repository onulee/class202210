package p1122;

public class Marine extends Unit {
	void move(int x,int y) {
		System.out.printf("%d,%d로 이동합니다. \n",x,y);
	}
	void stimPack() {
		System.out.println("이동이 빨라집니다.");
	}

}

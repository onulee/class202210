package p1122;

public class Tank extends Unit {
	void move(int x,int y) {
		System.out.printf("%d,%d로 이동합니다. \n",x,y);
	}
	void changeMode() {
		System.out.println("사거리가 길어집니다.");
	}

}

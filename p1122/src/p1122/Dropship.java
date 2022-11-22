package p1122;

public class Dropship extends Unit{
	void move(int x,int y) {
		System.out.printf("%d,%d로 이동합니다. \n",x,y);
	}
	void load() {
		System.out.println("대상을 태웁니다.");
	}
	void unload() {
		System.out.println("대상을 내립니다.");
	}

}

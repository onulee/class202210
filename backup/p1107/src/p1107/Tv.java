package p1107;

public class Tv {
	String color;  //tv 색상
	boolean power; //전원
	int channel;   //채널
	
	//메소드
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}

}

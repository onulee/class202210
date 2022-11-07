package p1104;

public class Tv {
	//변수
	String color;   //null
	boolean power;  //false
	int channel;    //0
	int volume;
	
	//메소드
	void power() {
		power =!power; //true->false, false->true
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}

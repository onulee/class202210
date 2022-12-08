package p1122;

public abstract class Player {
	
	int currentPos;
	
	Player(){
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
	

}

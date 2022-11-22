package p1122_02;

public class Unit {
	int hitPoint;      //현재 체력
	final int MAX_HP;  //최대 체력 - 생성자에서 값이 꼭 들어가야 함.
	
	Unit(){ MAX_HP = 50; }
	
	//생성자 최대체력
	Unit(int hp){
		MAX_HP = hp; //생성자에서 상수에 값을 넣을수 있음.
	}

}

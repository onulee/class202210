package p1122_02;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	// 수선메소드 - GroundUnit
	void repair(Repairable g) {
		if( g instanceof Unit ) {
			Unit u = (Unit)g;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
		
	}

}

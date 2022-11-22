package p1122;

public class J1122_03 {

	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new Dropship();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(50, 50);
		}
				

	}

}

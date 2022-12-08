package p1122;

public class J1122_02 {

	public static void main(String[] args) {
		Marine[] m = new Marine[3];
		m[0] = new Marine();
		m[1] = new Marine();
		m[2] = new Marine();
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		Dropship d1 = new Dropship();
		
		for(int i=0;i<m.length;i++) {
			m[i] = new Marine();
			m[i].move(50, 50);
		}
		t1.move(50, 50);
		d1.move(50, 50);
		
		

	}

}

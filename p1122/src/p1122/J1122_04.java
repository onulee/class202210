package p1122;

public class J1122_04  {

	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		f1.move(50,50);
		
		Unit u1 = new Marine();
		f1.attack(u1);

	}

	

}

package p1122;

public class Fighter implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.printf("%d,%d 로 이동합니다. \n",x,y);

	}

	@Override
	public void attack(Unit u) {
		System.out.println("공격을 합니다.");

	}

}

package p1125;

import java.util.Comparator;

public class FruitName implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}

}

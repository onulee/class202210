package p1125;

import java.util.Comparator;

public class FruitPrice implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price<o2.price) {
			return -1;  //1:순차정렬 -1:역순정렬
		}else if(o1.price>o2.price) {
			return 1;
		}
		return 0; //같은경우
	}

}

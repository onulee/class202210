package p1125;

public class Fruit2 implements Comparable<Fruit2> {
	String name;
	int price;
	
	Fruit2(){ }
	Fruit2(String name,int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Fruit2 o) {
		if(o.price<price) {
			return -1; //순차정렬  -1:역순정렬
		}else if(o.price>price) {
			return 1;
		}
		return 0;
	}
}

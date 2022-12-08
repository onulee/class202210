package p1108;

public class J1108_13 {

	public static void main(String[] args) {
		//객체선언
		Data1 d1 = new Data1();
		d1.value=100;
		System.out.println(d1.value);
		
		Data3 d3 = new Data3(5);
		System.out.println(d3.value);

	}

}//class

class Data1{
	int value;
}

class Data3{
	int value;
	Data3(int x){
		value = x;
	}
}

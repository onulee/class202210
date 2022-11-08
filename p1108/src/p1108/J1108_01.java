package p1108;

public class J1108_01 {

	public static void main(String[] args) {
		
		Time[] t = new Time[10]; //배열선언
		t[0] = new Time(); //객체선언
		t[0].boardUser="류승택";
		t[0].hour = 12;
		t[0].minute = 20;
		t[0].second =59;
		t[0].print();
		
		t[1] = new Time(); //객체선언
		t[1].boardUser="고혁우";
		t[1].hour = 1;
		t[1].minute = 30;
		t[1].second = 30;
		System.out.printf("%s - %d:%d:%d \n",t[1].boardUser,t[1].hour,t[1].minute,t[1].second);

	}

}



package p1104;

import java.util.Scanner;

public class J1104_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.next();
		
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		System.out.println(t.channel);
		
		
	}

}

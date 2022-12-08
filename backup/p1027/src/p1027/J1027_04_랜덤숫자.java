package p1027;

public class J1027_04_랜덤숫자 {

	public static void main(String[] args) {
		
//		System.out.println(Math.random());  // 0.000000000000000 <= x < 1.0 0.9999999999999999
		
		// 0.0*10 <= x*10 < 1.0*10
		// 0.0    <=   x  < 10.0
		// 0      <=   x  < 10   0,1,2,3,4,5,6,7,8,9
		// 0+1    <=  x+1 < 10+1
		// 1      <=  x+1 < 11   1,2,3,4,5,6,7,8,9,10
		System.out.println( (int)(Math.random()*10)+1 );  //1-10
		System.out.println( (int)(Math.random()*10) );    //0-9
		System.out.println( (int)(Math.random()*45)+1 );  //1-45
		System.out.println( (int)(Math.random()*100)+1 ); //1-100
		System.out.println( (int)(Math.random()*2)+1 ); //1-2
		System.out.println( (int)(Math.random()*3)+1 ); //1-3
		

	}

}

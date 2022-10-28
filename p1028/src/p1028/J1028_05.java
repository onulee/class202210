package p1028;

public class J1028_05 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i;j++) { //1,2,3,4,5,6,7,8,9,10  -> 10,9,8,7,6,5,4,3,2,1
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

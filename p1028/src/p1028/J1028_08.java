package p1028;

public class J1028_08 {

	public static void main(String[] args) {
		
		//구구단
		loop:
		for(int i=2;i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				if(j%3==0) 
					continue;
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			}
		}
			
		
		
		// 
//		for(int i=0;i<=10;i++) {
//			if(i%3==0) 
//				continue;
//			System.out.println(i);
//			
//		}

	}

}

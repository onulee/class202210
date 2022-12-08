package p1107;

public class J1107_05 {

	public static void main(String[] args) {
		// 52장 - 1,2,3,4,5,6,7,8,9,10,J,Q,K 13장 
		// Heart,Clover,Spade,Diamond 4장  
		// 13 * 4 = 52장
		// 13장 카드를 만들어서, kind = Heart, number 1-13
		// 숫자를 넣고 출력하시오.
		
		// 26장 카드생성후 
		// kind = Heart,Clover,Spade,Diamond
		// 1,2,3,4,5,6,7,8,9,10,J,Q,K
		
		Card[] c = new Card[52]; //배열선언
		// 입력
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(); //객체선언
			if(i<13) {
				c[i].kind = "Heart";
			}else if(i<26) {
				c[i].kind = "Clover";
			}else if(i<39) {
				c[i].kind = "Spade";
			}else{
				c[i].kind = "Diamond";
			}
			if(i%13<10) {
				c[i].number = ""+(i%13+1);
			}else if(i%13==10) {
				c[i].number="J";
			}else if(i%13==11) {
				c[i].number="Q";
			}else if(i%13==12) {
				c[i].number="K";
			}
		}
		
		// 출력
		for(int i=0;i<c.length;i++) {
			System.out.printf("%s : %s \n",c[i].kind,c[i].number);
		}
		
		
		
		
//		Card c = new Card();
//		c.kind = "Heart";
//		c.number = 1;
//		
//		Card c2 = new Card();
//		c2.kind = "Clover";
//		c2.number = 13;
//		
//		System.out.printf("%s : %d \n",c.kind,c.number);
//		System.out.printf("%s : %d \n",c2.kind,c2.number);
		

	}

}

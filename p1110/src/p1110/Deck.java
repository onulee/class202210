package p1110;

public class Deck {
	Card[] c = new Card[52]; //배열선언 카드개수-52개
	
	Deck() {  //생성자
		//입력
		for(int i=0;i<c.length;i++) { //1-13/
			c[i] = new Card();  //객체선언
			if(i%13==10) {
				c[i].number = "J";
			}else if(i%13==11) {
				c[i].number = "Q";
			}else if(i%13==12) {
				c[i].number = "K";
			}else {
				c[i].number = ((i%13)+1)+ "";
			}//if
			
			if(i/13==0) {
				c[i].kind = "Spade";
			}else if(i/13==1) {
				c[i].kind = "Diamond";
			}else if(i/13==2) {
				c[i].kind = "Heart";
			}else {
				c[i].kind = "Clover";
			}
		}//for
	}//Deck
	
	//카드 1장 뽑기메소드
	Card pick(int index) {
		return c[index];
	}
	
	// 카드 섞기메소드
	void shuffle() {
		Card temp = null;
		int r_num = 0;
		for(int i=0;i<2000;i++) {
			r_num = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[r_num];
			c[r_num] = temp;
		}
	}//shuffle
	
	

}

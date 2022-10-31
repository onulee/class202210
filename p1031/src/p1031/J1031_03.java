package p1031;

public class J1031_03 {

	public static void main(String[] args) {
		//1-10까지 랜덤숫자 2개를 생성해서 출력하시오.
		int r_num=0, r_num2=0, r_num3=0;
		
		for(int i=0;i<10000;i++) {
			
			r_num = (int)(Math.random()*3)+1;
			r_num2 = (int)(Math.random()*3)+1;
			r_num3 = (int)(Math.random()*3)+1;
			
			//무한반복
			while(true) {
				// 3개의 값을 비교
				if(r_num==r_num2 || r_num==r_num3 || r_num2==r_num3) {
					r_num = (int)(Math.random()*3)+1;
					r_num2 = (int)(Math.random()*3)+1;
					r_num3 = (int)(Math.random()*3)+1;
				}else {
					break;
				}
			}
			
			System.out.println(r_num);
			System.out.println(r_num2);
			System.out.println(r_num3);
			System.out.println("--------------------------------");
		}
	}
}

package p1104;

public class Lotto {
	public static void main(String[] args) {
		// 1. 45개 배열생성
		// 2. 1-45까지 숫자 넣기
		// 3. 랜덤숫자 섞기
		// 4. 6개 번호넣기
		// 5. 당첨번호 6개의 숫자 출력
		// 6. 자신 번호 6개 숫자출력
		// 7. 당첨번호개수 확인
		// 8. 당첨번호개수, 번호출력
		int score = 5;
		
		int[] num = {1,2,3,4,5};
		for(int i:num) {
			System.out.println(i);
		}
		
		int[] a = new int[3];
		int[] b = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		b = a;
		b[0] = 100;
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);//값 1,2,3
		
		
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);//값 100,2,3
		
		
		
		
		System.out.println(a); //주소		
		
		
	}

}

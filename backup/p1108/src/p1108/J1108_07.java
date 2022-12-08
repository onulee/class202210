package p1108;

public class J1108_07 {

	public static void main(String[] args) {
		// 크기5인 배열을 num1, num2를 만들어서
		// num1 1,2,3,4,5를 넣고, num2에는 10,20,30,40,50을 입력해서 출력하시오.
		// num2 주소를 num1에 입력하고
		// num1의 값을 100,200,300,400,500
		// num1,num2모두 출력을 해보세요.
		
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		for(int i=0;i<num1.length;i++) {
			num1[i] = i+1;
			System.out.println(num1[i]);
		}
		for(int i=0;i<num2.length;i++) {
			num2[i] = 10*(i+1);
			System.out.println(num2[i]);
		}
		
		num1 = num2; 
		
		num1[0]=100;
		num1[1]=200;
		num1[2]=300;
		num1[3]=400;
		num1[4]=500;
		System.out.println("--------------------------");
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
		
		
		
		

	}

}

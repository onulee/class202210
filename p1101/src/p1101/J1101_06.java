package p1101;

import java.util.Arrays;

public class J1101_06 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0;i<10;i++) {
//			System.out.println(arr[i]);
//		}
		
		int[] num = new int[100];
		for(int i=0;i<100;i++) {
			num[i] = i+1;
		}
		
		for(int i:arr) {  //단순for문
			System.out.println(i);
		}
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(num));

	}

}

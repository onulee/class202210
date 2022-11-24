package p1123;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J1123_07 {

	public static void main(String[] args) {
		
		String str = "abc";
		String str2 = String.valueOf("a");
		
		System.out.println(str);
		System.out.println(str2);
		
		
		
		Integer[] arr = {5,7,13,11,9,4,3,1};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//역순정렬
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		
		System.out.println(Arrays.toString(arr));
		
		
		
		//숫자 3개를 입력받아 순차정렬을 해보세요.
		// 15,10,5 -> 5,10,15
//		int[] num = new int[3];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 3개를 입력하세요.>>");
//		for(int i=0;i<num.length;i++) {
//			num[i] = scan.nextInt();
//		}
//		
//		//최대값
//		int maxNum = num[0]>num[1]?(num[0]>num[2]?num[0]:num[2]):num[1];
//		System.out.println("최대값 : "+maxNum);
//		int minNum = num[0]>num[1]?(num[1]>num[2]?num[2]:num[1]):num[1];
//		System.out.println("최소값 : "+minNum);
//		int total = num[0]+num[1]+num[2];
//		System.out.printf("%d,%d,%d \n",minNum,total-minNum-maxNum,maxNum);
//		
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		
		
		
//		String name = "Stanford,91,91,97";
//		System.out.println(name);
//		System.out.println(name.replace(",", "/")); 
//		
		
//		String name = "   Lee JungHo  ";
//		System.out.println(name);
//		System.out.println(name.trim());
//		System.out.println(name.replace(" ",""));
		

	}

}

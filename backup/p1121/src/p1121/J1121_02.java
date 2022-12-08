package p1121;

import java.util.ArrayList;

public class J1121_02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1); //0
		list.add("홍길동"); //1
		list.add(3); //2
		list.add(4); //3
		
		list.remove(0);
		list.remove(2);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("현재 list개수 : "+list.size());
		
//		int[] arr = {1,2,3,4,5};
//		String[] name = {"hong1","hong2","hong3"};
//		String[] name2 = new String[4];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		name[0]=null;
//		
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
//		}
		
		

	}

}

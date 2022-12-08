package p1123;

import java.util.ArrayList;
import java.util.List;

public class J1123_13 {

	public static void main(String[] args) {
		//다형성 : 부모의 참조변수 자손의 객체 사용
		List list = new ArrayList();
		list.add("aaa"); //0
		list.add(1);     //1
		list.add("bbb");
		list.add("c");
		list.add(2);
		list.add("aaa");
		
		//데이터 모두 삭제
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		
		if(list.size()==0) {
			System.out.println("모든데이터가 삭제되었습니다.");
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
////		list.clear(); //데이터를 삭제할때 사용
//		list.remove(2); // 특정한 위치를 찾아서 지움.
//		
//		if(list.size()==0) {
//			System.out.println("데이터가 없습니다.");
//		}
//		
		
		

	}

}

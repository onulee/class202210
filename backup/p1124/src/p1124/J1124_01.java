package p1124;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J1124_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("111");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		// 읽기 표준화
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

package p1124;

import java.util.*;

public class J1124_03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //Object
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		HashSet set = new HashSet(); //Object
		set.add("111");
		set.add("222");
		set.add("111");
		
		System.out.println("---------------------");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		
		HashMap map = new HashMap(); //Object
		map.put("admin", 1111);
		map.put("admin1", 1111);
		map.put("admin2", 1111);
		map.put("admin", 1111);
				
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
		
		
		
		
	}

}

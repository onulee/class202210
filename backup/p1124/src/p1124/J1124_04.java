package p1124;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class J1124_04 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("admin", 1111);
		map.put("aaa", 2222);
		map.put("admin2", 3333);
		
		System.out.println(map.get("aaa")); //key값을 입력하면 value값 출력
		System.out.println(map.get("admin2"));
		
		if(map.containsKey("aaa")) {
			System.out.println("aaa key가 존재합니다.");
		}else {
			System.out.println("aaa key가 존재하지 않습니다.");
		}
		
		
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String keys = it.next();
//			System.out.println(keys+"-"+map.get(keys));
//		}
		
		

	}

}

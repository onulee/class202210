package p1124;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class J1124_02 {

	public static void main(String[] args) {
		//list -> 순서O, 중복O
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",100,100,99));
		list.add(new Student("홍길자",90,90,99));
		list.add(new Student("홍길순",99,100,100));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.stuNum+","+s.name+","+s.kor+","+s.eng);
		}
		
		
		
		//set -> 순서X, 중복X
//		HashSet set = new HashSet();
//		set.add("111");
//		set.add("222");
//		set.add("333");
//		set.add("111");
//		set.add("222");
//		set.add("1");
//		
//		Iterator it = set.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		

	}

}

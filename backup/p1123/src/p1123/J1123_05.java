package p1123;

import java.util.ArrayList;

public class J1123_05 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		String[] stu = { "Stanford,91,91,97",
				"Adriena,91,86,99",
				"Cate,98,95,91","Tedie,89,86,96","Axe,85,93,94"};
		// stu배열을 Student객체로 만들어서 
		// ArrayList에 입력되도록 프로그램을 구성하시오.
		
		for(int i=0;i<stu.length;i++) {
			String[] stu1 = stu[i].split(","); //홍길동,String-100,90,91
			list.add(new Student(stu1[0],Integer.parseInt(stu1[1]),Integer.parseInt(stu1[2]),Integer.parseInt(stu1[3])));
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s\t%s\t%d \n",list.get(i).stuNum,list.get(i).name,list.get(i).total);
		}
		
		
		
		
		
//		String name ="홍길동/홍길자/홍길순/유관순/이순신/김구/김유신";
//		// 배열로 분리해서 출력하시오.
//		String[] name2 = name.split("/");
//		for(int i=0;i<name2.length;i++) {
//			System.out.println(name2[i]);
//		}
		
		
		
//		String hobbys = "golf,swim,game,book,run";
//		String[] hobby = hobbys.split(","); //배열로 분리
//		System.out.println("취미 : "+hobbys);
//		for(int i=0;i<hobby.length;i++) {
//			System.out.println("취미 : "+hobby[i]);
//		}

	}

}

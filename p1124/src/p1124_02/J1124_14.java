package p1124_02;

import java.io.FileWriter;
import java.util.ArrayList;

public class J1124_14 {

	public static void main(String[] args) throws Exception {
		ArrayList<Student> list = new ArrayList<>();
		String data = "";
		list.add(new Student("홍길동",100,100,99));
		list.add(new Student("유관순",90,90,99));
		
		FileWriter fw = new FileWriter("C:\\Users\\kv003\\list2.txt");
		
		// list3.txt
		for(int i=0;i<list.size();i++) {
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n", list.get(i).stuNum,list.get(i).name,list.get(i).kor,
					list.get(i).eng,list.get(i).math,list.get(i).total,list.get(i).avg,
					list.get(i).rank );
			fw.write(data);
			
		}
		
		System.out.println("파일 저장되었습니다.!");
		
		// fw닫기
		fw.close();
		

	}

}

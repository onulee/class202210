package p1124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class J1124_08_reader {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kv003\\write.txt"));
//			while(true) {
//				String line = br.readLine();
//				if(line==null) break;
//				System.out.println(line);
//			}
			
//			String line = br.readLine();
//			String[] str = line.split(",");
//			for(int i=0;i<str.length;i++) {
//				System.out.println(str[i]);
//			}
//			
//			System.out.println("배열 개수 : "+str.length);
			
			// 문서에 있는 글자 -> ArrayList에 저장
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				String[] str = line.split(",");
				//String stuNum, String name, int kor, int eng, int math, int total, double avg, int rank)
//				list.add(new Student("s0001","홍길동",100,100,100,300,100,0));
				list.add(new Student(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4]),Integer.parseInt(str[5]),Double.parseDouble(str[6]),Integer.parseInt(str[7]) ));
			}//while
//			
//			// 출력
			System.out.println("[[ 성적출력 ]]");
			System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("---------------------------------------------------------------");
			for(int i=0;i<list.size();i++) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						list.get(i).stuNum,list.get(i).name,list.get(i).kor,
						list.get(i).eng,list.get(i).math,list.get(i).total,list.get(i).avg,
						list.get(i).rank);
			}//for
			System.out.println();
//			
			
			
			// 배열로 분리를 해서 각각1줄씩 출력을 해보세요.
//			String[] str = line.split(",");
//			for(int i=0;i<str.length;i++) {
//				System.out.println(str[i]);
//			}
			
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package p1124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class J1124_10 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = null;
		String data = "";
		String[] temp = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\kv003\\list.txt"));
			//1번째
			while(true) {
				data = br.readLine();
				if(data==null) break;
				temp = data.split(",");
				list.add(new Student(temp[0],temp[1],Integer.parseInt(temp[2]),
						Integer.parseInt(temp[3]),Integer.parseInt(temp[4]),
						Integer.parseInt(temp[5]),Double.parseDouble(temp[6]),
						Integer.parseInt(temp[7]) ));
			}
			
			
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
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

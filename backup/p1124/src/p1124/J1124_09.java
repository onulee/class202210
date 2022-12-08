package p1124;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class J1124_09 {

	public static void main(String[] args) {
		FileWriter fw = null;
		String data="";
		try {
			fw = new FileWriter("C:\\Users\\kv003\\list.txt");
			
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n","s0001","홍길동",100,100,100,300,100.0,0);
			fw.write(data);
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n","s0002","유관순",90,90,90,270,90.0,0);
			fw.write(data);
			
			System.out.println("파일에 글자가 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}

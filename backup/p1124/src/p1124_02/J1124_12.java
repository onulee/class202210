package p1124_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J1124_12 {

	public static void main(String[] args) {
		// FileWriter 문서 파일저장 - Writer,Reader
		FileWriter fw = null;
		BufferedReader br = null;
		String data="";
		try {
			// 문서저장
			fw = new FileWriter("C:\\Users\\kv003\\list2.txt",true);
			for(int i=0;i<10;i++) {
				data = (i+1)+"번째 줄을 저장합니다.\r\n";
				fw.write(data);
			}
			System.out.println("파일이 저장되었습니다.!");
			
			
			// 문서읽기
			br = new BufferedReader(new FileReader("C:\\Users\\kv003\\list2.txt"));
			
			while(true) {
				data = br.readLine();
				if(data==null) break;
				System.out.println(data);
				
			}
			
			System.out.println("출력이 완료되었습니다.!!");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		
		
	}

}

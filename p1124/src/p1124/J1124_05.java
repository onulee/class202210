package p1124;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class J1124_05 {

	// 파일저장
	public static void main(String[] args){
		OutputStream os = null;
		try {
			//false: 덮어쓰기 ,true : 뒤에 데이터추가
			os = new FileOutputStream("C:\\Users\\kv003\\a.txt",true); 
			for(int i=1;i<=10;i++) {
				String data = i+",홍길자,100,100,99\r\n"; //  \r\n 줄바꿈.
				os.write(data.getBytes());  //data을 Byte단위로 변환
			}
			
			System.out.println("파일이 생성되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

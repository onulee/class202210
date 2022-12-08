package p1122_04;

import java.io.File;
import java.io.IOException;

public class J1122_10 {

	public static void main(String[] args) throws Exception {
		File f = new File("C:/file.txt");
		if(f.createNewFile()) {
			System.out.println("파일을 생성합니다.");
		}else {
			System.out.println("기존에 생성된 파일이 있습니다.");
		}
	}

}

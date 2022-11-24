package p1124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class J1124_06_output {

	public static void main(String[] args) {
		// C:/Users/kv003/input.txt
		InputStream is = null;
		try {
			byte[] b = new byte[1024];
			is = new FileInputStream("C:\\Users\\kv003\\a.txt");
			is.read(b);
			System.out.println(new String(b));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

package kr.ac.kopo.day13;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {
	
	public static void close(InputStream is) {	// => 객체를 생성하지않고 기능만사용하기위해 static 사용
		if (is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {	// => 객체를 생성하지않고 기능만사용하기위해 static 사용
		if (os != null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader rd) {	// => 객체를 생성하지않고 기능만사용하기위해 static 사용
		if (rd != null) {
			try {
				rd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer wt) {	// => 객체를 생성하지않고 기능만사용하기위해 static 사용
		if (wt != null) {
			try {
				wt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream fis, InputStream is) {
		close(fis);
		close(is);
	}
	
	public static void close(OutputStream fos, OutputStream os) {
		close(fos);
		close(os);
	}
}

package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 *	outputStream.flush() => 버퍼에 남아있는 데이터들을 출력장치로 밀어냄. 출력할땐 항상 마지막으로 flush를 사용.
 *	InputStream, OutputStream은 추상클래스 => FileInputStream, FileOutputStream 사용
 */

public class IOMain02 {

	public static void main(String[] args) {
		InputStream is = System.in;		// byte 스트림형태로 나옴
		InputStreamReader isr = new InputStreamReader(is);	// 바이트단위로 들어온데이터를 2바이트씩 문자로 바꿔준다. => 문자스트림으로 출력
		System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다. : ");
		
		while(true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char) c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 *	dog.jpg -> dog2.jpg 복사
 */

public class IOMain03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("iotest/dog.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("iotest/dog3.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while (true) {
				int c = bis.read();
				if(c == -1)
					break;
				bos.write(c);
			}
			
			fos.flush();
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000 + "초");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, bos);
			
		/*
			FileClose.close(bis);
			FileClose.close(bos);
			FileClose.close(fis);
			FileClose.close(fos);
		*/
			
		/*	
			if(bis != null) {
				try {
					bos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close(); // Stream 통로를 끊는 작업 => 다른 사용자가 접근할수 있도록. => 항상 finally에서 호출
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		*/
		}
		System.out.println("파일복사가 완료되었습니다.");
	}
}

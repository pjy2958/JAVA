package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 *	iotest/IOMain05.java -> IOMain05.java.txt 복사하기 
 */

public class IOMain05 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
//		PrintWriter pw = null;		//줄바꿈 방법1
		
		try {
			fr = new FileReader("iotest/IOMain04.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("iotest/IOMain04.java.txt");
			bw = new BufferedWriter(fw);
//			pw = new PrintWriter(bw);	// 줄바꿈 방법1
			
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				bw.write(data);			// 줄바꿈 방법2
				bw.newLine();			// 줄바꿈 방법2
//				pw.println(data);		// 줄바꿈 방법1
			}
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
//			FileClose.close(pw);	// 줄바꿈 방법1
		}

	}

}

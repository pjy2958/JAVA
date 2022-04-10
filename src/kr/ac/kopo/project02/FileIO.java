package kr.ac.kopo.project02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class FileIO {
	public void fileRead(List<Book> bookList) {
		FileReader fr = null;
		BufferedReader br = null;
		Book book;
		
		try {
			fr = new FileReader("D:\\work-space\\JAVA\\src\\kr\\ac\\kopo\\project02\\Library.txt");
			br = new BufferedReader(fr);
			
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] data = str.split(" ");
				book = new Book(data[5], data[9], data[13], Integer.valueOf(data[1]));
				bookList.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void fileWrite(Book book) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("D:\\work-space\\JAVA\\src\\kr\\ac\\kopo\\project02\\Library.txt", true);
			bw = new BufferedWriter(fw);

			String data = "책번호: " + book.getBookNumber() + "   책이름: " + book.getBookName() + "   저자: " + book.getBookWriter() + "   출판사: " + book.getPublisher();
			bw.write(data); // 줄바꿈 방법2
			bw.newLine(); // 줄바꿈 방법2
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}


package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
		a();
		
	}
	
	public static void a() {
		try {
		String str = null;
		System.out.println(str.length());
		} catch(Exception e) {
			System.out.println("에외발생 : " + e.getMessage());
		}
	}
	
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}

}

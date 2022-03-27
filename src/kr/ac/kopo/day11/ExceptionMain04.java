package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {
		// multi - catch
		
		System.out.println("main start");
		try {
			Random r = new Random();
			int num = r.nextInt(3); // 0 1 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println(str.charAt(10));
		} catch (ArithmeticException | StringIndexOutOfBoundsException ae) {
			System.out.println("에외처리 : " + ae.getMessage()); // 예외처리가 된 이유
		}
		
		System.out.println("main end");
	}
}

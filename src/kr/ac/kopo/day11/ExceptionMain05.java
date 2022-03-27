package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain05 {

	public static void main(String[] args) {
		// 묵시적 형변환 -> 예외처리는 모두 Exception을 상속받고 있다.
		
		System.out.println("main start");
		try {
			Random r = new Random();
			int num = r.nextInt(3); // 0 1 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println(str.charAt(10));
		} catch (Exception e) {
			System.out.println("에외처리 : " + e.getMessage()); // 예외처리가 된 이유
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}
}

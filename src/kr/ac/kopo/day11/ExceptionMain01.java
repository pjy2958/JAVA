package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		// 뻔히 아는 문제면 if를 통해 문제 해결
		System.out.println("main start");
		Random r = new Random();
		int num = r.nextInt(3);	// 0 1 2
		System.out.println("num : " + num);
		System.out.println(10 / num);
		System.out.println("main end");
	}
}

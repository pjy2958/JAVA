package kr.ac.kopo.day11;

import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}
	
}

public class ExceptionMain08 {
	
	public static void main(String[] args) {
		
		try {
			System.out.print("짝수를 입력 : ");
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine());
			
			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닌 정수가 입력되었습니다");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/*
		if(num < 0 || num %2 == 1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}
}

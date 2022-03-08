package kr.ac.kopo.day01;

// 한줄 주석처리
/* 여러줄     상수종료
   주석      1. 정수형 정수 (1, 2, 3,...)
   처리      2. 실수형 정수 (1.02, 2.38, 3.22, ...)
            3. 문자 상수 ('a', 'b', 'c')
            4. 문자열 상수 ("banana", "car", "apple")
            5. 논리형 상수 (true, false)
*/
/*
      출력메소드
      1. println() : 개행문자 포함O
      2. print() : 개행문자 포함X
*/

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("apple");
		System.out.println(true);
		System.out.println(23 + "살");  // 문자열 + 정수 => 문자열
		System.out.print(23);
		System.out.println('살');
		System.out.println("23살");
		System.out.println("AB"+4+12);
		System.out.println(4+12+"AB");
	}
}

package kr.ac.kopo.day01;

// 한줄 주석처리
/* 여러줄     상수종료
   주석      1. 정수형 정수 (1, 2, 3,...)
   처리      2. 실수형 정수 (1.02, 2.38, 3.22, ...)
            3. 문자 상수 ('a', 'b', 'c') : 대문자, 소문자, 숫자문자, 공백문자 -> (엔터 : '\n', 탭 : '\t')
            4. 문자열 상수 ("banana", "car", "apple")
            5. 논리형 상수 (true, false)
*/
/*
      출력메소드
      1. println() : 개행문자 포함O
      2. print() : 개행문자 포함X
      3. printf() : JDK1.5버전에서 추가된 메소드, 개행문자 포함X, 출력문자형태
          출력문자
            %d: 정수  %f: 실수  %c: 문자 %s: 문자열 %b: 논리값
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
		System.out.println("AB" + 4 + 12);
		System.out.println(4 + 12 + "AB");
		System.out.printf("%d\n", 23);
		System.out.println();
		System.out.printf("%d살 + %d살 = %d살", 23, 45, 23 + 45);
		System.out.println('\n');
		System.out.print('\t');
		System.out.println("h");
		System.out.printf("[%7d]\n", 1000);
		System.out.printf("[%7d]\n", 13000);
		System.out.printf("[%7d]\n", 250);
		System.out.printf("[%-7d]\n", 1000);
		System.out.printf("[%-7d]\n", 13000);
		System.out.printf("[%-7d]\n", 250);
		System.out.printf("[%05d]\n", 250);
		System.out.printf("[%5s]\n", "안녕");
		System.out.printf("[%10.5f]\n", 112.36);
		System.out.printf("%b\n", false);
	}
}

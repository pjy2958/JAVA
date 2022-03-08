package kr.ac.kopo.day01;

/*
 		기본자료형
 		논리형 : boolean
 		문자형 : char
 		정수형 : byte, short, int(기본), long
 		실수형 : float, double(기본)
 		
 		변수 선언 :
 		자료형 변수명;
 		
 		변수 대입 :
 		변수명 = 값;
 		
 		변수 초기화(선언과 동시에 값 대입) :
 		자료형 변수명 = 값;
 		
 		같은 자료형의 변수 여러개 선언
 		자료형 변수명1, 변수명2, 변수명3, ...;
 */

public class VariableMain {
	
	char b; // 멤버변수 -> 자동초기화 O
	
	public static void main(String[] args) {
		// 대문자 A를 저장하기 위한 변수 a 선언
		// 변수는 블록단위로 생성되고 삭제됨 ( { } )
		// 메소드안의 변수는 지역변수로 선언시 자동 초기화가 되지않음.
		char a; 	// 지역변수 -> 선언시 자동초기화 X -> 메모리의 스택영역에 공간을 할당하고 초기주소를 저장.
		a = 'A';	
		
		// 정수 123을 저장하기 위한 변수 c 선언 및 변수 초기화
		int c = 123;
		
		//실수 3개를 저장하기 위한 변수 d1, d2, d3 선언
		double d2, d3, d1 = 12.34;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d1);
	}
}

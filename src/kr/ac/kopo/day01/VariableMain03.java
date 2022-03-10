package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		int a;
		byte b = 100;
		// 기본 자료형에서의 형변환
		// 대입연산자를 기준으로 양쪽의 자료형이 형변환 발생. -> 1. 명시적(강제적)형변환 2. 묵시적 형변환
		// 묵시적 형변환 : 범위가 넓은 데이터 형에 좁은 데이터 형을 대입 -> 자료형 타입을 생략가능
		// 명시적 형변환 : 범위가 좁은 데이터 형에 넓은 데이터 형을 대입 -> 자료형 타입을 생략불가능
		a = b; // 묵시적형변환 : int는 4byte, byte는 1byte를 할당해서 문제가 없음. a = (int)b; **묵시적 형변환은 (int)생략가능.**
		b = (byte)a; // 명시적형변환 : (byte)생략 불가능. 대입하는 변수의 크기가 대입되는 변수의 크기보다 크면 안됌.
		
		System.out.println(10 + 20.0); // 큰쪽의 자료형 타입 자동으로 따라감. -> 묵시적형변환
		System.out.println(10 + (int)20.0); // 작은쪽의 자료형 타입을 출력하고 싶으면 명시적으로 타입을 적어야함 -> 명시적(강제적)형변환
		
		double d = 10 + 20.2; // 묵시적형변환
		int e = (int)(10 + 20.2); // 명시적형변환
		
		System.out.println(d);
		System.out.println(e);
		
		// 상수는 final을 붙인다.
		final int NUM = 100;
		System.out.println("num : " + NUM);
		//NUM = 20; final이 붙은순간 변경불가능 -> 오류출력
		
		//이스케이프문자
		char ch = '\'';
		char ch1 = '\"';
		char ch2 = '\\';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		String str = "\"ab\"";
		System.out.println(str);
	}
}
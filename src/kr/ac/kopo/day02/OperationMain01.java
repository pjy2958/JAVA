package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		int a = 1, b = 0, c = -1;
		
		boolean bool = ++a > 1 || ++b > 1; // 앞 항의 논리값을 파악하고 true임을 알고 뒤에 항의 논리값을 계산하지않음 => 논리연산자의 경우 배치를 주의해야함.
//		boolean bool = --a > 1 && ++b > 1 || ++c > 0; 예제2
//		boolean bool = a++ > 0 || b-- > 1 && c++ <= 0; 예제3
		
		System.out.println("bool = " + bool); // True
		System.out.println("a : " + a + ", b : " + b); // a : 2, b : 0
	}
}

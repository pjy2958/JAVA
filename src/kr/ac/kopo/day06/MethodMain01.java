package kr.ac.kopo.day06;

/*
 *	**********
 * 	Hello
 * 	**********
 * 	Hi
 *  **********
 *  Bye
 *  **********
 * 	
 * 	Method
 * 	메소드명() {
 * 		문장;
 * 		문장;
 * 	}
 */

public class MethodMain01 {
	
	static int printStar(char ch, int cnt) {		// 메소드 선언부
		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return ch + cnt;
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		
		if (bool) {
			return;		// return을 만나면 호출자메소드로 돌아감.
		}
		
		System.out.println("C");
		System.out.println("D");
	}
	
	public static void main(String[] args) {
//		aaa();
		String a = new String("Hello");
		int code01 = printStar('A', 10);		// 메소드 호출부		// main이 printStar을 호출. /main : 호출자 printStar : 피호출자/ printStar는 Main에 종속적
		System.out.println("Hello");
		int code02 = printStar('B', 20);
		System.out.println("Hi");
		int code03 = printStar('a', 5);
		System.out.println("Bye");
		int code04 = printStar('z', 8);
		
		System.out.println();
		System.out.println(code01);
		System.out.println(code02);
		System.out.println(code03);
		System.out.println(code04);
	}
}

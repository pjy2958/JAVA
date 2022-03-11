package kr.ac.kopo.day03.exam;

/*
 * 단축키
 * 복사해서 출력 ctr + ALT + 아랫방향키 
 * 줄 지우기 = ctr + del
 * 줄 이동시키기 = ALT + 방향키
 */

public class ExamMain01 {

	public static void main(String[] args) {
		// 12345
		for (int i = 5; i >= 1; i--) {
			System.out.print(i);
		}
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i = 1; i<=5; i++){
//			System.out.print("*");
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("hello");
//		}
//		for (int i = 10; i >= 1; i--) {
//			System.out.println("hello");
//		}
//		for(int i = 0; i <= 9; i++) {
//			System.out.println("hellow");
//		}		
//		for(int i = 5; i <= 14; i++) {
//			System.out.println("hellow");
//		}
//		for(int i = 5; i >= -4; i--) {
//			System.out.println("hellow");
//		}
	}
}

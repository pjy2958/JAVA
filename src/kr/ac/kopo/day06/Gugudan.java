package kr.ac.kopo.day06;

public class Gugudan {
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}
	}
	
	void print() {
		for(int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		
//		for(int dan = 2; dan <=9; dan++) {
//			print(dan);		// 같은 클래스 내에서는 바로 메소드 호출가능.
//		}
		
	}
}

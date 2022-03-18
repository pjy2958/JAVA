package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	
	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = Integer.parseInt(sc.nextLine());
		return dan;
	}

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}
	}

	void print(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		
//		for(int dan = 2; dan <=9; dan++) {
//			print(dan);		// 같은 클래스 내에서는 바로 메소드 호출가능.
//		}
		
	}
}

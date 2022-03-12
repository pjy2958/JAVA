package kr.ac.kopo.assignment02;

import java.util.Scanner;

public class AssignmentMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 단을 입력 : ");
		int dan = sc.nextInt(); // 몇단인지 입력

		System.out.printf("\n*** %d단 ***\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}

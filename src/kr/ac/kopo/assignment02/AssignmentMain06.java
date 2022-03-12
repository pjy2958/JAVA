package kr.ac.kopo.assignment02;

import java.util.Scanner;

public class AssignmentMain06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력 : ");
		int startDan = sc.nextInt();
		System.out.print("종료단을 입력 : ");
		int finishDan = sc.nextInt();

		if (startDan > finishDan) { // start가 더큰경우 finish랑 값 변경
			int temp = startDan;
			startDan = finishDan;
			finishDan = temp;
		}

		for (int i = startDan; i <= finishDan; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}

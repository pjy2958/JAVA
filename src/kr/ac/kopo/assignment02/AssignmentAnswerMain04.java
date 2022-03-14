package kr.ac.kopo.assignment02;

import java.util.Scanner;

// 10번 문제

public class AssignmentAnswerMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("라인수를 입력하세요(홀수) : ");
		int line = sc.nextInt();
		if (line % 2 == 0) {
			line -= 1;
		}

		int star = line / 2 + 1;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j <= star || j > line - star) {	// space의 크기는 중앙 지점을 시작으로 점점작아지거나 커진다.
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			if (i < line / 2 + 1) {
				star--;
			} else {
				star++;
			}
		}

		int point = 1;
		System.out.println();
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j < point || j > line + 1 - point) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			if (i < line / 2 + 1) {
				point++;
			} else {
				point--;
			}
			System.out.println();
		}
		/*
		int star = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				if(j <= star || j >= 10 - star) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			if(i < 5) {
				star++;
			} else {
				star--;
			}
			System.out.println();
		}
		*/
	}
}

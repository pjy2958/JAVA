package kr.ac.kopo.assignment03;

import java.util.Scanner;

public class AssignmentMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "'s num : ");
			numArr[i] = sc.nextInt();
		}

		int sum = 0; // 숫자의 총합

		System.out.println();
		System.out.println("< 짝수 >");
		for (int i : numArr) {
			if (i % 2 == 0) {
				System.out.print(i + "   ");
				sum += i;
			}
		}
		System.out.println("\n짝수의 총합 : " + sum);
		System.out.println();

		sum = 0; // 숫자의 총합 초기화
		System.out.println("< 홀수 >");
		for (int i : numArr) {
			if (i % 2 != 0) {
				System.out.print(i + "   ");
				sum += i;
			}
		}
		System.out.println("\n홀수의 총합 : " + sum);
	}
}

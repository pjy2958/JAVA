package kr.ac.kopo.assignment03;

import java.util.Scanner;

public class AssignmentMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "'s num : ");
			numArr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("< PRINT >");
		for (int i : numArr)
			System.out.print(i + "   ");
	}
}

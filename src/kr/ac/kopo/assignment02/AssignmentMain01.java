package kr.ac.kopo.assignment02;

import java.util.Scanner;

public class AssignmentMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100사이의 정수를 입력 : ");
		int num = sc.nextInt(); // 입력받은 정수를 저장하는 변수

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}
}

package kr.ac.kopo.assignment02;

import java.util.Scanner;

public class AssignmentMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int num1 = sc.nextInt(); // 1-100 사이의 정수

		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int num2 = sc.nextInt(); // 2-10 사이의 정수

		System.out.printf("\n< 1 ~ %d사이의 %d의 배수를 제외한 정수 출력 >\n", num1, num2);
		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0) // num2의 배수가 아닌 정수만 출력
				System.out.print(i + " ");
		}
		System.out.println();

		System.out.printf("\n< 1 ~ %d사이의 %d의 배수를 제외한 정수 5개씩 출력 >\n", num1, num2);
		int cnt = 0; // 출력된 값의 갯수를 저장하는 변수
		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0) {
				System.out.printf("%3d ", i);
				cnt++; // 출력됬으니 1개저장
				if (cnt % 5 == 0) // 출력된 갯수가 5개마다 줄바꿈
					System.out.println();
			}
		}
	}
}

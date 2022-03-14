package kr.ac.kopo.assignment03;

import java.util.Scanner;

public class AssignmentMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int index = 0; // 배열 인덱스 번호
		int num = 0; // 입력받은 숫자

		while (index < 5) {
			System.out.print(index + 1 + "'s num : ");
			num = sc.nextInt();
			if (num % 2 == 0) { // 입력받은 값이 짝수이면 배열에 저장 및 index값 + 1
				numArr[index] = num;
				index += 1;
			}
		}
		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for (int i : numArr)
			System.out.print(i + "   ");
	}
}

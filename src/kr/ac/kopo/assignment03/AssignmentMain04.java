package kr.ac.kopo.assignment03;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int index = 0; // 인덱스 번호
		int num = 0; // 입력받는 정수
		int max = 0; // 최대값 저장 변수

		while (index < 5) {
			System.out.print(index + 1 + "번째 정수 : ");
			num = sc.nextInt();
			if (num > max) {
				max = num;
				numArr[index] = num;
				index++;
			} else {
				for (int i = 0; i < numArr.length; i++) {
					if (numArr[i + 1] != 0) {
						System.out.print(" " + numArr[i] + ",");
					} else {
						System.out.println(numArr[i] + "보다 큰수가 와야합니다.");
						break;
					}
				}
			}
		}

		System.out.println();
		System.out.println("< PRINT >");
		System.out.println(Arrays.toString(numArr));
		int[] reverseNumArr = new int[5];
		for (int i = 0; i < 5; i++) {
			int tenthDigit = numArr[4 - i] / 10; // 십의자리수
			int unitsDigit = numArr[4 - i] % 10; // 일의자리수
			reverseNumArr[i] = unitsDigit * 10 + tenthDigit;
		}

		System.out.println();
		System.out.println("< REVERSE >");
		System.out.println(Arrays.toString(reverseNumArr));
	}
}

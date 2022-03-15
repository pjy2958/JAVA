package kr.ac.kopo.assignment03;

import java.util.Scanner;

// 4번문제

public class AssignmentAnswerMain02 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();

			// nums[i] > nums[0] ~ nums[i-1]
			if (i > 0 && nums[i] < nums[i - 1]) {
				for (int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("보다 큰수여야합니다.");
				i--;
			}
		}

		System.out.println("< PRINT >");
		for (int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();

		System.out.println("< REVERSE >");
		for (int i = nums.length - 1; i >= 0; i--) {
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;

			System.out.print(n1 * 10 + n10 + "\t");
		}
		System.out.println();
	}
}

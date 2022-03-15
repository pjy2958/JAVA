package kr.ac.kopo.assignment03;

import java.util.Scanner;

public class AssignmentAnswerMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println("< BEFORE >");
		for (int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();

		System.out.print("Left(-), Right(+) : ");
		char ch = sc.nextLine().charAt(0);

		System.out.print("Start Index(0-4) : ");
		int index = sc.nextInt();
		
		System.out.println("< AFTER >");
		if (ch == '+') { 			// circle을 돌릴때는 mod 연산을 주로 사용**
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[(index + i) % nums.length] + "\t");
			}
		} else if (ch == '-') {
			for (int i = 0; i < 5; i++) {
				System.out.print(nums[(index - i + nums.length) % nums.length] + "\t");
			}
		}
		System.out.println();
		
		/*
		System.out.println("< AFTER >");
		if (ch == '+') {
			for (int i = index; i < nums.length; i++) {
				System.out.print(nums[i] + "\t");
			}
			for (int i = 0; i < index; i++) {
				System.out.print(nums[i] + "\t");
			}
		} else if (ch == '-') {
			for (int i = index; i >= 0; i--) {
				System.out.print(nums[i] + "\t");
			}
			for (int i = nums.length - 1; i > index; i--) {
				System.out.print(nums[i] + "\t");
			}
		}
		System.out.println();
		*/
	}
}

package kr.ac.kopo.assignment03;

import java.util.Scanner;

public class AssignmentMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,2,3,4,5};
		
		System.out.print("Left(-), Right(+) : ");
		char ch = sc.nextLine().charAt(0);
		int num = 0;
		
		if (ch == '+' || ch == '-') {
			System.out.print("Start Index(0 - 4) : ");
			num = sc.nextInt();
			if(ch == '+') {
				for (int i = 0; i < nums.length; i++) {
					if(i + num < 5)
						System.out.print(nums[i + num] + " ");
					else
						System.out.print(nums[num + i - 5] + " ");
				}
			} else {
				for (int i = 0; i < nums.length; i++) {
					if(i + num < 5)
						System.out.print(nums[i + num] + " ");
					else
						System.out.print(nums[num + i - 5] + " ");
				}
			}
			
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
}

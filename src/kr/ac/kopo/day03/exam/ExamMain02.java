package kr.ac.kopo.day03.exam;

public class ExamMain02 {

	public static void main(String[] args) {
		System.out.println("1번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("2번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("3번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i + j - 1);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("4번문제");
		for (int i = 5; i >= 1; i--) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i + j - 1);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("5번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("6번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (5-i+1); j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("7번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i - 1; j++) { 
				System.out.print(" ");
			}
			for(int j = 1; j <= 5 - i + 1; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("7번문제2");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("8번문제");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) { 
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("8번문제2");
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (6-j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("9번문제");
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("10번문제");
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= i - 4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("11번문제");
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if (i > j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for (int j = 5; j >= 1; j--) {
					if (i - 4 < j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}

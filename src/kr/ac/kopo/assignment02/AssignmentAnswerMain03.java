package kr.ac.kopo.assignment02;

// 8번 문제 => 규칙파악

public class AssignmentAnswerMain03 {

	public static void main(String[] args) {
		int start = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < start) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();

			if (i < 5) {
				start++;
			} else {
				start--;
			}
		}
			
		System.out.println();
		for(int i = 1; i<=9; i++) {
			if(i <= 5) {
				for(int j = 1; j <=5; j++) {
					if(i > j) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
			} else {
				for(int j = 1; j <=5; j++) {
					if(i < 10-j) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		int space = 0, star = 5;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print('-');
			}
			for (int j = 1; j <= star; j++) {
				System.out.print('*');
			}

			System.out.println();
			if (i < 5) {
				space++;
				star--;
			} else {
				space--;
				star++;
			}
		}
		
		System.out.println();
		for (int i=1; i <= 9 ; i++) {
			if(i<=5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print("-");
				}
				for(int j = 1; j <= 6-i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 9-i; j++) {
					System.out.print("-");
				}
				for(int j = 1; j<= i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

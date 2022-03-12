package kr.ac.kopo.assignment02;

public class AssignmentMain07 {
	public static void main(String[] args) {
		for (int col = 1; col <= 7; col += 3) {
			for (int i = 1; i <= 9; i++) {
				for (int dan = col + 1; dan <= col + 3; dan++) {
					if (dan == 10)
						break;
					System.out.printf("%2d * %2d = %2d\t", dan, i, dan * i);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

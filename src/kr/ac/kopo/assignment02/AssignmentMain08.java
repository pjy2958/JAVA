package kr.ac.kopo.assignment02;

public class AssignmentMain08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= 5) {
					if (j < i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				} else {
					if (j + i < 10) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}

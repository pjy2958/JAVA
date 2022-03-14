package kr.ac.kopo.assignment02;

// 7번문제

public class AssignmentAnswerMain01 {

	public static void main(String[] args) {
		
		int step = 3;
		
		for (int dan = 2; dan <= 9; dan += step) {
			
			for (int i = 0; i <= 9; i++) {
				
				for (int j = dan; j <= 9 && j < dan + step; j++) { 		// 조건에 논리연산자쓰는것도 고려 => 무조건 if만사용하진않아도됌.
					if(i == 0 ) {
						System.out.printf("**** %d단 ****\t", j);
					} else {
						System.out.printf("%2d * %2d = %2d\t", j, i, j * i);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

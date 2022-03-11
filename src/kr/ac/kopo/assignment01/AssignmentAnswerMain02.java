package kr.ac.kopo.assignment01;

// 11번 과제

public class AssignmentAnswerMain02 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 30) + 1;
		int num2 = (int)(Math.random() * 30) + 1;
		int num3 = (int)(Math.random() * 30) + 1;
		int num4 = (int)(Math.random() * 30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		int max = num1 > num2 ? num1 : num2;
		if (max < num3) {
			max = num3;
		}
		if (max < num4) {
			max = num4;
		}
		System.out.println("가장 큰 수 : " + max);
	}
}

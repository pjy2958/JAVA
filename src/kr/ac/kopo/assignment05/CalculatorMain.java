package kr.ac.kopo.assignment05;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.printf("첫번째 정수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.printf("두번째 정수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		calculator.add(num1, num2);
		calculator.sub(num1, num2);
		calculator.mul(num1, num2);
		calculator.div(num1, num2);
		System.out.println();
		calculator.prime(num1);
		calculator.prime(num2);
	}
}

package kr.ac.kopo.assignment05;

public class Calculator {
	void add(int num1, int num2) {	// 덧셈
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
	void sub(int num1, int num2) {	// 뺄셈
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	}
	void mul(int num1, int num2) {	// 곱셈
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	}
	void div(int num1, int num2) {	// 나눗셈
		System.out.printf("%d / %d = %.3f\n", num1, num2, (float) num1 / (float) num2);
	}
	void prime(int num) { // 소수판별
		int cnt = 0;
		boolean result;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				cnt ++;
		}
		if (cnt == 2) {
			result = true;
		} else
			result = false;
		
		System.out.println(num + " 소수체크 : " + result);
	}
}

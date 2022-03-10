package kr.ac.kopo.day02;

/*
 * 삼항연산자
 */

public class OperationMain03 {

	public static void main(String[] args) {
		int a = -5, b = 0;
		int max = a > b ? a : (b != 0 ? b : 0);
		System.out.println("max : " + max);
	}
}

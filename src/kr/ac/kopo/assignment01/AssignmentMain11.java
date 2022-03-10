package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int max;	// 최대값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		max = num1;
		
		if (num2 >= num1) {
			max = num2;
		}
		
		if (num3 >= num2) {
			max = num3;
		}
		
		if (num4 >= num3) {
			max = num4;
		}
		System.out.printf("가장 큰수 : %d", max);
	}
}

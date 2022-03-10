package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain10 {

	public static void main(String[] args) {
		int num1;	// 첫번째 정수
		int num2;	// 두번째 정수
		int num3;	// 세번째 정수
		int max = 0;		// 최대값
		int mid = 0;		// 중간값
		int min = 0;		// 최소값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {			// num1이 최대값일때
			max = num1;
			if	(num2 >= num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {	//num2가 최대값일때
			max = num2;
			if (num1 >= num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else {									// num3이 최대값을때
			max = num3;
			if (num1 >= num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		}
		System.out.printf("%d  %d  %d", max, mid, min);
	}
}

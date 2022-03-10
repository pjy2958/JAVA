package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain04 {

	public static void main(String[] args) {
		int num1; // 정수
		int num2; // 나눌 수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		System.out.printf("몫 : %d\n", num1/num2);
		System.out.printf("나머지 : %d", num1%num2);
	}

}

package kr.ac.kopo.day02;
import java.util.Scanner;

/*
 *  배수 판독기
 *  a 입력 10
 *  b 입력 3
 *  10이 3의 배수인가? false
 *  
 *  a 입력 10
 *  b 입력 5
 *  10이 5의 배수인가? true
 */

public class OperationMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);     // import 단축키 ctrl + shift + o 
		
		System.out.print("a의 값을 입력하세요 : ");  // a값 입력
		int a = sc.nextInt();
		System.out.print("b의 값을 입력하세요 : ");  // b값 입력
		int b = sc.nextInt();
		
		
		boolean result = b != 0 && a%b ==0;
		System.out.printf("%d가 %d의 배수인가? %b\n", a, b, result);
	}

}

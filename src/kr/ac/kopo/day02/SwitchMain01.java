package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 *		1 ~ 3 사이의 정수 입력 :
 *		1 입력시 "ONE" 출력
 *		2 입력시 "TWO" 출력
 *		3 입력시 "THREE" 출력
 *		그외    "ERROR" 출력
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if (num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		
		// switch문을 사용하는 경우 : if문의 경우 n개중에 1개를 선택 할 때 사용
		//                       switch문의 경우 n개중에 m개(m<=n)를 사용 -> break로 조절가능
		switch (num) {						// 수식(현재 예시에선 num자리)에 들어올 수 있는 것 : byte, short, char, int, enum, String
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :                         	// default는 위쪽에 있더라도 모든 case를 다 수행하고 실행됌.
			System.out.println("ERROR");
		}
	}
}

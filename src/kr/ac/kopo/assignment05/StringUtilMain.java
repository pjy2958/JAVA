package kr.ac.kopo.assignment05;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		StringUtil util = new StringUtil();
		Scanner sc = new Scanner(System.in);
		
		int num1;	// max,min 함수에 사용할 정수1
		int num2;	// max,min 함수에 사용할 정수2
		
		while (true) {
			System.out.println("----------------------StringUtil----------------------");
			System.out.println("1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 기능");
			System.out.println("2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 기능");
			System.out.println("3. 두개의 숫자를 입력받아 큰수를 반환하는 기능");
			System.out.println("4. 두개의 숫자를 입력받아 작은수를 반환하는 기능");
			System.out.println("5. 문자열을 입력받아 거꾸로 변경하는 기능");
			System.out.println("6. 문자열을 입력받아 대문자로 변경하는 기능");
			System.out.println("7. 문자열을 입력받아 소문자로 변경하는 기능");
			System.out.println("0. 시스템 종료");
			System.out.print("기능을 선택하세요 : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 0:
				return;
				
			case 1:
				System.out.print("문자를 입력하세요 : ");
				System.out.println("결과 : " + util.isUpperChar(sc.nextLine().charAt(0)));
				System.out.println();
				break;

			case 2:
				System.out.print("문자를 입력하세요 : ");
				System.out.println("결과 : " + util.isLowerChar(sc.nextLine().charAt(0)));
				System.out.println();
				break;
				
			case 3:
				System.out.print("첫번째 숫자 입력하세요 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 숫자 입력하세요 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("max : " + util.max(num1, num2));
				System.out.println();
				break;
				
			case 4:
				System.out.print("첫번째 숫자 입력하세요 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 숫자 입력하세요 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("min : " + util.min(num1, num2));
				System.out.println();
				break;
				
			case 5:
				System.out.print("문자열을 입력하세요 : ");
				System.out.println("StringReverse : " + util.reverseString(sc.nextLine()));
				System.out.println();
				break;
				
			case 6:
				System.out.print("문자열을 입력하세요 : ");
				System.out.println("UpperString : " + util.toUpperString(sc.nextLine()));
				System.out.println();
				break;
				
			case 7:
				System.out.print("문자열을 입력하세요 : ");
				System.out.println("LowerString : " + util.toLowerString(sc.nextLine()));
				System.out.println();
				break;
				
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

}

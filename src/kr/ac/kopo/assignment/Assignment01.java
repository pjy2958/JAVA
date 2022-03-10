package kr.ac.kopo.assignment;
import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		/*
		// 1번 문제 ------------------------------------
		System.out.printf("A = %d\n", (int)'A');
		System.out.printf("E = %d\n", (int)'E');
		System.out.printf("I = %d\n", (int)'I');
		System.out.printf("O = %d\n", (int)'O');
		System.out.printf("U = %d\n", (int)'U');
		// --------------------------------------------
		*/
		
		
		/*
		// 2번 문제 -------------------------------------
		int beginSecond;	// 입력받은 초기 초
		int hour;			// 변환한 시간
		int minute; 		// 변환한 분
		int second;			// 변환한 초
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		beginSecond = sc.nextInt();
		
		hour = beginSecond / 3600;	// 1시간 = 3600초
		beginSecond %= 3600;
		
		minute = beginSecond / 60;	// 1분 = 60초
		beginSecond %= 60;
		
		second = beginSecond;
		
		System.out.print("결과출력 : ");
		if (hour != 0)
			System.out.printf("%d시간 ", hour);
		if (minute != 0)
			System.out.printf("%d분 ", minute);
		if (second != 0)
			System.out.printf("%d초 ", second);
		if (hour == 0 && minute == 0 && second == 0) {
			System.out.println("0초");
		}
		// ---------------------------------------------
		*/
		
		
		/*
		// 3번 문제 --------------------------------------
		final double PI = 3.141592; // 원주율 상수
		double radius; 				// 반지름
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		radius = sc.nextInt();
		
		System.out.printf("결과출력 : 원의 면적은 %f 입니다.", PI*radius*radius); // 원의 면적 : 원주율*반지름^2
		// ---------------------------------------------
		*/
		
		
		/*
		// 4번 문제 --------------------------------------
		int num1; // 정수
		int num2; // 나눌 수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		System.out.printf("몫 : %d\n", num1/num2);
		System.out.printf("나머지 : %d", num1%num2);
		// ---------------------------------------------
		*/
		
		
		/*
		// 5번 문제 --------------------------------------
		final float DALLOR = 1092.50f;  // 1달러당 현재 원화
		int inputDallor;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요 ? ");
		inputDallor = sc.nextInt();
		
		System.out.printf("원화 : %.2f원", DALLOR*(float)inputDallor);
		// ---------------------------------------------
		*/
		
		
		/*
		// 6번 문제 --------------------------------------
		System.out.printf("알파벳의 갯수 : %d개", ((int)'Z' - (int)'A' + 1)*2); // 알파벳 대문자의 갯수는 Z의 아스키코드값 - A의 아스키코드값 + 1
																			// 알파벳은 소문자 대문자가 있으므로 알파벳의 총갯수는 (Z의 아스키코드 값 - A의 아스키코드값 + 1)*2
		// ---------------------------------------------
		*/
		
		
		/*
		// 7번 문제 --------------------------------------
		char alphabet;	// 입력받을 알파벳을 저장하는 변수
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳) : ");
		alphabet = sc.nextLine().charAt(0);
		
		// a의 아스키고드값은 97 A의 아스키코드값은 65  두값의 차이는 32
		// z의 아스키코드값은 122
		
		if ((int)alphabet < 65) {
			System.out.println("ERROR");
		} else if ((int)alphabet < 97){
			System.out.printf("변경된 값 : %c", (int)alphabet + 32);
		} else if ((int)alphabet < 123){
			System.out.printf("변경된 값 : %c", (int)alphabet - 32);
		} else {
			System.out.println("ERROR");
		}
		// ---------------------------------------------
		*/
		
		
		/*
		// 8번 문제 --------------------------------------
		int productPrice;		// 물건 값
		int payMoney;			// 지불한 값
		int changeMoney;		// 거스름돈
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력 : ");
		productPrice = sc.nextInt();
		System.out.print("지불한 돈의 액수 : ");
		payMoney = sc.nextInt();
		
		changeMoney = payMoney - productPrice;	// 거스름돈 = 지불한 값 - 물건 값
		
		System.out.printf("\n거스름돈 : %d\n", changeMoney);
		System.out.printf("1000원 : %d 개\n", changeMoney / 1000);
		changeMoney %= 1000;
		
		System.out.printf("500원 : %d 개\n", changeMoney / 500);
		changeMoney %= 500;
		
		System.out.printf("100원 : %d 개\n", changeMoney / 100);
		changeMoney %= 100;
		
		System.out.printf("50원 : %d 개\n", changeMoney / 50);
		changeMoney %= 50;
		
		System.out.printf("10원 : %d 개\n", changeMoney / 10);
		changeMoney %= 10;
		// ---------------------------------------------
		*/
		
		
		/*
		// 9번 문제 --------------------------------------
		int bookNum;	// 책 권수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 : ");
		bookNum = sc.nextInt();
		
		if (bookNum < 0) {								// 책권수가 음수일 경우
			System.out.println("잘못 입력했습니다.");
		} else if (bookNum == 0) {						// 책권수가 0권일 경우
			System.out.println("보유하고 있는 책 없음");
		} else if (bookNum == 1) {
			System.out.printf("%d book\n", bookNum);	// 책권수가 1권일 경우
		} else {
			System.out.printf("%d books\n", bookNum);	// 책권수가 1권보다 많을 경우
		}
		// ---------------------------------------------
		*/
		
		
		/*
		// 10번 문제 --------------------------------------
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
		
		if (num1 > num2) {			// num1이 num2보다 클 때,
			max = num1;		
			if (num2 > num3) {		//num2가 num3보다 큰경우
				mid = num2;
				min = num3;
			} else {				// num2가 num3보다 작을때,
				if (num1 > num3) {	//num1이 num3 보다 큰 경우
					mid = num3;
					min = num2;
				} else {			// num3이 num1 보다 큰 경우 
					max = num3;
					mid = num1;
					min = num2;
				}
			}
		} else {					// num1이 num2보다 작을때, 
			max = num2;
			if (num1 > num3) {		// num1이 num3보다 큰경우
				mid = num1;
				min = num3;
			} else {				// num3이 num1보다 큰경우
				if (num2 > num3) {	// num2가 num3보다 큰 경우
					mid = num3;
					min = num1;
				} else {			// num3이 num2보다 큰 경우
					max = num3;
					mid = num2;
					min = num1;
				}
			}
		}
		System.out.printf("%d  %d  %d", max, mid, min);
		// ---------------------------------------------
		*/
		
		
		
		// 11번 문제 --------------------------------------
		
		// ---------------------------------------------
		
	}
}

package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain08 {

	public static void main(String[] args) {
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
	}
}

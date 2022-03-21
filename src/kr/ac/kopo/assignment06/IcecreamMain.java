package kr.ac.kopo.assignment06;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IcecreamMarket iceM = new IcecreamMarket();
		
		char ch = 'Y';
		
		while (ch == 'y' || ch == 'Y') {
			iceM.inputIceinfo();
			
			System.out.print("계속 주문하시겠습니까(yes:Y/y, no:N/n) : ");
			ch = sc.nextLine().charAt(0);
			
			if(ch == 'N' || ch == 'n') {	// 종료조건
				iceM.printTotalInfo();
			}
		}
	}
}

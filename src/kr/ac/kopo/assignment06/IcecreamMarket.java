package kr.ac.kopo.assignment06;

import java.util.Scanner;

public class IcecreamMarket {
	Scanner sc = new Scanner(System.in);
	private int icereamTotalCnt;	// 아이스크림 총 판매 갯수
	private int icecreamTotalPrice;	// 아이스크림 총 판매 가격
	private Icecream[] iceArr = new Icecream[100];	// 아이스크림 정보 배열
	
	IcecreamMarket(){
		this.icecreamTotalPrice = 0;
		this.icereamTotalCnt = 0;
	}
	
	// 아이스크림 정보를 입력받아 저장하는 메소드
	public void inputIceinfo() {
		int num;	// 아이스크림 입력 갯수
		String iceName;	// 아이스크림 이름
		int icePrice;	// 아이스크림 가격
		int startIndex = this.icereamTotalCnt;	// 시작 인덱스번호
		
		System.out.print("아이스크림 몇개 입력 ? : ");
		num = Integer.parseInt(sc.nextLine());
		if(num <= 0) {
			printError();
			return;
		}		
		for(int i = 0; i < num; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			System.out.print("아이스크림 이름 : ");
			iceName = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			icePrice = Integer.parseInt(sc.nextLine());
			
			Icecream ice = new Icecream(iceName, icePrice);
			iceArr[this.icereamTotalCnt] = ice;
			this.icereamTotalCnt++;
			this.icecreamTotalPrice += icePrice;
			System.out.println();
		}
		printIceInfo(startIndex, this.icereamTotalCnt);
	}
	
	// 입력한 아이스크림명, 가격을 출력하는 메소드
	public void printIceInfo(int startIndex, int endIndex) {
		int cnt = 1;	// 번호 카운트
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", endIndex - startIndex);
		System.out.println("\n번호\t아이스크림명\t가격");
		for(int i = startIndex; i < endIndex; i++) {
			System.out.printf("%03d\t%s\t\t%4d\n", cnt, this.iceArr[i].getIceName(), this.iceArr[i].getIcePrice());
			cnt++;
		}
		System.out.println();
	}
	
	// 아이스크림 총 판매갯수, 판매액을 출력하는 메소드
	public void printTotalInfo() {
		System.out.println("총 판매개수 : " + this.icereamTotalCnt);
		System.out.println("총 판매액 : " + this.icecreamTotalPrice + "원");
	}
	
	public void printError() {
		System.out.println("잘못 입력하였습니다.");
	}
}

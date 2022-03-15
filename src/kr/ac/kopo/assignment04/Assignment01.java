package kr.ac.kopo.assignment04;

import java.util.Scanner;

class Icecream {
	String iceName;	// 아이스크림이름
	int icePrice;	// 아이스크림가격
}

public class Assignment01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int num = sc.nextInt();
		sc.nextLine();
		Icecream[] iceArr = new Icecream[num];
		
		System.out.println();
		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new Icecream();
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);

			System.out.print("아이스크림명 : ");
			iceArr[i].iceName = sc.nextLine();
			
			System.out.print("아이스크림가격 : ");
			iceArr[i].icePrice = sc.nextInt();
			sc.nextLine();
			System.out.println();
		}
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 >\n", num);
		System.out.println("번호\t아이스크림명\t가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.printf("%03d\t%s\t\t%4d\n", i + 1, iceArr[i].iceName, iceArr[i].icePrice);
		}

	}

}

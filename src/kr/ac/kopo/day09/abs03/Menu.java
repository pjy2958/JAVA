package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	
	public void process() {
		int type = select();
		print(type);
	}
	
	private void print (int type) {		// 외부적으로 드러나지않는 기능들은 private 설정
		Printer p = null;				// 객체의 형변환 : 묵시적 형변환
		switch(type) {
		case 1:
			p = new LGPrinter();
			p.print();
			break;
		case 2:
			p = new SamsungPrinter();
			p.print();
			break;
		case 3:
			p = new HPPrinter();
			p.print();
			break;
		default:
			printError();
		}
	}
	
	private int select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) : ");
		int type = Integer.parseInt(sc.nextLine());
		return type;
	}
	
	private void printError() {
		System.out.println("번호를 잘못 입력했습니다.");
	}
}

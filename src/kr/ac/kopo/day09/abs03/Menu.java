package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	
	public void process() {
		int type = select();
		print(type);
	}
	
	public void print (int type) {
		Printer p = null;
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
	
	public int select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) : ");
		int type = Integer.parseInt(sc.nextLine());
		return type;
	}
	
	public void printError() {
		System.out.println("번호를 잘못 입력했습니다.");
	}
}

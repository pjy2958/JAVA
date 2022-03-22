package kr.ac.kopo.day09.abs01;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	
	public void process() {
		int type = select();
		print(type);
	}
	
	public void print (int type) {
		switch(type) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			break;
		case 2:
			SamsungPrinter samsung = new SamsungPrinter();
			samsung.samPrint();
			break;
		default:
			printError();
		}
	}
	
	public int select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG) : ");
		int type = Integer.parseInt(sc.nextLine());
		return type;
	}
	
	public void printError() {
		System.out.println("번호를 잘못 입력했습니다.");
	}
	
}

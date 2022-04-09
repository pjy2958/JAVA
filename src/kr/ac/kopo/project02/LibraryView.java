package kr.ac.kopo.project02;

import java.util.Scanner;

public class LibraryView {
	private Scanner sc;
	
	public LibraryView() {
		this.sc = new Scanner(System.in);
	}
	public void mainMenu() {
		while (true) {
			System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<도서관 메인 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.대여하기 | 2.반납하기 | 3.도서관리 | 4.회원정보 | 5.종료 |");
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("* 기능을 선택하세요 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.exit(0);
			case 6:
				
				break;
			default:
				System.out.println("** 잘못 입력하였습니다.");
			}
		}
	}
	
	
}

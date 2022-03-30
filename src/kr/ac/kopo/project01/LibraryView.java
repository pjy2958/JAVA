package kr.ac.kopo.project01;

import java.util.Scanner;

public class LibraryView {
	
	private Scanner sc;		// 스캐너
	private LibraryUtil libraryUtil;
	
	public LibraryView() {
		this.sc = new Scanner(System.in);
		this.libraryUtil = new LibraryUtil();
	}

	// 도서관 메인 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("<----------------도서관 이용 메뉴---------------->");
			System.out.println("1.대여\t2.반납\t3.회원관리\t4.도서관리\t5.종료");
			System.out.print("원하시는 기능을 선택하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				loanView();
				break;
			case 2:
				returnBookView();
				break;
			case 3:
				memberManagementView();
				libraryUtil.login();
				break;
			case 4:
				bookManagementView();
				libraryUtil.login();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
	
	private void loginView() {
		System.out.println("로그인을 해야 이용할 수 있습니다.");
		System.out.println("1.로그인\t2.회원가입\t3.돌아가기");
		System.out.print("원하시는 기능을 선택하세요 : ");
		int num = Integer.parseInt(this.sc.nextLine());
		switch(num) {
		case 1:
			this.libraryUtil.login();
			break;
		case 2:
			this.libraryUtil.registration();
			break;
		case 3:
			return;
		}
	}
	
	// 책 대여 화면
	private void loanView() {
		
	}
	
	// 책 반납 화면
	private void returnBookView() {
		
	}
	
	// 회원관리 화면
	private void memberManagementView() {
		
	}
	
	// 도서관리 화면
	private void bookManagementView() {
		// 로그인
		// 
	}
} 

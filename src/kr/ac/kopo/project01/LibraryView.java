package kr.ac.kopo.project01;

import java.util.Scanner;

public class LibraryView {
	
	private Scanner sc;		// 스캐너
	private boolean loginCheck;	// 로그인되어있는지 체크하는 변수
	private LibraryManagement libraryManagement;
	private BookManagement bookManagement;
	private BookBorrowUtil bookBorrowUtil;
	private BookReturnUtil bookReturnUtil;
	private BookManagementUtil bookManagementUtil;
	private LoginUtil loginUtil;
	
	public LibraryView() {
		this.sc = new Scanner(System.in);
		this.loginCheck = false;
		this.libraryManagement = new LibraryManagement();
		this.bookManagement = new BookManagement();
		this.bookBorrowUtil = new BookBorrowUtil();
		this.bookReturnUtil = new BookReturnUtil();
		this.bookManagementUtil = new BookManagementUtil();
		this.loginUtil = new LoginUtil();
	}

	// 도서관 메인 화면
	public void mainMenu() {
		while(true) {
			print.mainMenu();
			if (loginCheck == true)
				this.loginUtil.printLoginInfo();
			print.selectFunction();
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				borrowBookView();
				break;
			case 2:
				returnBookView();
				break;
			case 3:
				bookManagementView();
				break;
			case 4:
				memberManagementView();
				break;
			case 5:
				System.exit(0);
			case 6:
				this.loginCheck = loginUtil.logout();
				break;
			default :
				print.errorInput();
			}
		}
	}
	
	// 책 대여 화면
	private void borrowBookView() {
		while (true) {
			print.borrowBookMenu();
			print.selectFunction();
			int num = Integer.parseInt(this.sc.nextLine());
			switch (num) {
				case 1:
					this.bookManagementUtil.printBookList();
					this.bookBorrowUtil.bookBorrow();
					break;
				case 2:
					this.bookManagementUtil.printBookList();
					this.bookBorrowUtil.bookBorrow();
					break;
				case 3:
					return;
			}
		}
	}
	
	// 책 반납 화면
	private void returnBookView() {
		this.bookReturnUtil.bookReturn();
	}
	
	
	// 도서관리 화면
	private void bookManagementView() {
		print.accessAdmin();
		if(!this.loginCheckView())
			return;
		if(!LibraryManagement.loginMember.getGrade().equals("관리자")) {
			print.notAdmin();
			return;
		}
		while (true) {
			print.bookManagementMenu();
			print.selectFunction();
			int num = Integer.parseInt(this.sc.nextLine());
			switch (num) {
			case 1:
				this.bookManagementUtil.bookRegister();
				break;
			case 2:
				this.bookManagementUtil.printBookList();
				this.bookManagementUtil.bookRemove();
				break;
			case 3:
				return;
			}
		}
	}
	
	// 회원관리 화면
	private void memberManagementView() {
		if(!this.loginCheckView())
			return;
		while (true) {
			print.memberManagementMenu();
			print.selectFunction();
			int num = Integer.parseInt(this.sc.nextLine());
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				return;
			}
		}
	}

	// 로그인 화면
	private void loginView() {
		print.loginMenu();
		print.selectFunction();
		int num = Integer.parseInt(this.sc.nextLine());
		switch (num) {
		case 1:
			this.loginCheck = this.loginUtil.login();
			break;
		case 2:
			this.loginCheck = this.loginUtil.registration();
			break;
		case 3:
			return;
		}
	}
	
	// 로그인이 되었는지 확인하는 뷰
	private boolean loginCheckView() {
		if (!this.loginCheck) { // 로그인이 안되어 있을 경우
			print.accessLogin();
			char ch = sc.nextLine().charAt(0);

			if (ch == 'Y' || ch == 'y') {
				this.loginView();
			} else if (ch == 'N' || ch == 'n') {
				return false;
			} else {
				print.errorInput();
				return false;
			}
		}
		if (!this.loginCheck)
			return false;
		return true;
	}
}

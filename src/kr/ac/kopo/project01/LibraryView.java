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
	private MemberManagementUtil memberManagementUtil;
	private LoginUtil loginUtil;
	
	public LibraryView() {
		this.sc = new Scanner(System.in);
		this.loginCheck = false;
		this.libraryManagement = new LibraryManagement();
		this.bookManagement = new BookManagement();
		this.bookBorrowUtil = new BookBorrowUtil();
		this.bookReturnUtil = new BookReturnUtil();
		this.bookManagementUtil = new BookManagementUtil();
		this.memberManagementUtil = new MemberManagementUtil();
		this.loginUtil = new LoginUtil();
	}

	// 도서관 메인 화면
	public void mainMenu() {
		while (true) {
			print.mainMenu();
			if (loginCheck == true)
				this.loginUtil.printLogoutInfo();
			print.selectFunction();
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
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
			default:
				print.inputError();
			}
		}
	}
	
	// 책 대여 화면
	private void borrowBookView() {
		while (true) {
			print.borrowBookMenu();
			if(loginCheck == true)
				loginUtil.printLoginInfo();
			print.selectFunction();
			int num = Integer.parseInt(this.sc.nextLine());
			switch (num) {
				case 1:
					bookManagementUtil.printBookList();
					this.bookBorrowUtil.searchBook();
					break;
				case 2:
					if(!loginCheckView()) {
						break;
					}
					bookManagementUtil.printBookList();
					bookBorrowUtil.borrowBook();
					break;
				case 3:
					return;
			}
		}
	}
	
	// 책 반납 화면
	private void returnBookView() {
		if(!loginCheckView()) {
			return;
		}
		bookReturnUtil.bookReturn();
	}
	
	
	// 도서관리 화면
	private void bookManagementView() {
		if(!loginCheckView()) {
			print.adminAccessError();
			return;
		}
		if(!LibraryManagement.getLoginMember().getGrade().equals("관리자")) {
			print.adminAuthorityError();
			return;
		}
		while (true) {
			print.bookManagementMenu();
			loginUtil.printLoginInfo();
			print.selectFunction();
			int num = Integer.parseInt(this.sc.nextLine());
			switch (num) {
			case 1:
				bookManagementUtil.bookRegister();
				break;
			case 2:
				bookManagementUtil.printBookList();
				bookManagementUtil.bookRemove();
				break;
			case 3:
				return;
			}
		}
	}
	
	// 회원관리 화면
	private void memberManagementView() {
		if(!loginCheckView())
			return;
		while (true) {
			print.memberManagementMenu();
			loginUtil.printLoginInfo();
			print.selectFunction();
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				memberManagementUtil.changeMemberInfo();
				break;
			case 2:
				memberManagementUtil.withdrawMember();
				loginCheck = false;
				return;
			case 3:
				return;
			}
		}
	}

	// 로그인 화면
	private void loginView() {
		print.loginMenu();
		print.selectFunction();
		int num = Integer.parseInt(sc.nextLine());
		switch (num) {
		case 1:
			this.loginCheck = loginUtil.login();
			break;
		case 2:
			this.loginCheck = loginUtil.registration();
			break;
		case 3:
			return;
		}
	}
	
	// 로그인이 되었는지 확인하는 뷰
	private boolean loginCheckView() {
		if (!loginCheck) { // 로그인이 안되어 있을 경우
			print.accessLogin();
			char ch = sc.nextLine().charAt(0);

			if (ch == 'Y' || ch == 'y') {
				loginView();
			} else if (ch == 'N' || ch == 'n') {
				return false;
			} else {
				print.inputError();
				return false;
			}
		}
		if (!loginCheck)
			return false;
		return true;
	}
}

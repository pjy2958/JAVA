package kr.ac.kopo.project01;

public class print {
	public static void mainMenu() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<도서관 메인 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.대여하기 | 2.반납하기 | 3.도서관리 | 4.회원관리 | 5.종료 |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void borrowBookMenu() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<도서대출 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.책검색        | 2.책대출        | 3.메인메뉴         |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void bookManagementMenu() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<도서관리 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.책등록        | 2.책삭제        | 3.메인메뉴         |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void memberManagementMenu() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<회원관리 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.회원정보변경       | 2.회원탈퇴      | 3.메인메뉴      |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void loginMenu() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<로그인 메뉴>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 1.로그인        | 2.회원가입       | 3.메인메뉴        |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void bookInfo() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 번호 | 제목 \t       | 저자 \t  | 출판사 \t|");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void selectFunction() {System.out.print("* 기능을 선택하세요 : ");}
	public static void errorInput() {System.out.println("** 잘못입력하였습니다.");}
	public static void accessAdmin() {System.out.println("** 관리자만 접근 가능한 기능입니다.");}
	public static void notAdmin() {System.out.println("\n** 접근권한없음) 관리자가 아닙니다.");}
	public static void accessLogin() {System.out.print("\n* 로그인이 필요한 기능입니다. 로그인하시겠습니까?(Y/N) : ");}
	public static void resisterBook() {System.out.println("\n <도서등록 기능>");}
	public static void borrowBook() {System.out.println("\n <책대출 기능>");}
	public static void removeBook() {System.out.println("\n <도서삭제 기능>");}
	public static void returnBook() {System.out.println("** 대출한 책이 없습니다.");}
	public static void borrowBookMax() {System.out.println("** 책은 최대 5권까지 대출이 가능합니다.");}
	public static void borrowBookEnable() {System.out.println("** 책을 더이상 대출할 수 없습니다.");}
	public static void borrowBookExist() {System.out.println("** 대출중인 책입니다.");}
	public static void inputRemoveBookNum() {System.out.print("삭제할 책 번호를 입력하세요(취소 0) : ");}
	public static void inputBorrowBookNum() {System.out.print("* 대출할 책 번호를 입력하세요 : ");}
	public static void bookName() {System.out.print("* 제목 : ");}
	public static void bookWriter() {System.out.print("* 저자 : ");}
	public static void bookPublisher() {System.out.print("* 출판사 : ");}
	public static void pass() {System.out.printf("");}
}

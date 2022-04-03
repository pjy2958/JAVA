package kr.ac.kopo.project01;

import java.util.Objects;
import java.util.Scanner;

public class BookManagementUtil {
	
	private Scanner sc;
	private int pivotIndex;	// 책등록시 위치를 알려주는 변수
	
	public BookManagementUtil() {
		this.sc = new Scanner(System.in);
		this.pivotIndex = BookManagement.bookList.size();
	}

	// 책등록 기능
	public void bookRegister() {
		System.out.println("\n <도서등록 기능>");
		System.out.print("* 제목 : ");
		String bookName = sc.nextLine();
		System.out.print("* 저자 : ");
		String bookWriter = sc.nextLine();
		System.out.print("* 출판사 : ");
		String publisher = sc.nextLine();
		
		this.searchPivot();
		Book newBook = new Book(bookName, bookWriter, publisher, pivotIndex + 1);
		if (this.pivotIndex < BookManagement.bookList.size()) {
			BookManagement.bookList.set(this.pivotIndex, newBook);
		} else
			BookManagement.bookList.add(newBook);
	}
	
	// 책 삭제 기능
	public void bookRemove() {
		System.out.println("\n <도서삭제 기능>");
		System.out.print("삭제할 책 번호를 입력하세요(취소 0) : ");
		int bookNumber = Integer.parseInt(sc.nextLine());
		
		if(bookNumber == 0)
			return;
		BookBorrowUtil bookBorrowUtil = new BookBorrowUtil();
		if(bookBorrowUtil.isBookBorrow(bookNumber)) {	// 책이 대출중인지 확인
			System.out.println("** 대출중인 도서입니다.");
			return;
		}
		
		BookManagement.bookList.set(bookNumber - 1, null);
	}
	
	// 리스트 내의 빈 공간을 찾는 기능
	public void searchPivot() {
		for(int i = 0; i < BookManagement.bookList.size(); i++) {
			if(Objects.isNull(BookManagement.bookList.get(i))){
				this.pivotIndex = i;
				return;
			}
		}
		this.pivotIndex = BookManagement.bookList.size();
	}
	
	// 전체도서출력 기능
	public void printBookList() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 번호 | 제목 \t       | 저자 \t  | 출판사 \t|");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < BookManagement.bookList.size(); i++) {
			Book newBook = BookManagement.bookList.get(i);
			if(newBook == null) {
				System.out.printf("");
			} else {
				System.out.printf("   %03d  %-15s%-10s%-10s\n", newBook.getBookNumber(), newBook.getBookName(), newBook.getBookWriter(), newBook.getPublisher());
			}
		}
	}
}

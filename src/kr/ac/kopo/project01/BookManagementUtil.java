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
		print.resisterBook();
		print.bookName();
		String bookName = sc.nextLine();
		print.bookWriter();
		String bookWriter = sc.nextLine();
		print.bookPublisher();
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
		print.removeBook();
		print.inputRemoveBookNum();
		int bookNumber = Integer.parseInt(sc.nextLine());
		
		if(bookNumber == 0)
			return;
		BookBorrowUtil bookBorrowUtil = new BookBorrowUtil();
		if(bookBorrowUtil.isBookBorrow(bookNumber)) {	// 책이 대출중인지 확인
			print.borrowBookExist();
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
		print.bookInfo();
		for(int i = 0; i < BookManagement.bookList.size(); i++) {
			Book newBook = BookManagement.bookList.get(i);
			if(newBook == null) {
				print.pass();
			} else {
				System.out.printf("   %03d  %-15s%-10s%-10s\n", newBook.getBookNumber(), newBook.getBookName(), newBook.getBookWriter(), newBook.getPublisher());
			}
		}
	}
}

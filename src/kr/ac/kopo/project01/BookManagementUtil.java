package kr.ac.kopo.project01;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
/*
 * 도서 관리 기능
 */

public class BookManagementUtil {
	private Scanner sc;
	private List<Book> bookList;
	private int pivotIndex;	// 책등록시 위치를 알려주는 변수

	public BookManagementUtil() {
		this.sc = new Scanner(System.in);
		this.bookList = BookManagement.getBookList();
		this.pivotIndex = this.bookList.size();
	}

	// 책등록 기능
	public void bookRegister() {
		print.resisterBook();
		print.inputBookName();
		String bookName = sc.nextLine();
		print.inputBookWriter();
		String bookWriter = sc.nextLine();
		print.inputBookPublisher();
		String publisher = sc.nextLine();

		searchPivot();
		Book newBook = new Book(bookName, bookWriter, publisher, pivotIndex + 1);
		if (pivotIndex < bookList.size()) {
			bookList.set(pivotIndex, newBook);
		} else
			bookList.add(newBook);
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

		bookList.set(bookNumber - 1, null);
	}

	// 리스트 내의 빈 공간을 찾는 기능
	public void searchPivot() {
		for(int i = 0; i < bookList.size(); i++) {
			if(Objects.isNull(bookList.get(i))){
				pivotIndex = i;
				return;
			}
		}
		pivotIndex = bookList.size();
	}

	// 전체도서출력 기능
	public void printBookList() {
		if (bookList.size() == 0){
			print.nonexistBook();
			return;
		}
		print.bookInfo();
		for(int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if(book == null) {
				print.pass();
			} else {
				System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(), book.getBookWriter(), book.getPublisher());
			}
		}
	}
}

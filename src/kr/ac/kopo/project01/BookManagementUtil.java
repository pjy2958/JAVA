package kr.ac.kopo.project01;

import java.util.Scanner;
import java.util.Objects;

public class BookManagementUtil {
	
	private Scanner sc;
	private int pivotIndex;	// 책등록시 위치를 알려주는 변수
	
	public BookManagementUtil() {
		this.sc = new Scanner(System.in);
		this.pivotIndex = BookManagement.bookList.size();
	}

	// 책등록 기능
	public void bookRegister() {
		System.out.println("\n----------<책등록>----------");
		System.out.print("* 제목 : ");
		String bookName = sc.nextLine();
		System.out.print("* 저자 : ");
		String bookWriter = sc.nextLine();
		System.out.print("* 출판사  : ");
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
		this.printBookList();
		System.out.println("책삭제기능-------------");
		System.out.println("삭제할 책 번호를 입력하세요(취소 0) : ");
		int bookNumber = Integer.parseInt(sc.nextLine());
		if(bookNumber == 0)
			return;
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
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| 번호 |\t제목\t\t|\t저자\t| 출판사 |");
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < BookManagement.bookList.size(); i++) {
			Book newBook = BookManagement.bookList.get(i);
			if(newBook == null) {
				System.out.printf("  %03d  삭제됌----------------------------\n", i + 1);
			} else {
				System.out.printf("  %03d  %-10s%-5s%-10s\n", i + 1, newBook.getBookName(), newBook.getBookWriter(), newBook.getPublisher());
			}
		}
	}

}

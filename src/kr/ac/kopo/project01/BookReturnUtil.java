package kr.ac.kopo.project01;

import java.util.Scanner;

public class BookReturnUtil {
	
	private Scanner sc;
	public BookReturnUtil() {
		this.sc = new Scanner(System.in);
	}


	// 책 반납 기능
	public void bookReturn() {
		System.out.println(" <도서반납 기능>");
		if(!BookManagement.bookBorrowMap.containsKey(LibraryManagement.loginMember.getMemberNumber())) {	// 책을 대출하지 않은 경우
			print.returnBook();
			return;
		}
		this.printBorrowBook();
		
		System.out.print("** 반납할 책 번호를 입력하세요(취소 0) : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num == 0)
			return;
		int pivot = this.bookPivot(num);
		
		if(pivot == 10) {
			System.out.println("책 번호를 잘못 입력했습니다.");
			return;
		}
		BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[pivot] = 0;
		BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[pivot + 1] = 0;
		
		// 반납할 책이 없다면 key, value 삭제
		for(int i = 0; i < BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber()).length; i+=2) {
			if(BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[i] != 0)
				return;
		}
		BookManagement.bookBorrowMap.remove(LibraryManagement.loginMember.getMemberNumber());
	}
	
	// 리스트에서 삭제할 책의 위치를 찾아오는 기능
    public int bookPivot(int num){
    	int[] borrowInfo = BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber());
        for(int i = 0; i < borrowInfo.length; i+=2) {
        	if(borrowInfo[i] == num)
        		return i;
        }
        return 10;
    }
    
	// 현재 빌린책목록 출력
	public void printBorrowBook() {
		System.out.println(" " + LibraryManagement.loginMember.getName() + "님이 대출한 도서 목록");
		print.bookInfo();
		for(int i = 0; i < BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber()).length; i+=2) {
			int bookNum = BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[i];
			if (BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[i] == 0)
				System.out.print("");
			else {
				Book book = BookManagement.bookList.get(bookNum - 1);
				if (book == null)
					System.out.print("");
				else
					System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(),
							book.getBookWriter(), book.getPublisher());
			}
		}
		for(int i = 0; i < BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber()).length; i++) {
			System.out.print(BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[i] + " ");
		}
	}
}

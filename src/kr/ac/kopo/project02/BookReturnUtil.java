package kr.ac.kopo.project02;

import java.util.Map;
import java.util.Scanner;
/*
 *  도서 반납 기능 
 */

public class BookReturnUtil {
	private Scanner sc;
	private Map<Integer, int[]> bookBorrowMap;
	private Member loginMember;
	
	public BookReturnUtil() {
		this.sc = new Scanner(System.in);
		this.bookBorrowMap = BookManagement.getBookBorrowMap();
		this.loginMember = LibraryManagement.getLoginMember();
	}

	// 책 반납 기능
	public void bookReturn() {
		print.returnBook();
		int memberNum = loginMember.getMemberNumber();
		if(!bookBorrowMap.containsKey(memberNum)) {	// 책을 대출하지 않은 경우
			print.nonexistReturnBook();
			return;
		}
		printBorrowBook();
		
		print.inputReturnBookNum();
		int num = Integer.parseInt(sc.nextLine());
		if(num == 0)
			return;
		int pivot = bookPivot(num);
		
		if(pivot == 10) {
			print.inputError();
			return;
		}
		bookBorrowMap.get(memberNum)[pivot] = 0;
		bookBorrowMap.get(memberNum)[pivot + 1] = 0;
		
		// 반납할 책이 없다면 key, value 삭제
		for(int i = 0; i < bookBorrowMap.get(memberNum).length; i+=2) {
			if(bookBorrowMap.get(memberNum)[i] != 0)
				return;
		}
		bookBorrowMap.remove(memberNum);
	}
	
	// 리스트에서 삭제할 책의 위치를 찾아오는 기능
    public int bookPivot(int num){
    	int memberNum = loginMember.getMemberNumber();
    	int[] borrowInfo = bookBorrowMap.get(memberNum);
        for(int i = 0; i < borrowInfo.length; i+=2) {
        	if(borrowInfo[i] == num)
        		return i;
        }
        return 10;
    }
    
	// 현재 빌린책목록 출력
	public void printBorrowBook() {
		System.out.println(" " + loginMember.getName() + "님이 대출한 도서 목록");
		print.bookInfo();
		int memberNum = loginMember.getMemberNumber();
		for(int i = 0; i < bookBorrowMap.get(memberNum).length; i+=2) {
			int bookNum = bookBorrowMap.get(memberNum)[i];
			if (bookBorrowMap.get(memberNum)[i] == 0)
				System.out.print("");
			else {
				Book book = BookManagement.getBookList().get(bookNum - 1);
				if (book == null)
					System.out.print("");
				else
					System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(),
							book.getBookWriter(), book.getPublisher());
			}
		}
	}
}

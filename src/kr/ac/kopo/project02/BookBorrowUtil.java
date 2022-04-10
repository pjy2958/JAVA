package kr.ac.kopo.project02;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * 도서 대출 기능
 */

public class BookBorrowUtil {
    private Scanner sc;
    private Map<Integer, int[]> bookBorrowMap;
    private List<Book> bookList;
    private Member loginMember;

    BookBorrowUtil(){
        this.sc = new Scanner(System.in);
        this.bookBorrowMap = BookManagement.getBookBorrowMap();
        this.bookList = BookManagement.getBookList();
        this.loginMember = LibraryManagement.getLoginMember();
    }
    
    // 책 검색 기능
    public void searchBook() {
		print.searchBook();
		print.inputBookName();
		String bookName = sc.nextLine();
		print.inputBookWriter();
		String bookWriter = sc.nextLine();
		System.out.println();
		if (bookName == "" && bookWriter == "")		// 책제목, 저자를 안쓴경우
			return;
		if (bookName == "") {	// 저자만 입력한 경우
			for (int i = 0; i < bookList.size(); i++) {
				Book book = bookList.get(i);
				if (book.getBookWriter().equals(bookWriter))
					System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(),
							book.getBookWriter(), book.getPublisher());
			}
		} else if (bookWriter == "") {	// 책제목만 입력한 경우
			for (int i = 0; i < bookList.size(); i++) {
				Book book = bookList.get(i);
				if (book.getBookName().equals(bookName))
					System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(),
							book.getBookWriter(), book.getPublisher());
			}

		} else {		// 책제목, 저자를 모두 입력한 경우
			for (int i = 0; i < bookList.size(); i++) {
				Book book = bookList.get(i);
				if (book.getBookName().equals(bookName) && book.getBookWriter().equals(bookWriter))
					System.out.printf("   %03d  %-15s%-10s%-10s\n", book.getBookNumber(), book.getBookName(),
							book.getBookWriter(), book.getPublisher());
			}
		}
	}
    
    // 책 대출 기능
    public void borrowBook() {
    	print.borrowBook();
    	print.borrowBookMax();
        print.inputBorrowBookNum();
        int bookNum = Integer.parseInt(sc.nextLine());
        if(isBookBorrow(bookNum)){
            print.borrowBookExist();
            return;
        }
        int pivot = bookPivot();	// Map의 value의 리스트에 책의 정보넣을 자리
        if(pivot == 10) {
            print.borrowBookEnable();
            return;
        }
        int memberNum = loginMember.getMemberNumber();
        if(pivot == 0) {
            int[] bookBorrowArr = new int[10];
            bookBorrowArr[0] = bookNum;
            bookBorrowArr[1] = bookNum;
            bookBorrowMap.put(memberNum, bookBorrowArr);
            return;
        }
        bookBorrowMap.keySet();
        bookBorrowMap.get(memberNum)[pivot] = bookNum;
        bookBorrowMap.get(memberNum)[pivot + 1] = bookNum;	// 날짜
    }
    
    // Map value의 데이터 넣을 위치 정하는 기능
    public int bookPivot(){
        Map <Integer, int[]> bookMap = bookBorrowMap;
        if(bookMap == null)
            return 0;
        if(!bookMap.containsKey(loginMember.getMemberNumber())) {
           return 0;
       } else {
            for (Integer key : bookMap.keySet()) {
                for (int i = 0; i < bookMap.get(key).length; i += 2) {
                    if (bookMap.get(key)[i] == 0)
                        return i;
                }
            }
        }
        return 10;
    }

    // 챽이 대여 중인지 확인하는 기능  대여중이면 true
    public boolean isBookBorrow(int bookNum) {
        Map <Integer, int[]> bookMap = bookBorrowMap;
        if(bookMap == null)
            return false;
        for(Integer key : bookMap.keySet()){
            for(int i = 0; i < bookMap.get(key).length; i+=2){
                if(bookMap.get(key)[i] == bookNum)
                    return true;
            }
        }
        return false;
    }
}

package kr.ac.kopo.project01;

import java.util.Map;
import java.util.Scanner;

public class BookBorrowUtil {
    private Scanner sc;

    BookBorrowUtil(){
        this.sc = new Scanner(System.in);
    }
    
    // 책 대출 기능
    public void bookBorrow() {
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
        if(pivot == 0) {
            int[] bookBorrowArr = new int[10];
            bookBorrowArr[0] = bookNum;
            bookBorrowArr[1] = bookNum;
            BookManagement.bookBorrowMap.put(LibraryManagement.loginMember.getMemberNumber(), bookBorrowArr);
            return;
        }
        BookManagement.bookBorrowMap.keySet();
        BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[pivot] = bookNum;
        BookManagement.bookBorrowMap.get(LibraryManagement.loginMember.getMemberNumber())[pivot + 1] = bookNum;	// 날짜
    }
    
    // Map value의 데이터 넣을 위치 정하는 기능
    public int bookPivot(){
        Map <Integer, int[]> bookMap = BookManagement.bookBorrowMap;
        if(bookMap == null)
            return 0;
        if(!bookMap.containsKey(LibraryManagement.loginMember.getMemberNumber())) {
           return 0;
       } else {
            for (Integer key : bookMap.keySet()) {      // 아마 keyset오류생길듯
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
        Map <Integer, int[]> bookMap = BookManagement.bookBorrowMap;
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

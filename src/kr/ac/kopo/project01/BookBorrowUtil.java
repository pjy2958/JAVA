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
    	System.out.println("\n <책대출 기능>");
    	System.out.println("** 책은 최대 5권까지 대출이 가능합니다.");
        System.out.print("* 대출할 책 번호를 입력하세요 : ");
        int bookNum = Integer.parseInt(sc.nextLine());
        if(isBookBorrow(bookNum)){
            System.out.println("** 대출중인 책입니다.");
            return;
        }
        int pivot = bookPivot();	// Map의 value의 리스트에 책의 정보넣을 자리
        if(pivot == 10) {
            System.out.println("** 책을 더이상 대출할 수 없습니다.");
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

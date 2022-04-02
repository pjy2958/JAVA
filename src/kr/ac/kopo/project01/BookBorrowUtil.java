package kr.ac.kopo.project01;

import java.util.Scanner;

public class BookBorrowUtil {
    Scanner sc;

    BookBorrowUtil(){
        this.sc = new Scanner(System.in);
    }

    public void bookBorrow(){
        System.out.println("대출할 책 번호를 입력하세요 : ");
        int bookNum = Integer.parseInt(sc.nextLine());
    }

    // 챽이 대여 중인지 확인하는 기능  대여중이면 true
    public boolean isBookBorrow(int bookNum) {
        boolean borrowCheck = false;
//        BookManagement.bookBorrowMap.forEach((key, value) -> {
//            if(value.length == 0){
//                if(Integer.valueOf(value[0]) == bookNum)
////                    borrowCheck = true;
//            } else {
//                for (int i = 0; i < value.length; i+=2) {
//                    if (Integer.valueOf(value[i]) == bookNum)
////                        borrowCheck = true;
//                }
//            }
//        });
        borrowCheck = true;
        return borrowCheck;
    }
}

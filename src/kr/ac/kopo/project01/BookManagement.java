package kr.ac.kopo.project01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagement {
    public static List<Book> bookList; // 책 리스트
    private String[] borrowList;  // 빌린책번호, 빌린날짜를 저장하는 배열
    public static Map<Integer, String[]> bookBorrowMap; // 회원번호-빌린책 HashMap
    BookManagement(){
        this.bookList = new ArrayList();
        this.borrowList = new String[10]; // 개인당 총5권까지만 대출가능
        this.bookBorrowMap = new HashMap<>();
    }
}

package kr.ac.kopo.project01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagement {
    public static List<Book> bookList; // 책 리스트
    public static Map<Integer, int[]> bookBorrowMap; // 회원번호-빌린책 HashMap
    BookManagement(){
        this.bookList = new ArrayList();
        this.bookBorrowMap = new HashMap<>();
    }
    
    
}
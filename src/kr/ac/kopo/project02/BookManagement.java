package kr.ac.kopo.project02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagement {
    private static List<Book> bookList; // 책 리스트
    private static Map<Integer, int[]> bookBorrowMap; // 회원번호-빌린책 HashMap
    private FileIO file;
    
    BookManagement(){
        this.bookList = new ArrayList();
        this.bookBorrowMap = new HashMap<>();
        this.file = new FileIO();
        this.file.fileRead(bookList);
    }
    
	public static List<Book> getBookList() {
		return bookList;
	}
	
	public static Map<Integer, int[]> getBookBorrowMap() {
		return bookBorrowMap;
	}
}
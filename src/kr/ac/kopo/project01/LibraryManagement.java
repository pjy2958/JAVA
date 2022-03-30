package kr.ac.kopo.project01;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
	public static List<Member> memberList;	// 회원 리스트
	public static List<Book> bookList;	// 책 리스트
	public static Member loginMember;	// 현재 로그인중인 회원
	
	public LibraryManagement() {
		this.memberList = new ArrayList();
		this.bookList = new ArrayList();
	}
} 

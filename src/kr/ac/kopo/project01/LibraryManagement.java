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
		this.manager();
	}
	
	// 관리자를 회원리스트 0번으로 설정
	private void manager() {
		Member manager = new Member("root", "0000", "박준영", 0);	// 관리자
		manager.setGrade("관리자");
		this.memberList.add(manager);
		
	}
} 

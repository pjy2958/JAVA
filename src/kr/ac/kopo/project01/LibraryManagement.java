package kr.ac.kopo.project01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
	private Scanner sc;
	private List<Member> memberList;	// 회원 리스트
	private List<Book> bookList;	// 책 리스트
	public LibraryManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.memberList = new ArrayList();
		this.bookList = new ArrayList();
	}
	
	public List<Member> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}

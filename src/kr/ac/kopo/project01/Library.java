package kr.ac.kopo.project01;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Member> memberList;	// 회원 리스트
	private List<Book> bookList;	// 책 리스트
	public Library() {
		super();
		this.memberList = new ArrayList();
		this.bookList = new ArrayList();
	}
}

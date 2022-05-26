package kr.ac.kopo.project02;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
	private static List<Member> memberList;	// 회원 리스트
	private static Member loginMember;	// 현재 로그인중인 회원
	

	public LibraryManagement() {
		this.memberList = new ArrayList();
		this.loginMember = new Member();
		this.manager();
	}

	// 관리자를 회원리스트 0번으로 설정
	private void manager() {
		Member manager = new Member("admin", "admin", "박준영", 0);	// 관리자
		manager.setGrade("관리자");
		memberList.add(manager);
	}
	
	public static List<Member> getMemberList() {
		return memberList;
	}
	
	public static Member getLoginMember() {
		return loginMember;
	}

	public static void setLoginMember(Member loginMember) {
		LibraryManagement.loginMember = loginMember;
	}
	
} 
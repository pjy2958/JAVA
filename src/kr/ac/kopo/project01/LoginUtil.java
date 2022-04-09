package kr.ac.kopo.project01;

import java.util.List;
import java.util.Scanner;
/*
 *  로그인 기능
 */

public class LoginUtil {
	private Scanner sc;
	private List<Member> memberList;
	private Member loginMember;
	
	// 생성자
	public LoginUtil() {
		this.sc = new Scanner(System.in);
		this.memberList = LibraryManagement.getMemberList();
		this.loginMember = LibraryManagement.getLoginMember();
	}
	
	// 로그인 기능
	public boolean login() {
		// 회원의 id, passward가 존재하는지 확인
		print.login();
		print.inputMemberId();
		String id = sc.nextLine();
		print.inputMemberPassward();
		String passward = sc.nextLine();
		
		if(checkIdPassward(id, passward)) {
			loginMember = LibraryManagement.getLoginMember();
			System.out.println("** " + loginMember.getName() + "님 환영합니다!! **");
			return true;
		}
		return false;
	}
	
	// 로그아웃 기능
	public boolean logout() {
		print.doneLogout();
		loginMember = null;
		return false;
	}
	
	// 회원가입 기능
	public boolean registration() {
		print.resisterMember();
		print.inputResisterMemberId();
		String id = sc.nextLine();
		
		if(id == "") {
			print.notinputMemberId();
			return false;
		}
		// 리스트에서 아이디 중복확인
		if (existId(id)) {
			return false;
		}
		print.inputResisterMemberPassward();
		String passward = sc.nextLine();
		if(passward == "") {
			print.notinputMemberPassward();
			return false;
		}
		// 패스워드 재확인
		print.inputResisterPasswardCheck();
		String checkPassward = sc.nextLine();
		if(!passward.equals(checkPassward)) {
			print.notaccordPassward();
			return false;
		}
		print.inputResisterMemberName();
		String name = sc.nextLine();
		if(name == "") {
			print.notinputMemberName();
			return false;
		}
		print.inputResisterMemberPhone();
		String phoneNumber = sc.nextLine();
		
		int index = searchIndex();
		
		// 전화번호를 입력한 경우
		if(phoneNumber == "") {
			Member newMember = new Member(id, passward, name, index);
			if (index == memberList.size()) {
				memberList.add(newMember);
			} else {
				memberList.set(index, newMember);
			}
			LibraryManagement.setLoginMember(newMember);
			loginMember = LibraryManagement.getLoginMember();
			System.out.println("** " + newMember.getName() + "님 환영합니다!! **");
			return true;
		}
		// 전화번호를 입력하지 않은 경우
		Member newMember = new Member(id, passward, name, Integer.valueOf(phoneNumber),index);
		if (index == memberList.size()) {
			memberList.add(newMember);
		} else {
			memberList.set(index, newMember);
		}
		LibraryManagement.setLoginMember(newMember);
		loginMember = LibraryManagement.getLoginMember();
		System.out.println(newMember.getMemberNumber());
		System.out.println("** " + newMember.getName() + "님 환영합니다!! **");
		return true;
	}
	
	// id가 존재하는가? -> 회원가입시 사용
	public boolean existId(String id) {
		// 회원리스트에서 동일 아이디가 있는 경우
		for(int i = 0; i < memberList.size(); i++) {	// 회원리스트 크기만큼 반복
			if (memberList.get(i) != null) {
				if (memberList.get(i).getId().equals(id)) {
					print.existMemberId();
					return true;
				}
			}
		}
		return false;
	}
	
	// 신규회원이 들어갈 인덱스 찾기
	public int searchIndex() {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i) == null) {
				return i;
			}
		}
		return memberList.size();
	}
	
	// 회원 리스트에서 id passward 검색 -> 로그인시 사용
	public boolean checkIdPassward(String id, String passward) {
		for(int i = 0; i < memberList.size(); i++) {	// 회원리스트 크기만큼 반복
			if (memberList.get(i) != null) {
				Member loginMember = memberList.get(i); // 배열의 해당 인덱스 객체를 loginMember에 저장
				if (loginMember.getId().equals(id)) { // id가 같은 경우
					if (loginMember.getPassward().equals(passward)) { // passward 확인
						LibraryManagement.setLoginMember(loginMember);
						return true;
					} else {
						print.inputPasswardError();
						return false;
					}
				}
			}
		}
		print.nonexistMemberId();
		return false;
	}
	
	// 로그인 정보 출력
		public void printLoginInfo() {
			System.out.println("[" + loginMember.getGrade() + ")" + loginMember.getName() + "님 접속중]");
		}
		
	// 로그아웃 기능 정보 출력
	public void printLogoutInfo() {
		System.out.println("[" + loginMember.getGrade() + ")" + loginMember.getName() + "님 접속중] 로그아웃을 하시려면 6번을 입력하세요. **");
	}
} 

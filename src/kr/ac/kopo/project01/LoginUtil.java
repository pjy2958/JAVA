package kr.ac.kopo.project01;

import java.util.Scanner;

public class LoginUtil {
	private Scanner sc;
	private int indexNum;	// 회원가입 시 저장할 리스트의 인덱스번호

	public LoginUtil() {
		this.sc = new Scanner(System.in);
		this.indexNum = 0;
	}
	
	// 로그인 기능
	public boolean login() {
		// 회원의 id, passward가 존재하는지 확인
		System.out.print("* 회원 id : ");
		String id = sc.nextLine();
		System.out.print("* 회원 passward : ");
		String passward = sc.nextLine();
		
		if(this.checkIdPassward(id, passward)) {
			System.out.println("** " + LibraryManagement.loginMember.getName() + "님 환영합니다!! **");
			return true;
		}
		return false;
	}
	
	// 로그아웃 기능
	public boolean logout() {
		System.out.println("** 로그아웃하였습니다.");
		LibraryManagement.loginMember = null;
		return false;
	}
	
	// 회원가입 기능
	public boolean registration() {
		System.out.println("\n ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ<회원 가입>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("* (필수항목) id 입력 : ");
		String id = sc.nextLine();
		
		if(id == "") {
			System.out.println("** id는 필수입력항목입니다.");
			return false;
		}
		// 리스트에서 아이디 중복확인
		if (this.existId(id)) {
			return false;
		}
		System.out.print("* (필수항목) passward 입력 : ");
		String passward = sc.nextLine();
		if(passward == "") {
			System.out.println("** passward는 필수입력항목입니다.");
			return false;
		}
		// 패스워드 재확인
		System.out.print("* (필수항목) passward 확인 : ");
		String checkPassward = sc.nextLine();
		if(!passward.equals(checkPassward)) {
			System.out.println("** 입력하신 passward가 일치하지 않습니다.");
			return false;
		}
		System.out.print("* (필수항목) 이름 입력 : ");
		String name = sc.nextLine();
		if(name == "") {
			System.out.println("** 이름은 필수입력항목입니다.");
			return false;
		}
		System.out.print("* (선택항목) 전화번호(숫자만) 입력 : ");
		String phoneNumber = sc.nextLine();
		// 전화번호를 입력한 경우
		if(phoneNumber == "") {
			Member newMember = new Member(id, passward, name, this.indexNum + 1);
			LibraryManagement.memberList.add(newMember);
			LibraryManagement.loginMember = newMember;
			System.out.println("** " + newMember.getName() + "님 환영합니다!! **");
			return true;
		}
		// 전화번호를 입력하지 않은 경우
		Member newMember = new Member(id, passward, name, Integer.valueOf(phoneNumber),this.indexNum + 1);
		LibraryManagement.memberList.add(newMember);
		LibraryManagement.loginMember = newMember;
		System.out.println("** " + newMember.getName() + "님 환영합니다!! **");
		return true;
	}
	
	// id가 존재하는가? -> 회원가입시 사용
	public boolean existId(String id) {
		// 리스트에 객체가 하나도 없을 경우
		if(this.indexNum == 0) {
			this.indexNum++;
			return false;
		}
		
		// 회원리스트에서 동일 아이디가 있는 경우
		for(int i = 0; i < LibraryManagement.memberList.size(); i++) {	// 회원리스트 크기만큼 반복
			if(LibraryManagement.memberList.get(i).getId().equals(id)) {
				System.out.println("** 이미 존재하는 id입니다.");
				return true;
			}
		}
		
		// 리스트에 동일 아이디가 없는 경우
		this.indexNum = LibraryManagement.memberList.size();
		return false;
	}
	
	// 회원 리스트에서 id passward 검색 -> 로그인시 사용
	public boolean checkIdPassward(String id, String passward) {
		for(int i = 0; i < LibraryManagement.memberList.size(); i++) {	// 회원리스트 크기만큼 반복
			Member loginMember = LibraryManagement.memberList.get(i);	// 배열의 해당 인덱스 객체를 loginMember에 저장
			if(loginMember.getId().equals(id)) {	// id가 같은 경우
				if(loginMember.getPassward().equals(passward)) {	// passward 확인
					LibraryManagement.loginMember = loginMember;	// 현재 로그인한 회원 저장
					return true;
				} else {
					System.out.println("** 입력하신 passward가 틀렸습니다.");
					return false;
				}
			}
		}
		System.out.println("** 입력하신 id가 존재하지 않습니다.");
		return false;
	}
	
	// 현재 로그인한 회원의 이름 출력
	public void printLoginInfo() {
		System.out.println("[" + LibraryManagement.loginMember.getName() + "님 접속중] 로그아웃을 하시려면 6번을 입력하세요. **");
	}
} 

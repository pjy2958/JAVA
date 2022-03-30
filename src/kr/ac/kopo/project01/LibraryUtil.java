package kr.ac.kopo.project01;

import java.util.List;
import java.util.Scanner;

public class LibraryUtil {
	private Scanner sc;
	private LibraryManagement library;	// 도서관

	public LibraryUtil() {
		this.sc = new Scanner(System.in);
		this.library = new LibraryManagement();
	}
	
	// 로그인 기능
	public boolean login() {
		System.out.println("로그인 시스템---------------");
		System.out.print("회원 id : ");
		String id = sc.nextLine();
		System.out.print("회원 passward : ");
		int passward = Integer.parseInt(this.sc.nextLine());
		
		// 메소드화 시키기 ---------------------------------------------------------------
		List<Member> list = this.library.getMemberList();	// 회원정보 배열
		int arraySize = list.size();	// 회원정보 배열 크기
		// 회원의 id, passward가 존재하는지 확인
		for(int i = 0; i < arraySize; i++) {
			if(list.get(i).getId() == id && list.get(i).getPassward() == passward) {
				System.out.println(list.get(i).getName() + "님 환영합니다.!!");
				return true;
			}
		}
		
		System.out.println("회원 정보가 없습니다.");
		System.out.print("회원가입하시겠습니까? (Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y')
			this.registration();
		else if(ch == 'N' || ch == 'n') {
			System.out.println("메인 메뉴로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("메인 메뉴로 돌아갑니다.");
		} 
		return false;
		// --------------------------------------------------------------------------
	}
	
	// 회원가입 기능
	public void registration() {
		System.out.println("<회원가입--------------------------------->");
		System.out.print("회원 id(필수) :");
		String id = sc.nextLine();
		System.out.print("회원 passward(필수) :");
		int passward = Integer.parseInt(sc.nextLine());
		System.out.print("회원 이름(필수) :");
		String name = sc.nextLine();
		System.out.print("회원 전화번호(숫자만입력, 선택) :");
		int phoneNumber = Integer.parseInt(sc.nextLine());
		
		this.library.getMemberList().add(new Member(id, passward, name, phoneNumber, 1));
	}
	
	// id가 존재하는가?
	public boolean checkID() {
		
		return true;
	}

	public boolean checkPassward() {

		return true;
	}
} 

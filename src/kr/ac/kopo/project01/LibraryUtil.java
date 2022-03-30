package kr.ac.kopo.project01;

import java.util.List;
import java.util.Scanner;

public class LibraryUtil {
	private LibraryManagement library;	// 도서관

	public LibraryUtil() {
		this.library = new LibraryManagement();
	}
	
	// 로그인 기능
	public boolean login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로그인 시스템---------------");
		System.out.print("회원 id : ");
		String id = sc.nextLine();
		System.out.print("회원 passward : ");
		int passward = Integer.parseInt(sc.nextLine());
		
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
		// -------------------------------------------------------------------------
		
		System.out.println("회원 정보가 없습니다.");
		System.out.print("회원가입하시겠습니까? (Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y')
			System.out.println();
		else if(ch == 'N' || ch == 'n') {
			System.out.println("메인 메뉴로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("메인 메뉴로 돌아갑니다.");
		} 
		return false;
	}
	
	// 회원가입 기능
	public void registration() {
		System.out.println("회원가입 시스템 --------------");
		System.out.print("id 입력 : ");
	}
	
	// id가 존재하는가?
	public boolean isID() {
		return true;
	}
} 

package kr.ac.kopo.project02;

import java.util.List;
import java.util.Scanner;
/*
 *  회원 정보 관리 기능
 */

public class MemberManagementUtil {
	private Scanner sc;
	private List<Member> memberList;
	private Member loginMember;
	
	// 생성자
	public MemberManagementUtil() {
		this.sc = new Scanner(System.in);
		this.memberList = LibraryManagement.getMemberList();
	}
	
	
	// 회원정보 수정 기능
	public void changeMemberInfo() {
		loginMember = LibraryManagement.getLoginMember();
		print.changeMemberInfo();
		print.inputMemberInfo();
		int num = Integer.parseInt(sc.nextLine());
		
		if(num == 1) {
			print.inputResisterMemberPassward();
			String newPassward = sc.nextLine();
			print.inputResisterPasswardCheck();
			String checkPassward = sc.nextLine();
			if(newPassward != checkPassward)
				loginMember.setPassward(newPassward);
			else
				print.notaccordPassward();
		} else if(num == 2) {
			print.inputChangePhoneNumber();
			int newPhoneNumber = Integer.parseInt(sc.nextLine());
			loginMember.setPhoneNumber(newPhoneNumber);
		} else {
			print.inputError();
		}
	}
	

	// 회원탈퇴 기능
	public void withdrawMember() {
		loginMember = LibraryManagement.getLoginMember();
		memberList.set(loginMember.getMemberNumber(), null);
		loginMember = null;
	}
}

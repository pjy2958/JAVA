package kr.ac.kopo.project01;

import java.util.Scanner;

public class Login {
		private Scanner sc;
		
		
	public Login() {
			this.sc = new Scanner(System.in);
		}


	public void loginView() {
		System.out.println("로그인-------------");
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("passward : ");
		int passward = Integer.parseInt(sc.nextLine());
	}
	
	public void login(String id, int passward) {
		
	}
}

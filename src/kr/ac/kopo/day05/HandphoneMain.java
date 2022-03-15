package kr.ac.kopo.day05;

class Handphone{		// Main메소드 위에 클래스를 만들때는 public 사용불가; 잘 사용하지않는 방법
	String name;		// 실사용자명
	String phoneNumber;	// 핸드폰번호
	String company;		// 제조사
	
}

public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp01 = new Handphone();
		hp01.name = "홍길동";
		hp01.phoneNumber = "010-xxxx-xxxx";
		hp01.company = "SAMSUNG";
		
		Handphone hp02 = new Handphone();
		hp02.name = "강길동";
		hp02.phoneNumber = "010-xxxx-xxx1";
		hp02.company = "APPLE";
		
		Handphone hp03 = new Handphone();
		hp03.name = "김길동";
		hp03.phoneNumber = "010-xxxx-xxx2";
		hp03.company = "HUAWEI";
		
		Handphone[] hpArr = {hp01, hp02, hp03};
		for(Handphone hp : hpArr) {
			System.out.println("사용자 : " + hp.name + ", 전화번호 : " + hp.phoneNumber + ", 제조사 : " + hp.company);
		}
		System.out.println();
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("사용자 : " + hpArr[i].name + ", 전화번호 : " + hpArr[i].phoneNumber + ", 제조사 : " + hpArr[i].company);
		}
	}
}

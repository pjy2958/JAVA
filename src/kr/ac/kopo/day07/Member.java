package kr.ac.kopo.day07;

public class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		this.name = "신원미상";
		this.age = -1;
		this.bloodType = "알수없음";
	}
	Member(String name) {
		this(name, -1, "알수없음");
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알수없음";
	}
	Member(String name, int age) {
		this(name, age, "알수없음");		// 클래스내 다른 생성자 호출
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
	}
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.printf("이름 : %s\t나이 : %d\t\t혈액형 : %s", this.name, this.age, this.bloodType);
	}
}

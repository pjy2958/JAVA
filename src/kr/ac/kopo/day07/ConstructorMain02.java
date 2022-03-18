package kr.ac.kopo.day07;

public class ConstructorMain02 {

	public static void main(String[] args) {
		Member m01 = new Member();
		Member m02 = new Member("홈길동");
		Member m03 = new Member("험길동", 15);
		Member m04 = new Member("홍길동", 3, "AB");
		
		m01.info();
		System.out.println();
		m02.info();
		System.out.println();
		m03.info();
		System.out.println();
		m04.info();
		System.out.println();
	}
}

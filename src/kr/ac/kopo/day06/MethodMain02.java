package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다.");
	}
	void 냐옹거린다() {
		System.out.println("고양이가 냐옹합니다.");
	}
}

class Method {		// 자바는 메소드와 메소드를 구분할때 *메소드명 + 매개변수 type, 갯수등*을 다 포함한 것으로 구분함.
	void call() {	// 메소드 오버로딩 : 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른것.
		System.out.println("call() 메소드 호출...");
	}
	void call(int i) {
		System.out.println("call(" + i + ") 메소드 호출...");
	}
	void call(double d) {
		System.out.println("call(" + d + ") 메소드 호출...");
	}
	void call(boolean b) {
		System.out.println("call(" + b + ") 메소드 호출...");
	}
	void call(String str, int i) {
		System.out.println("call(" + str + ", " + i + ") 메소드 호출...");
	}
}

public class MethodMain02 {
	
	public static void main(String[] args) {
		고양이 나비 = new 고양이();
		Method m = new Method();
		나비.잠을잔다();
		나비.냐옹거린다();
		String a = new String("hi");
		m.call();
		m.call(1);
		m.call(10.3);
		m.call(true);
		m.call("cat", 1);
	}
}

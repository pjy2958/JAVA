package kr.ac.kopo.day09;

public class Child01 extends Parent {
	
	String name = "자식01";
	
	
	@Override
	public void print() {
		System.out.println("Child01::print() 호출...");
	}
	
	public void study() {
		System.out.println("나는 공부를 한다.");
	}
	
	public void sleep() {
		System.out.println("나는 잠을 잔다.");
	}
}

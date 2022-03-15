package kr.ac.kopo.day05;

// 실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		Car car01 = new Car();
		car01.name = "소나타";
		
		Car car02 = new Car();
		car02.name = "K9";
		
		System.out.println("첫번째 자동차명 : " + car01.name);
		System.out.println("두번째 자동차명 : " + car02.name);
	}
}

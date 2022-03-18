package kr.ac.kopo.day07;

/*
 *	생성자 특징 
 * 	1. 클래스명과 동일
 *  2. 반환형이 없다
 *  3. 클래스내에 생성자가 정의되있지않는 경우 default 생성자때문에 오류가 발생x
 *  4. 오버로딩 지원
 *  5. 멤버변수 초기화
 */

class Car {
	Car() {
		this(9);			//	this()를 통해 클래스내 다른 생성자 호출가능. 단 생성자의 맨위의 Line에 사용해야함.
		System.out.println("Car() 생성자 호출...");
//		this(9);			//  맨 윗라인이 아니라서 오류발생.
	}
	Car(int i) {
		System.out.println("Car(" + i + ") 생성자 호출...");
	}
	Car(int i, String str){
		System.out.println("Car(" + i + " " + str + ") 생성자 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = new Car(3);
		Car c3 = new Car(5, "people");
	}
}

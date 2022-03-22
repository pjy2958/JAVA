package kr.ac.kopo.day09;

/*
 *  명시적형변환
 */

public class CastMain02 {
	
	public static void print(Parent p) {	// 파라미터로 묵시적형변환을 사용했을때 메소드 내부에서 특정 서브클래스를 가져오고싶을때 명시적형변환 사용
		p.print();
		
		System.out.println(p instanceof Child01);	// 특정 클래스 객체를 판별하는 방법
		System.out.println(p instanceof Child02);	// 부모클래스는 모든 자식클래스에서 true가 판별되므로 if문을 통해 자식부터 물어봐야함.
		System.out.println(p instanceof Parent);
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if (p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} else {
			System.out.println(p.age);
			System.out.println(p.name);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Child01 error1 = new Parent(); 				// 컴파일시 오류 발생
//		Child01 error2 = (Child01) new Parent(); 	// 실행시오류발생
		
		Child01 c01 = new Child01();
		Child02 c02 = new Child02();
		Parent p = new Parent();
		
		print(c01);
		print(c02);
		print(p);
	}
}

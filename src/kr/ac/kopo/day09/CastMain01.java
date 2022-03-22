package kr.ac.kopo.day09;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	
	public static void print(Parent p) {
		p.print();
	}
	*/
	public static void print(Parent p) {	// 묵시적 형변환 : 파라미터로 넘기는경우 많이 사용한다.
		p.print();
	}
	
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
	}
}

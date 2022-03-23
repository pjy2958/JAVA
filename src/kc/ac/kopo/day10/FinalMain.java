package kc.ac.kopo.day10;

import java.util.Random;

/*final*/ class Super{		// 상속불가능
	private /*final*/ double PI = 3.14; // 값 수정 불가

	/*final*/ void call() {		// 오버라이딩금지
		System.out.println("Super::call()");
	}
}

class Sub extends Super{
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random {

	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
	
	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}
}

public class FinalMain {

	public static void main(String[] args) {
		
		Random r= new Random();
		int RRandom = r.nextInt(90)+ 10;
	}
}

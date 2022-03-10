package kr.ac.kopo.day02;

public class SwitchMain02 {
	public static void main(String[] args) {
		String str = new String("Hello");		// if문의 경우 str.equals("Hello")라고 써야함.
												// switch의 경우 바로 비교를 해줘서 문자열 비교의 경우 switch를 많이 사용.
		switch (str) {				
		case "Hello" :
			System.out.println("TRUE");
			break;
		default :
			System.out.println("FALSE");
		}
	}
}

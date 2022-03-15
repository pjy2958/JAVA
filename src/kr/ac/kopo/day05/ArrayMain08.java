package kr.ac.kopo.day05;

public class ArrayMain08 {

	public static void main(String[] args) {
		String[] strArr = new String[3];	// 참조자료형의 배열은 2차원배열의 모습과 비슷함 -> 주소를 두번탄다.
		
		strArr[0] = "hello";
		strArr[1] = new String("good");
		strArr[2] = "bye";
		
		for(String str : strArr) {
			System.out.println(str);
		}
	}
}

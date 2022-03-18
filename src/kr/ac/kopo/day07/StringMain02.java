package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		String str01 = "Hello";
		String str02 = "Hello";
		String str03 = new String("hello");
		String str04 = new String("hello");
		// ------------------------------- 위로는 주소비교를 함

		if (str01 == str02) {
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다");
		}
		if (str03 == str04) {
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다");
		}
		if (str01.equals(str02)) {
			System.out.println("문자열비교 : 같다");
		} else {
			System.out.println("문자열비교 : 다르다");
		}
		System.out.println("str01, str03간 대소문자관계없이 문자열 비교 : " + str01.equalsIgnoreCase(str03));
		String[] names = { "홍길동", "홍길동", "박길동", "홍가네", "윤길동", "홍길순", "한길동", "정홍길"};

		System.out.println("< 이름이 홍길동인 사람 출력 >");
		for (String name : names) {
			if (name.equals("홍길동")) {
				System.out.println(name);
			}
		}

		System.out.println("< 성이 홍씨인 사람 출력 >");
		for (String name : names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		System.out.println("< 이름이 동으로 끝나는 사람 >");
		for (String name : names) {
			if (name.endsWith("동")) {
				System.out.println(name);
			}
		}
		System.out.println("< 이름에 홍이 들어가는 사람 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		String str05 = "boat";
		String str06 = "banana";
		int compare = str05.compareTo(str06);
		if(compare == 0) {
			System.out.println(str05 + " == " + str06);
		} else if (compare > 0) {
			System.out.println(str05 + " > " + str06);
		} else {
			System.out.println(str05 + " < " + str06);
		}
	}
}

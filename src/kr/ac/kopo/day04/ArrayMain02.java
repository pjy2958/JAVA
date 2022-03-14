package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
//		String[] strArr = {"데이터분석", "자바", "교육"};
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++] = "폴리텍";
		strArr[loc++] ="데이터분석";
		strArr[loc++] ="자바";
		strArr[loc++] ="교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
		/*
		 * 배열의 전체 원소를 출력 방신
		 * 1. index를 이용한 출력	(원소접근: 0 ~ length-1)
		 * 2. JDK 1.5버전의 for문을 이용한 출력	for (변수선언 : 배열명)	=> 출력용으로만 사용 (ArrayMain03에 이유)
		 * 3. Arrays.toString() 메소드를 이용한 출력  배열이가지고 있는 요소들을 통째로 하나의 문자열로 바꿔줌.
		 */
		System.out.println("\n< index를 이용한 출력 >");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("\n< 1.5버전의 for문을 이용한 출력 >");
		for (String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("\n< Arrays.toString() 메소드를 이용한 출력 >");
		String result = Arrays.toString(strArr);
		System.out.println(result);
	}
}

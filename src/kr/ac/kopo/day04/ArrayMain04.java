package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		//배열선언 및 초기화 1번 방식
//		int[] arr = {10, 20, 30, 40, 50};
		
		//배열선언 및 초기화 2번 방식
		int[] arr = new int[] {10, 20, 30, 40, 50};
		// 2번방식의 초기화방법
//		arr = {5, 4, 3}; //컴파일 에러발생
		arr = new int[] {5,4,3};
		
		System.out.println("arr : " + Arrays.toString(arr));
	}
}

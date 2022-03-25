package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *	Set : 순서(X), 중복(X)
 *	 - HashSet
 *	 - TreeSet 
 */

public class SetMain {

	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();  --> 문자열의경우 기본적으로 오름차순형태
		Set<String> set = new HashSet<>();
		System.out.println("입력성여부 : " + set.add("one"));	// add()의 반환값 : true false.
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("입력성여부 : " + set.add("one"));	// 중복데이터를 허용하지않음.
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		
		/*
		 *  전체 데이터 접근방법 3가지
		 *  1. 1.5버전의 for문 이용
		 *  2. toArray() 메소드
		 *  3. iterator 객체 이용
		 */
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(String str : set)
			System.out.println(str);
		
		System.out.println("< toArray()를 이용한 출력 >");
		Object[] arr = set.toArray();		// 반환값이 Object형으로 배열화시키기
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);		// arr[i]는 Object형이지만 내부적으로 toSting을 호출 / arr[i].length()를 사용하고싶으면 String으로 명시적형변환사용
		
		/*
		 * Iterator(순환객체) 주요메소드
		 * 		- hasNext() : 현재 Iterator의 위치에서 다음위치의 데이터 존재여부판단 반환값 boolean
		 * 		- next();   : 데이터 접근
		 */
		System.out.println("< Iterator를 이용한 출력 >");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}

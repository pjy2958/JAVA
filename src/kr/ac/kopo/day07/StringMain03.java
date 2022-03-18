package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		String str01 = "awijeoiwawat";
		String str02 = "  :aaaaaaaaaaaa:  ";
		String str03 = "AIOVJAOIJ";
		System.out.println("str01 : " + str01);
		System.out.println("str02 : " + str02);
		System.out.println("str03 : " + str03);
		System.out.println("-------------------------------------------------------");
		System.out.println("str01.indexOf('w') : " + str01.indexOf('w'));		
		System.out.println("str01.indexOf('w', 2) : " + str01.indexOf('w', 2));	
		System.out.println("str01.substring(3, 5) : " + str01.substring(3, 5));		// 범위 : 3 ~ 4
		System.out.println("str01.concat(str02) : " + str01.concat(str02));			
		System.out.println("str02.replace('a', 'b') : " + str02.replace('a', 'b'));
		System.out.println("str02.trim() : " + str02.trim());
		System.out.println("str03.toLowerCase() : " + str03.toLowerCase());
		System.out.println("str01.toUpperCase() : " + str01.toUpperCase());
		System.out.println("-------------------------------------------------------");
		System.out.println();
		int index = str01.indexOf('a');
		while(index != -1) {
			System.out.println("'a'인덱스 위치 : " + index);
			index = str01.indexOf('a', index + 1);
		}
		System.out.println(str02.replace("aaa", "s"));
		System.out.printf("[%s] 길이 : %d\n", str02, str02.length());
		System.out.printf("[%s] 길이 : %d\n", str02.trim(), str02.trim().length());
		
		String data = "홍길동전:허균:조선시대";
		String[] book = data.split(":");
		System.out.println("split() : " + Arrays.toString(book));
		
		int num = 1111;
		String a = String.valueOf(num);
		System.out.println(a + 999);
	}
}

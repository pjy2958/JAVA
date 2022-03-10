package kr.ac.kopo.day01;

/*
	1byte = 8bit(0, 1)
	ASCII CODE(0 ~ 255) : 1byte
	   대문자, 소문자, 숫자문자, 특수문자, 공백문자를 숫자로 일대일 매칭시킨 숫자표
	   
	UNICODE(0~65535) : 2byte
	   다국어 진원 숫자표(ASCII CODE + 한글, 한자, .....)
	   자바의 문자인식
	   
	   'A' : 65   16진수 0x41
	   'a' : 97   	    0x61
	   '0' : 48			0x30
*/

public class PrintMain02 {
	
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A' + "BCD");
		System.out.println('A' + 'B');
		System.out.println("A" + "B");
		System.out.println('A' + 10);
		System.out.printf("%c\n", 12607);
		System.out.println(0x30);
	}
}

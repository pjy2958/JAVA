package kr.ac.kopo.day01;

/*
	1byte = 8bit(0, 1)
	ASCII CODE(0 ~ 255) : 1byte
	   �빮��, �ҹ���, ���ڹ���, Ư������, ���鹮�ڸ� ���ڷ� �ϴ��� ��Ī��Ų ����ǥ
	   
	UNICODE(0~65535) : 2byte
	   �ٱ��� ���� ����ǥ(ASCII CODE + �ѱ�, ����, .....)
	   �ڹ��� �����ν�
	   
	   'A' : 65   16���� 0x41
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

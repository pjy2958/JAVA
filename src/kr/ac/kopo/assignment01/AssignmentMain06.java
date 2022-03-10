package kr.ac.kopo.assignment01;
public class AssignmentMain06 {

	public static void main(String[] args) {
		System.out.printf("알파벳의 갯수 : %d개", ((int)'Z' - (int)'A' + 1)*2); // 알파벳 대문자의 갯수는 Z의 아스키코드값 - A의 아스키코드값 + 1
										 									// 알파벳은 소문자 대문자가 있으므로 알파벳의 총갯수는 (Z의 아스키코드 값 - A의 아스키코드값 + 1)*2
	}
}

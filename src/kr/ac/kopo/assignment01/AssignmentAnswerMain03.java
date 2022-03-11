package kr.ac.kopo.assignment01;

// 대소문자 변환 코드

public class AssignmentAnswerMain03 {

	public static void main(String[] args) {
		int upperCnt = 'Z' - 'A' + 1;	// 형변환 않해도됌.
		int lowerCnt = 'z' - 'a' + 1;
		
		char ch = 'B';
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + ('a' - 'A'));
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - ('a' - 'A'));
		}
		System.out.println(ch);		
	}
}

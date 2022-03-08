package kr.ac.kopo.day01;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 하나의 문자입력받기 밑의 예시의 경우 첫문자를 받음
		System.out.println("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		
		// 정수 입력받기
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("a = " + num);
		
		// 단어 입력받기
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.next(); // 띄어쓰기 기준으로 단어하나만 들어감.
		System.out.println(word);
		
		// 문자열 입력받기
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println(str);
	}
}

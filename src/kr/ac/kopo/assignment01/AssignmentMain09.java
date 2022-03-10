package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain09 {

	public static void main(String[] args) {
		int bookNum;	// 책 권수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 : ");
		bookNum = sc.nextInt();
		
		if (bookNum < 0) {								// 책권수가 음수일 경우
			System.out.println("잘못 입력했습니다.");
		} else if (bookNum == 0) {						// 책권수가 0권일 경우
			System.out.println("보유하고 있는 책 없음");
		} else if (bookNum == 1) {
			System.out.printf("%d book\n", bookNum);	// 책권수가 1권일 경우
		} else {
			System.out.printf("%d books\n", bookNum);	// 책권수가 1권보다 많을 경우
		}
	}
}

package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain07 {

	public static void main(String[] args) {
		char alphabet;	// 입력받을 알파벳을 저장하는 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳) : ");
		alphabet = sc.nextLine().charAt(0);
		
		// a의 아스키고드값은 97 A의 아스키코드값은 65  두값의 차이는 32
		// z의 아스키코드값은 122
		
		if ((int)alphabet < 65) {
			System.out.println("ERROR");
		} else if ((int)alphabet < 97){
			System.out.printf("변경된 값 : %c", (int)alphabet + 32);
		} else if ((int)alphabet < 123){
			System.out.printf("변경된 값 : %c", (int)alphabet - 32);
		} else {
			System.out.println("ERROR");
		}
	}
}

package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain05 {

	public static void main(String[] args) {
		final float DALLOR = 1092.50f;  // 1달러당 현재 원화
		int inputDallor;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요 ? ");
		inputDallor = sc.nextInt();
		
		System.out.printf("원화 : %.2f원", DALLOR*(float)inputDallor);
	}
}

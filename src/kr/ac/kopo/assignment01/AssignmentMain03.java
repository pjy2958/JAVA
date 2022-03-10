package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain03 {

	public static void main(String[] args) {
		final double PI = 3.141592; // 원주율 상수
		double radius; 				// 반지름
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		radius = sc.nextInt();
		
		System.out.printf("결과출력 : 원의 면적은 %f 입니다.", PI*radius*radius);
	}
}

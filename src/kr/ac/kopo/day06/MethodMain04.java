package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = Integer.parseInt(sc.nextLine());
		gu.print(dan);
		
		System.out.println();
		
	}
}

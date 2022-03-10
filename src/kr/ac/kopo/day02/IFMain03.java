package kr.ac.kopo.day02;
import java.util.Scanner;

/*
 * 다중 if
 * 
 *		if (조건1) {
 *			문장1;
 *		} else {
 *			if (조건2) {
 *				문장2
 *			} else {
 *				if (조건3) {
 *					문장3;
 *				} else {
 *					...
 *				}
 *			}
 *		}
 *		
 *		==
 *		if (조건1) {
 *			문장1;
 *		} else if (조건2) {
 *			문장2;
 *		} else if (조건3) {
 *			문장3;
 *		} else {
 *			문장4;
 *		}
 */

public class IFMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("집에서 출발한 시간을 입력하세요(ex 7시30분 : 730) : ");
		int time = sc.nextInt();
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다.");
		} else if (time < 815) {
			System.out.println("버스를 타고 학교에 간다.");
		} else {
			System.out.println("택시를 타고 학교에 간다.");
		}
	}
}

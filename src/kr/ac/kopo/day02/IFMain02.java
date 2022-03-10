package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 중첩IF문
 * 
 * 	if(조건1) {
 *		문장1; 
 * 	} else {
 * 		if(조건) {
 * 			문장2;
 * 		} else {
 * 			문장3;
 * 		}
 * 	}
 * 
 *  출발한 시간을 입력하세요(ex 7시 30분 : 730)
 */

public class IFMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간을 입력하세요(ex 7시30분 : 730) : ");

		int time = sc.nextInt(); 					// 출발시간 입력
		
// 코드1 ---------------------------------------------------
		if (time < 815) {
			if (time < 800) {
				System.out.println("걸어서 학교에 간다.");
			} else {
				System.out.println("버스를 타고 학교에 간다.");
			}
		} else {
			System.out.println("택시를 탄다");
		}

// 코드2 ---------------------------------------------------
		if (time < 800) {
			System.out.println("걸어서 학교에 간다."); 	// 출발시간이 8시 이전인 경우
		} else { 									// 출발시간이 8시 이후인 경우
			if (time < 815) { 						// 출발시간이 8시 이후, 8시 15분이전인경우
				System.out.println("버스를 타고 학교에 간다.");
			} else { 								// 출발시간이 8시 15분 이후인 경우.
				System.out.println("택시를 타고 학교에 간다.");
			}
		}
	}
}

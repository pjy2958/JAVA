package kr.ac.kopo.assignment08.solution;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc = new Scanner(System.in);
	
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		while (true) {
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
			switch (type) {
			case 1:
				int year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				int month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);	// 매개변수에 숫자는 에러코드이지만 0은 정상종료를 의미		// 클래스명으로 접근하고 있다 -> static (인스턴트객체를 만들지않고도 접근이가능하기때문)
			}
		}
	}
}

package kc.ac.kopo.day10;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		// 오늘은 2022년 3월 23일(수) 입니다.
		
		Date d = new Date();
		System.out.println(d);
		
		int year = d.getYear() + 1900;	// getYear()는 1900년부터 시작.
		int month = d.getMonth() + 1;	// month()는 0~11을 출력.
		int date = d.getDate();
		int day = d.getDay();			// 일~토를 0~7로 표현
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일 입니다.\n", year, month, date, week[day]);
	}
}

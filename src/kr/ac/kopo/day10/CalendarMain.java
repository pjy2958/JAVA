package kr.ac.kopo.day10;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;	// 0~11사이의 숫자가 나오므로 + 1
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	// 1 (일) ~ 7(토)
		String[] week = {"" ,"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일\n", year, month, date, week[day]);
		
		// 2321년 5월 20일은 무슨요일인가?
		c.set(2321, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2321/5/20 " + week[day] + "요일");
		
		// 5월의 마지막날은??
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
	}
}

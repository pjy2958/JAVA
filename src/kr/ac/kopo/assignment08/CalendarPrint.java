package kr.ac.kopo.assignment08;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrint {
	private int year;
	private int month;
	private boolean exit;
	
	private Calendar c = Calendar.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	CalendarPrint(){
		this.year = 0;
		this.month = 0;
		this.exit = true;
	}
	
	public void process() {
		System.out.printf("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			this.setYear();
			this.printCalendar();
			break;
		case 2:
			this.setYear();
			this.setMonth();
			this.printCalendar();
			break;
		case 3:
			this.exit = false;
			break;
		}
	}
	
	private int[] getCalendarArr(Calendar c) {
		int lastday = c.getActualMaximum(Calendar.DATE); // 한달의 마지막날
		int day = c.get(Calendar.DAY_OF_WEEK) - 1; // 요일의 숫자표현

		int[] calendarArr = new int[lastday + day];

		for (int i = 0; i < calendarArr.length; i++) {
			if (i >= day)
				calendarArr[i] = i - day + 1;
			else
				calendarArr[i] = 0;
		}
		return calendarArr;
	}
	
	private void printCalendar() {
		int firstMonth;
		int lastMonth;
		if (month == 0) {
			firstMonth = 1;
			lastMonth = 12;
		} else {
			firstMonth = this.month;
			lastMonth = this.month;
		}

		for (int i = firstMonth - 1; i < lastMonth; i++) {
			c.set(this.year, i, 1); // 년, 월 설정
			int[] calendarArr = this.getCalendarArr(c);

			System.out.printf("< %d년 %d월 >\n", this.year, i + 1);
			System.out.println(" 일  월   화  수   목   금  토");
			for (int j = 1; j < calendarArr.length + 1; j++) {
				if (calendarArr[j - 1] != 0)
					System.out.printf("%2d  ", calendarArr[j - 1]);
				else
					System.out.print("    ");
				if (j % 7 == 0)
					System.out.println();
			}
			System.out.println();
		}
		this.month = 0;
	}
	
	public boolean getExit() {
		return this.exit;
	}
	
	private void setYear() {
		System.out.print("년도를 선택하세요 : ");
		this.year = Integer.parseInt(sc.nextLine());
	}

	private void setMonth() {
		System.out.print("월을 선택하세요 : ");
		this.month = Integer.parseInt(sc.nextLine());
	}
}

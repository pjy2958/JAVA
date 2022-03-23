package kr.ac.kopo.assignment08;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrint {
	private Calendar c = Calendar.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	private int[] makeArr(Calendar c) {
		int lastday = c.getActualMaximum(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK) - 1;
		
		int[] arr = new int[lastday + day];
		
		for (int i = 0; i < arr.length; i++) {
			if (i >= day)
				arr[i] = i - day + 1;
			else
				arr[i] = 0;
		}
		return arr; 
	}
	
	
	private void printCalendar(int firstMonth, int lastMonth) {
		System.out.print("년도를 선택하세요 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		for(int i = firstMonth-1; i <= lastMonth-1; i++) {
			c.set(year, i, 1);
			int[] arr = {};
			System.out.printf("< %d년 %d월 >\n", year, i);
			arr = this.makeArr(c);
			for(int j = 0; j < arr.length; j++) {
				if(j % 8 == 0)
					System.out.println();
				else
					System.out.printf("%2d  ", arr[j]);
			}
			System.out.println();
		}
	}
	
	void process() {
		System.out.printf("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1:
			printCalendar(1, 12);
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			
		}
		
	}

}

package kr.ac.kopo.assignment08;

public class CalendarPrintMain {

	public static void main(String[] args) {
		CalendarPrint cp = new CalendarPrint();
		while (cp.getExit()) {
			cp.process();
		}
	}
}

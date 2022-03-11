package kr.ac.kopo.assignment01;
import java.util.Scanner;

public class AssignmentMain02 {

	public static void main(String[] args) {
		int beginSecond;	// 입력받은 초기 초
		int hour;			// 변환한 시간
		int minute; 		// 변환한 분
		int second;			// 변환한 초 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		beginSecond = sc.nextInt();
		
		hour = beginSecond / 3600;	// 1시간 = 3600초
		beginSecond %= 3600;
		
		minute = beginSecond / 60;	// 1분 = 60초
		beginSecond %= 60;
		
		second = beginSecond;
		
		System.out.print("결과출력 : ");
		if (hour != 0)
			System.out.printf("%d시간 ", hour);
		if (minute != 0)
			System.out.printf("%d분 ", minute);
		if (second != 0)
			System.out.printf("%d초 ", second);
		if (hour == 0 && minute == 0 && second == 0) {
			System.out.println("0초");
		}
	}
}

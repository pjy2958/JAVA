package kr.ac.kopo.day02;
import java.util.Random;

// 문서화작업 Project -> Generage Javadoc
// 표준화 문서를 제작하기위해서는 문서화주석 /** 사용

/**
 * 로또와 관련된 여러가지 기능 클래스
 * @author 박준영
 *
 */

public class LottoUtil {
	public void todayProbability() {
		
		Random r = new Random();
		int p = r.nextInt(101); // 0 ~ 100사이의 값 추출
		
		System.out.println("오늘의 로또 확률은 " + p + "%입니다");
	}
}

package kr.ac.kopo.day03;

/*	
 * 	init;
 *	do{
 *		statement;
 *		incre/decre;
 *	} while (expr);
 *  처음 한번은 꼭 실행함.
 *  
 *  
 *  자바의 경우 반복문이나 switch문의 이름을 지정하고 break 이름; 을통해 해당 위치로 빠져나갈 수 있다. 
 */

public class LoopMain02 {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("hellow");
			i++;
		} while (i <= 5);

		int cnt = 1;
		while (true) {
			System.out.println("hellow");
			if (cnt == 5)
				break; // 가장가까운 반복문이나 스위치문을 빠져나올때 사용
			cnt++;
		}
		
		first: while (true) {
			for (int b = 1; b <= 5; b++) {
				System.out.println("hello");
				if (b == 4) {
					break first;
				}
			}
		}
		
	}
}

package kr.ac.kopo.day02;

/*
 * 	반복문을 위한 기본요소 4가지 
 * 	1. 반복할문장(statement)
 * 	2. 시작값(init)
 * 	3. 증가/감소(incre/decre)
 * 	4. 종료조건(expr)
  
  	한바퀴 뛸 차례다;
  	while(조건: !열바퀴 다 뛰었는가?) {
  		운동장 한바퀴 뛴다;
  		바퀴수 증가;
  	}
  	while----------------------
  	1.init;
  	while(2.expr) {
  		3.statement;
  		4.incre/decre;
  	}
  	
  	1 -> 2. 조건 참 -> 3 -> 4 -> 
  	  -> 2. 조건 참 -> 3 -> 4 ->
  	  -> 2. 조건 참 -> 3 -> 4 ->
  	  -> 2. 조건 거짓 -> 탈출
  	  
  	for------------------------
  	
  	for(1.init; 2.expr; 4.incre/decre) {
  		3.statement;
  	}
  	
  	1 -> 2. 조건 참 -> 3 -> 4
  	  -> 2. 조건 참 -> 3 -> 4
  	  -> 2. 조건 참 -> 3 -> 4
  	  -> 2. 조건 거짓 -> 탈출
 */

public class LoopMain01 {

	public static void main(String[] args) {
		System.out.println("---------------for반복문 시작---------------");
		for(int cnt = 1; cnt <= 10; cnt++) {			// cnt는 block life-cycle에 의해 for문이 끝나면 삭제 
			System.out.printf("%2d 바퀴 째입니다.", cnt);
			System.out.println();
		}
		System.out.println("---------------for반복문 종료---------------");
		
		System.out.println();
		
		int cnt = 1;									// 새로이 cnt 선언 및 초기화
		System.out.println("--------------while반복문 시작--------------");
		while (cnt <= 10) {
			System.out.printf("%2d 바퀴 째입니다.", cnt);
			System.out.println();
			cnt++;
		}
		System.out.println("--------------while반복문 종료--------------");
	}
}

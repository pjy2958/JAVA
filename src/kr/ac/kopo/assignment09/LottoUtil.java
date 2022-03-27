package kr.ac.kopo.assignment09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil {
	private Random rnd = new Random();
	private int[] lottoNum;
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임수 입력 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + ": " + Arrays.toString(getNumbers05()));
		}
	}
	
	
	// 1. 난수를 하나씩 생성하여 배열에 하나씩 집어넣기
	private int[] getNumbers01() {
		this.lottoNum = new int[6];
		for(int i = 0; i < this.lottoNum.length; i++) {
			this.lottoNum[i] = this.rnd.nextInt(45) + 1;
		}
		return this.lottoNum;
	}
	
	// 2. 1~46 숫자중 랜덤으로 6개 뽑아서 배열에 넣기
	private int[] getNumbers02() {
		this.lottoNum = new int[6];
		
		// 1-46 숫자를 담을 배열 생성
		int[] totalNumArr = new int[45];
		for(int i = 0; i < totalNumArr.length; i++) {
			totalNumArr[i] = i + 1;
		}
		
		// 랜덤으로 인덱스 번호를 뽑아서 해당 값을 로또번호로 사용
		int randomNum;	// 랜덤으로 번호 추첨받을 변수
		for(int i = 0; i < this.lottoNum.length; i++) {
			randomNum = this.rnd.nextInt(45);
			this.lottoNum[i] = totalNumArr[randomNum];
		}
		return this.lottoNum;
	}
	
	// 3. 로또번호 6개가 나올때까지 랜덤 값을 더하기
	private int[] getNumbers03() {
		this.lottoNum = new int[6];
		int index = 0;
		int randomNum = 0;
		
		while(this.lottoNum[5] == 0) {	// 로또번호 6자리가 생성될때까지 무한루프
			randomNum += this.rnd.nextInt(45) + 1;
			if(randomNum > 45)	// 숫자가 46이상인경우 모드연산
				randomNum %= 45;
			if(randomNum == 0)
				randomNum += this.rnd.nextInt(45) + 1;
			
			for(int i = 0; i < this.lottoNum.length; i++) {
				if(lottoNum[i] == randomNum)	// 중복 숫자 확인
					break;
				if(i == index) {	// 중복이 없으면 숫자 넣기
					lottoNum[i] = randomNum;
					index ++;
					break;
				}
			}
		}
		return this.lottoNum;
	}
	
	// 4. arrayList 사용
	private int[] getNumbers04() {
		this.lottoNum = new int[6];
		List<Integer> lottoList = new ArrayList();
		
		for(int i = 0; i < this.lottoNum.length; i++) {
			int randomNum = this.rnd.nextInt(45) + 1;
			if(!lottoList.contains(randomNum))
				lottoList.add(randomNum);
			else
				i--;
		}
		
		int cnt = 0;
		for(int num : lottoList) {
			lottoNum[cnt++] = num;
		}
		return this.lottoNum;
	}
	
	// 5. Hashset 사용
	private int[] getNumbers05() {
		this.lottoNum = new int[6];
		Set<Integer> lottoSet = new HashSet();
		
		for(int i = 0; i < this.lottoNum.length; i++) {
			if(!lottoSet.add(this.rnd.nextInt(45) + 1))
				i--;
		}
		
		int cnt = 0;
		for(int num : lottoSet) {
			lottoNum[cnt++] = num;
		}
		return this.lottoNum;
	}
}

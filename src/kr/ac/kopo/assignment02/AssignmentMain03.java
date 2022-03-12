package kr.ac.kopo.assignment02;

public class AssignmentMain03 {

	public static void main(String[] args) {
		final int DEPTH = 100; // 우물 깊이
		int snailSpeed = 5; // 달팽이 속도
		int snailHeight = 0; // 달팽이 높이
		int time = 0; // 시간

		while (snailHeight < DEPTH) {
			if (snailHeight < 50) { // 달팽이 높이가 50M미만인 경우 -> 4M씩이동
				snailHeight += 4;
				time++;
			} else { // 달팽이 높이가 50M이상인 경우 -> 3M씩이동
				snailHeight += 3;
				time++;
			}
			System.out.printf("[%2d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, snailHeight);
		}
	}

}

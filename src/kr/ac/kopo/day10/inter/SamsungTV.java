package kr.ac.kopo.day10.inter;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("삼성TV를 구매했습니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("TV 전원 ON");

	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 OFF");

	}

	@Override
	public void channelUp() {
		System.out.println("channelup");

	}

	@Override
	public void channelDown() {
		System.out.println("channeldown");

	}

	@Override
	public void volumUp() {
		System.out.println("volumup");

	}

	@Override
	public void volumDown() {
		System.out.println("volumdown");

	}

	@Override
	public void mute() {
		System.out.println("음소거 중");
	}
}

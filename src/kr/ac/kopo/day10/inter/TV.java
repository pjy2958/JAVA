package kr.ac.kopo.day10.inter;

// 인터페이스 특징
// 모든메소드 -> 추상메소드
// 모든 변수 -> 상수

public interface TV {
	int MIN_VOLUME_SIZE = 0;	// public static final이 생략되어있음.
	public static final int MAX_VOLUME_SIZE = 50;
	
	/** 전원 on 기능 */
	void powerOn();		// public abstract가 생략되어 있음.
	
	/** 전원 off 기능 */
	public abstract void powerOff();
	
	/** 채널 증가 기능 */
	void channelUp();
	
	/** 채널 감소 기능 */
	void channelDown();
	
	/** 소리 증가 기능 */
	void volumUp();
	
	/** 소리 감소 기능 */
	void volumDown();
	
	/** 음소거 기능 */
	void mute();
}

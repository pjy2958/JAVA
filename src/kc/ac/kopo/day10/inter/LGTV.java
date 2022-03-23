package kc.ac.kopo.day10.inter;

public class LGTV implements TV{
	
	private boolean power;
	private int volumeSize;
	private int channerlNo;
	protected static final int MAX_CHANNEL_SIZE = 100;
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다.");
		this.power = false;
		this.volumeSize = 10;
		this.channerlNo = 3;
	}

	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		this.power = true;
		this.info();
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		this.power = false;
	}

	@Override
	public void volumUp() {
		if (this.volumeSize < TV.MAX_VOLUME_SIZE) {
			this.volumeSize++;
		}
		this.info();
	}

	@Override
	public void volumDown() {
		if (this.volumeSize > TV.MIN_VOLUME_SIZE) {
			this.volumeSize--;
			this.info();
		} else
			this.info();
	}

	@Override
	public void channelUp() {
		this.channerlNo = ++this.channerlNo % LGTV.MAX_CHANNEL_SIZE;
		this.info();
	}

	@Override
	public void channelDown() {
		this.channerlNo = --this.channerlNo % LGTV.MAX_CHANNEL_SIZE;
		this.info();
	}

	@Override
	public void mute() {
		this.volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거중입니다.");
	}
	
	public void info() {
		System.out.println("채널번호 : " + this.channerlNo + ", 음량크기 : " + this.volumeSize);
	}
}

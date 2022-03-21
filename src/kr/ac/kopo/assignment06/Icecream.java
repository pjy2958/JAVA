package kr.ac.kopo.assignment06;

public class Icecream {
	private String iceName;	// 아이스크림이름
	private int icePrice;	// 아이스크림가격

	Icecream() {
		this.iceName = "";
		this.icePrice = 0;
	}

	Icecream(String iceName, int icePrice) {
		this.iceName = iceName;
		this.icePrice = icePrice;
	}

	public String getIceName() {
		return this.iceName;
	}

	public int getIcePrice() {
		return this.icePrice;
	}
}

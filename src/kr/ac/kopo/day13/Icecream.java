package kr.ac.kopo.day13;

import java.io.Serializable;

public class Icecream implements Serializable {		// 객체 직렬화를 위해 Serializable 상속받음.
	private String name;
	private int price;
	private transient String company;	// transient => 객체 직렬화에서 해당 멤버변수는 제외함.
	
	
	public Icecream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Icecream(String name, int price, String company) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
}

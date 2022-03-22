package kr.ac.kopo.assignment07;

abstract class Shape {
	private int area;
	
	abstract void getArea(int x, int y);
	
	public void setArea(int area) {
		this.area = area;
	}
	
	void printArea() {
		
	}
}

class Square extends Shape{
	private int width;
	private int height;
	
	Square(){}
	Square(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void getArea(int width, int height) {
		super.setArea(width * height);
	}
	
}

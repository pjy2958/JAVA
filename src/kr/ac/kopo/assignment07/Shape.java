package kr.ac.kopo.assignment07;

abstract class Shape {
	private float area;
	private String name;

	abstract public void getArea();

	public void setArea(String name, float area) {
		this.name = name;
		this.area = area;
	}

	public void printArea() {
		if(this.name.equals("circle"))
			System.out.println(this.area);
		else
			System.out.println((int)this.area);
	}
}

class Square extends Shape {
	private String name;
	private int width;
	private int height;

	Square() {
	}

	Square(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		super.setArea(this.name, this.width * this.height);
		super.printArea();
	}
}

class Rectangle extends Square {
	Rectangle() {
	}

	Rectangle(String name, int width) {
		super(name, width, width);
	}

	@Override
	public void getArea() {
		super.getArea();
	}
}

class Triangle extends Shape {
	private String name;
	private int width;
	private int height;

	Triangle() {
	}

	Triangle(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		super.setArea(this.name, (this.width * this.height) / 2);
		super.printArea();
	}
}

class Circle extends Shape {
	private final float PI = 3.14f;
	private String name;
	private int radius;

	Circle() {
	}

	Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	
	@Override
	public void getArea() {
		super.setArea(this.name, radius * radius * PI);
		super.printArea();
	}
}

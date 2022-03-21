package kr.ac.kopo.assignment06;

public class Figure {
	final float PI = 3.14f;
	int n; 		// 정사각형 한 변의 길이 or 원의 반지름
	int width; 	// 가로길이
	int height; // 세로길이

	Figure() {
		this(0, 0, 0);
	}

	Figure(int n) {
		this(n, 0, 0);
	}

	Figure(int width, int height){
		this(0, width, height);
	}
	
	Figure(int n, int width, int height){
		this.n = n;
		this.width = width;
		this.height = height;
	}
}

class Square extends Figure {
	Square(){}
	Square(int n){
		super(n);
	}
	
	// 정사각형의 면적
	public void printSquare() {
		System.out.println("정사각형의 면적 : " + (super.n * super.n));
	}
}

class Rectangle extends Figure {
	Rectangle(){}
	Rectangle(int width, int height){
		super(width, height);
	}
	
	// 직사각형의 면적
	public void printRectangle() {
		System.out.println("직사각형의 면적 : " + (super.width * super.height));
	}
}

class Triangle extends Figure {
	Triangle(){}
	Triangle(int width, int height){
		super(width, height);
	}
	
	// 삼각형의 면적
	public void printTriangle() {
		System.out.println("삼각형의 면적 : " + ((super.width * super.height) / 2));
	}
}

class Circle extends Figure {
	Circle(){}
	Circle(int n){
		super(n);
	}
	
	// 원의 면적
	public void PrintCircle() {
		System.out.println("원의 면적 : " + (float) (super.n * super.n * super.PI));
	}
}

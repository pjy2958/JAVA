package kr.ac.kopo.assignment07;

import java.util.Random;

public class ShapeMain {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(4) + 1;

		int n = rnd.nextInt(100) + 1;
		int height = rnd.nextInt(100) + 1;
		int width = rnd.nextInt(100) + 1;
		Shape shape = null;
		
		switch (num) {
		case 1:
			shape = new Square("square", width, height);
			shape.getArea();
			break;
		case 2:
			shape = new Rectangle("rectangle", n);
			shape.getArea();
			break;
		case 3:
			shape = new Triangle("triangle", width, height);
			shape.getArea();
			break;
		case 4:
			shape = new Circle("circle", n);
			shape.getArea();
			break;
		}
	}
}

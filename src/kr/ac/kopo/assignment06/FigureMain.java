package kr.ac.kopo.assignment06;

import java.util.Random;

public class FigureMain {

	public static void main(String[] args) {
		Random rnd = new Random();
		Figure fi = new Figure();
		int num = rnd.nextInt(4) + 1;
		
		int n = rnd.nextInt(1000) + 1;
		int height = rnd.nextInt(1000) + 1;
		int width = rnd.nextInt(1000) + 1;
		
		switch (num) {
		case 1:
			Square sq = new Square(n);
			sq.printSquare();
			break;
		case 2:
			Rectangle re = new Rectangle(width, height);
			re.printRectangle();
			break;
		case 3:
			Triangle tr = new Triangle(width, height);
			tr.printTriangle();
			break;
		case 4:
			Circle ci = new Circle(n);
			ci.PrintCircle();
			break;
		}
	}
}

package questOne;

public class Abstraction {

	public static void main(String[] args) {
		Triangle shape = new Triangle();

	}

}

abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	double area() {
		return 0;
	}
}

class Square extends Shape {
	double area() {
		return 10;
	}
}
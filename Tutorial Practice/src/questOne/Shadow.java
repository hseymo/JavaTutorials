package questOne;

public class Shadow {

	public static void main(String[] args) {
		Child child = new Child();
		int returned = child.getX();
		System.out.print(returned);

	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 5;
	public int getX() {
		 // return super.x; for parent
		 // return this.x for child or x
		return x;
	}
}
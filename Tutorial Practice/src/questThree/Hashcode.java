package questThree;

public class Hashcode {
	public static void main(String[] args) {
		Pizza one = new Pizza();
		Pizza two = new Pizza();
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
	}
}


class Pizza {
	int size = 0;
	String topping = null;
	@Override
	public int hashCode() {
		if (topping != null) {
			return size * topping.hashCode();
		} else {
			return size;
		}
	}
}
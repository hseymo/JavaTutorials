package questThree;

public class Equals {
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
	public boolean equals(Object o) {
		Pizza other = (Pizza) o;
		if (this.size == other.size) {
			if (this.topping.equals(other.topping)) {
				return true;
			}
		}
		return false;
	}
}

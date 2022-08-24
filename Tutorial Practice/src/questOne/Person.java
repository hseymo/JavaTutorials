package questOne;

public class Person {
	
	private int age;
	
	public void setAge(int val) {
		age = val;
	}
	
	public int getAge() {
		return age;
	}
	
	public void talk() {
		System.out.println("How are you");
	}
	
	public static void main(String[] args) {
		Person haley = new Person();
		haley.setAge(29);
		haley.talk();
	}

	

}

class Family {
	public void member() {
	}
}
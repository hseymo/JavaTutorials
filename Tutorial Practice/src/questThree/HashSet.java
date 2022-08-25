package questThree;

import java.util.Objects;

public class HashSet {

	public static void main(String[] args) {
		HashSet<Friend> friends = new HashSet<Friend>();
		friends.add(new Friend("Dan", 42));
		friends.add(new Friend("Dana", 34));
		
		// can
		System.out.println(friends);
		
	}

}

class Friend{
	String name;
	int age;
	Friend(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return Objects.hash(age, name);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
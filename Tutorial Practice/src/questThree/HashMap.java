package questThree;

public class HashMap {

	public static void main(String[] args) {
		HashMap<String, Citizen> citizens = new HashMap<String, Citizen>();
		citizens.put("5001", new Citizen("Brian"));
		citizens.get("5001").name;
		citizens.size();
		citizens.containsKey("5001");
		citizens.containsValue(new Citizen("Brian"));
		citizens.entrySet();
		citizens.keysSet();
		citizens.values();

	}

}

class Citizen {
	String name;
	Citizen(String name){
		this.name = name;
	}
}

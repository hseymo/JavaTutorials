package questThree;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Pickle> list = new LinkedList<Pickle>();
		list.add(new Pickle("Dill"));
		list.add(new Pickle("Sweet"));
		
		list.get(1);
		list. 
	}
}

class Pickle {
	String flavor;
	public Pickle(String flavor) {
		this.flavor = flavor;
	}
}
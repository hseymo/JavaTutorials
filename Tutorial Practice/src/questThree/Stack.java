package questThree;
import java.util.Stack;

public class Stack {

	public static void main(String[] args) {
		Stack<Card> stack = new Stack<Card>();
		stack.push(new Card("A of Spades"));
		
		stack.pop().value;
		stack.peek().value;

	}

}

class Card{
	String value;
	public Card(String val) {
		this.value = val;
	}
}
package questTwo;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean holiday = false;
		boolean weekend = true;
		boolean work = false;

		//read left to right; 
		if (holiday | weekend & !work) {
			System.out.println("day off");
		}
		
		//second / is a short-circuit op. stops operation if false 
	}

}

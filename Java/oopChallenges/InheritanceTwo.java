package oopChallenges;

public class InheritanceTwo {

	public static void main(String[] args) {
		Adder myAdder = new Adder();
		System.out.println(myAdder.add(43, 12)); 
		System.out.println(myAdder.getClass().getSuperclass().getName());
	}

}

class Arithmetic {
	
	public int add(int firstInt, int secondInt) {
		return firstInt + secondInt;
	}
}

class Adder extends Arithmetic {
	
}
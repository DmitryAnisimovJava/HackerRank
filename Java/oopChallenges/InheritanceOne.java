package oopChallenges;

public class InheritanceOne {

	public static void main(String[] args) {
		
		Bird myBird = new Bird();
		myBird.walk();
		myBird.fly();
		myBird.sing();

	}

}

class Animal {
	
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	
	void fly() {
		System.out.println("I am flying");
	}
	void sing() {
		System.out.println("I am singing");
	}
}
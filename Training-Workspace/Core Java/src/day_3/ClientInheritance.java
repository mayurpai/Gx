package day_3;

class Animal {
//	protected Food eat() {
	public void eat() {
		System.out.println("Animal Eats Food");
//		return null;
	}
	
	public void sleep() {
		System.out.println("Animal Should Sleep");
	}
	
	public void work() {
		System.out.println("Animal Works");
	}
}

class Dog extends Animal {
	@Override
	// Child Classes Can Increase The Accessibility But Cannot Decrease
	/*
	 * ^ Public | Protected | Default | Private |
	 * 
	 */
	/*
	 * 1. Name Must Be Same. 2. Return Type Has To Be Same Or Compatible. 3. Classes
	 * Or Their Children Can Be Return Type.
	 */
	public void eat() {
		System.out.println("Dog Eats Veg And Non-Veg");
	}
}

class Men extends Animal {
	@Override
	public void eat() {
		super.eat();
		System.out.println("Men Eats Veg");
	}

	public void drive() {
		System.out.println("Men Can Drive");
	}
}

public class ClientInheritance {

	public static void main(String[] args) {
		new Dog().eat();
		new Men().eat();
		new Men().drive();
	}

}

class Food {

}

class Pizza extends Food {

}

class Burger extends Food {

}
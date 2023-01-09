package day_3;

abstract class Animals {
	String picture;
	String foode;
	String hunger;
	String boundaries;
	String location;

	public abstract void makeNoise();

	public abstract void eat();

	public void sleep() {
		System.out.println("Animals Sleep");
	}

	public abstract void roam();
}

abstract class Feline extends Animals {
	public abstract void roam();
}

abstract class Hippo extends Animals {
	public abstract void makeNoise();

	public abstract void eat();
}

abstract class Canine extends Animals {
	public abstract void roam();
}

class Lion extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Lion Makes Noise");
	}

	@Override
	public void eat() {
		System.out.println("Lion Eats");

	}

	@Override
	public void roam() {
		System.out.println("Lion Roams");

	}
}

class Tiger extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Tiger Makes Noise");
	}

	@Override
	public void eat() {
		System.out.println("Tiger Eats");

	}

	@Override
	public void roam() {
		System.out.println("Tiger Roams");

	}
}

class Cat extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Cat Makes Noise");
	}

	@Override
	public void eat() {
		System.out.println("Cat Eats");

	}

	@Override
	public void roam() {
		System.out.println("Cat Roams");

	}
}

class Dogs extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("Dog Makes Noise");
	}

	@Override
	public void eat() {
		System.out.println("Dog Eats");

	}

	@Override
	public void roam() {
		System.out.println("Dog Roams");

	}

}

class Wolf extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("Wolf Makes Noise");
	}

	@Override
	public void eat() {
		System.out.println("Wolf Eats");

	}

	@Override
	public void roam() {
		System.out.println("Wolf Roams");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.makeNoise();
		lion.eat();
		lion.sleep();
		lion.roam();
		Tiger tiger = new Tiger();
		tiger.makeNoise();
		tiger.eat();
		tiger.sleep();
		tiger.roam();
		Cat cat = new Cat();
		cat.makeNoise();
		cat.eat();
		cat.sleep();
		cat.roam();
		Dogs dogs = new Dogs();
		dogs.makeNoise();
		dogs.eat();
		dogs.sleep();
		dogs.roam();
		Wolf wolf = new Wolf();
		wolf.makeNoise();
		wolf.eat();
		wolf.sleep();
		wolf.roam();

	}

}

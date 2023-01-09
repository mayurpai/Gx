package day_5;

public class GameFour extends Thread {

	public GameFour() {
	}

	@Override
	public void run() {
		System.out.println("Run Called: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("MAIN");
		GameFour gOne = new GameFour();
		GameFour gTwo = new GameFour();
		GameFour gThree = new GameFour();
		GameFour gFour = new GameFour();
		gOne.setName("FIRST");
		gTwo.setName("SECOND");
		gThree.setName("THIRD");
		gFour.setName("FOURTH");
		// Priority : 0 (MIN_PRIORITY) - 10 (MAX_PRIORITY)
		gOne.setPriority(9);
//		gTwo.setPriority(10);
		gThree.setPriority(10);
//		gFour.setPriority(10);
		System.out.println("gOne: " + gOne.getPriority());
		System.out.println("gTwo: " + gTwo.getPriority());
		System.out.println("gThree: " + gThree.getPriority());
		System.out.println("gFour: " + gFour.getPriority());
		gOne.start();
		gTwo.start();
		gThree.start();
		gFour.start();
		System.out.println("Main: " + Thread.currentThread().getPriority());

		System.out.println("Main Called: " + Thread.currentThread().getName());
	}

}

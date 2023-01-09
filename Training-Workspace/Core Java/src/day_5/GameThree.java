package day_5;

public class GameThree extends Thread {

	public GameThree() {
	}

	@Override
	public void run() {
		System.out.println("Run Called: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("MAIN");
		GameThree gOne = new GameThree();
		gOne.setName("SOUND");
		GameThree gTwo = new GameThree();
		gTwo.setName("SCORE");
		// Priority : 0 (MIN_PRIORITY) - 10 (MAX_PRIORITY)
		gOne.setPriority(MIN_PRIORITY);
		gTwo.setPriority(MAX_PRIORITY);
		gOne.start();
		gTwo.start();

		System.out.println("Main Called: " + Thread.currentThread().getName());
	}

}

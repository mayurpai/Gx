package day_5;

public class YieldThread extends Thread {

	private int countDown = 3;
	private static int threadCount = 0;

	public YieldThread() {
		super("" + ++threadCount);
		start();
	}

	public String toString() {
		return "# " + getName() + " : " + countDown;
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new YieldThread();
		}

	}

}

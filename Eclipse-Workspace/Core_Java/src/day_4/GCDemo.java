package day_4;

class Orders {
	@Override
	// It Calls Whenever It Reclaims Any Object To Be Garbage Collected
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collected!");
	}
}

public class GCDemo {

	public static void main(String[] args) {
//		System.out.println("Main Called");

		Orders orderOne = new Orders();
		Orders orderTwo = new Orders();
		Orders orderThree = new Orders();
		Orders orderFour = orderOne;
		orderFour = null;
		orderTwo = null;
		System.gc();
	}

}

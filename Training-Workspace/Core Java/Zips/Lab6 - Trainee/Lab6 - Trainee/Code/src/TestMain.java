public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();

		int arg1 = 0;
		int arg2 = 0;



		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}

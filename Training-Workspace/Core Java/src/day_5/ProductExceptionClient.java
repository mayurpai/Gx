package day_5;

public class ProductExceptionClient {

	public static void main(String[] args) {
		try {
			ProductException productOne = new ProductException(1, "Mouse", 400, -300);
			System.out.println(productOne);
			ProductException productTwo = new ProductException(2, "Keyboard", -500, 900);
			System.out.println(productTwo);
			ProductException productThree = new ProductException(3, "Joystick", 100, 1200);
			System.out.println(productThree);
			productTwo.setPrice(999);
		} catch (NegativePriceException e) {
			System.out.println(e.getMessage());
		}
		catch (NegativeQohException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks For Using My Program! >_<");

	}

}

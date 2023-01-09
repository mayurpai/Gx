package day_4;

public class ProductClient {

	public static void main(String[] args) {
		Product productOne = new Product(1, "Mouse", 400, 300);
		Product productTwo = new Product(2, "Keyboard", 500, 900);
		Product productThree = new Product(3, "Joystick", 100, 1200);
		productTwo.setPrice(999);
//		System.out.println(product.toString()); == System.out.println(product); 
		System.out.println(productOne);
		System.out.println(productTwo);
		System.out.println(productThree);
		
	}

}

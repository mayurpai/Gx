package day_4;

public class ExceptionTest {

	public static int m(int i) {
		System.out.println("Apple");
		try {
			i++;
			int num = 1 / 0;
			System.out.println("Ball");
		} catch (Exception e) {
			i += 10;
			return i;
		} finally {
			i += 5;
			System.out.println("Dog");
			System.out.println(i);
			// You Cannot Return In Finally
		}
		i++;
		System.out.println("Cat");
		return i;
	}

	public static void main(String[] args) {
		System.out.println(m(0));
		System.out.println("Thanks For Using My Program!");

	}

}

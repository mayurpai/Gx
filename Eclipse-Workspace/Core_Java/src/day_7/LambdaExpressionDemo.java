package day_7;

// Lambda Expression Works Only With Functional Interface Which Has A Single Method
@FunctionalInterface
interface MathOperation {
	int operation(int numberOne, int numberTwo); // Single Method Only
}

class Calculations implements MathOperation {
	@Override
	public int operation(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		// First Way (Create Class And Override)
		Calculations calculations = new Calculations();
		System.out.println("Create Class And Override: " + calculations.operation(12, 121));

		// Second Way (Anonymous Classes)
		MathOperation mathOperation = new MathOperation() {

			@Override
			public int operation(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}
		};
		System.out.println("Anonymous Classes: " + mathOperation.operation(122, 23));

		// Third Way (Lambda Expression Without Type Declaration)
		// int operation(int numberOne, int numberTwo); Definition: = (numberOne,
		// numberTwo) -> numberOne + numberTwo;
		MathOperation lambdaMathOperationOne = (numberOne, numberTwo) -> numberOne + numberTwo;
		System.out.println("Lambda Expression Without Type Declaration: " + lambdaMathOperationOne.operation(150, 329));

		// Fourth Way (Lambda Expression With Type Declaration)
		MathOperation lambdaMathOperationTwo = (int numberOne, int numberTwo) -> numberOne + numberTwo;
		System.out.println("Lambda Expression With Type Declaration: " + lambdaMathOperationTwo.operation(10, 29));

		// Runnable Interface
		Runnable runnable = () -> System.out.println("Hello: " + Thread.currentThread().getName());
		Thread thread = new Thread(runnable);
		thread.start();
	}

}

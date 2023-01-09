package day_3;

public class X {
	static {
		System.out.println("X Static Called");
	}
	{
		System.out.println("X Instance Called");
	}

	public X() {
		System.out.println("X Default Constructor Called");
	}

}

package day_3;

public class W {
	X x = new X();
	static {
		System.out.println("W Static Called");
	}
	{
		System.out.println("W Instance Called");
	}

	public W() {
		System.out.println("W Default Constructor Called");
	}

}

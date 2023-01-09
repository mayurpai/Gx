package day_3;

public class Z {
	W w = new W();
	static {
		System.out.println("Z Static Called");
	}
	{
		System.out.println("Z Instance Called");
	}

	public Z() {
		System.out.println("Z Default Constructor Called");
	}

	public static void main(String[] args) {
		System.out.println("Z Main Called");
		new Z(); // It Calls For Instance/new Whichever Comes First (Except The Methods And
					// Blocks)
		new Z(); // Repeats The Sequence
	}

}

/*
 * Static Block Main Method Z Instance W Static W Instance W Constructor Z
 * Instance Z Constructor
 * 
 * Again:
 * 
 * W Instance W Constructor Z Instance Z Constructor
 */

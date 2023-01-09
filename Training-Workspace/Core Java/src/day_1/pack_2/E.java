package day_1.pack_2;

import day_1.pack_1.A;

public class E extends A {

	public void display() {
		System.out.println(i);
		A a = new A();
		System.out.println(a.i); // No Need To Create Object If You Are A Child In Protected
	}

}


public class VariableScope {
	int i = 10; // Instance Scope (i)
	static int j = 20; // Class Scope (j)



	public void accept() {
//		System.out.println(i);
//		System.out.println(j);
		i++;
		j++;
		int k = 30; // Local Scope (k)

		for (int p = 0; p < 10; p++) {
			// Block Scope (p)
		}
		{
			int q = 40; // Block Scope (q)
		}
	}


	public void display() {
		System.out.println(i);
		System.out.println(j);
	}

	public static void display_1() {
//		System.out.println(i); // Not Accessible
		System.out.println(j);
	}

	public static void main(String[] args) {
		VariableScope vs = new VariableScope();
		new VariableScope().accept();
		new VariableScope().display();
		vs.accept();
		vs.display();
		VariableScope vs_1 = new VariableScope();
		vs_1.accept();
		vs_1.display();
//		System.out.println(j);
//		System.out.println(vs.j);
//		System.out.println(vs_1.j);
//		System.out.println(VariableScope.j);

	}

}

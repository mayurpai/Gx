public class VariableScope {

  int i = 10; // Instance Scope (i)
  static int j = 20; // Class Scope (j)

  public void accept() {
    i++;
    j++;
    int k = 30; // Local Scope (k)

    for (int p = 0; p < 10; p++) {
      // Block Scope (p)
    }
//    System.out.println(p); 
    {
      int q = 40;
      // Block Scope (q)
    }
//    System.out.println(q);
  }

//  System.out.println(k); 

  public void display() {
    System.out.println(i);
    System.out.println(j);
  }

  public static void display_1() {
//    System.out.println(i);
    System.out.println(j);
  }

  public static void main(String[] args) {
    VariableScope vs = new VariableScope();
    vs.accept();
    vs.display();
    System.out.println(VariableScope.j);
    System.out.println(vs.j);
    System.out.println(j);
    VariableScope.display_1();
    display_1();
  }
}

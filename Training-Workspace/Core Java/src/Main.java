import day_1.finance.Payment;
import day_1.hr.Tax;

// import day_1.finance.*;

// Class Can Be Only Public / Default
class Main {

  int num = 10;

  private void accept() {
    System.out.println("Accept Called!");
    System.out.println(num);
  }

  public void display() {
    System.out.println("Display Called!");
    // accept();
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
    Main m = new Main();
    m.display();
    m.accept();
    Bye b = new Bye();
    b.hello();
    Customer c = new Customer();
    c.payBill();
    c.giveBill();
    Payment p = new Payment();
    p.salary();
    Tax t = new Tax();
    String names[] = { "A", "B" };
    Tax.main(names);
    t.tax();
  }
}

class Bye {

  int amount = 20;

  public void hello() {
    System.out.println("Bye Hello Called!");
  }

  public static void main(String args[]) {
    System.out.println("Bye Main Called!");
    Main m = new Main();
    String names[] = { "A", "B" };
    m.main(names);
    m.display();
    // m.accept(); // Not Accessible
  }
}

class Pay extends Bye {

  public void display() {
    System.out.println(amount);
  }
}

class Debt {

  public void display() {
    Bye b = new Bye();
    System.out.println(b.amount);
  }
}
